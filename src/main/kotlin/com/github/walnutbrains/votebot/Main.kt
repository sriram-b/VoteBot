package com.github.walnutbrains.votebot

import me.aberrantfox.kjdautils.api.startBot

fun main(args: Array<String>) {
    // example starting code from KUtils Wiki
    val token = args.firstOrNull();

    if(token == null || token == "UNSET") throw IllegalArgumentException("Invalid Token!")

    startBot(token) {
        configure {
            prefix = "+"
        }
    }
}