package com.example.resourcesearch.model

import kotlinx.coroutines.channels.Channel

class Cycler(
    val extractor: Extractor,
    val stasher: Stash,
    val resource: Resource,
) {
    private val channel = Channel<Int>(Channel.BUFFERED)
    suspend fun start() {
        extractor.toggleExtracting()
        stasher.setStatus()
        while (true) {
            println("-------------------- In Cycler --------------------")
            if (extractor.isExtracting() && !stasher.isStashing()) {
                if (!resource.isMoving() && !resource.isAtStash()) {
                    resource.move()
                }
                if (resource.isAtStash()) {
                    channel.send(1)
                    resource.view.y = resource.initialPosition
                    if (stasher.getResource() == stasher.getCapacity()) {
                        stasher.setStatus()
                    }
                }
            }
        }
    }

}