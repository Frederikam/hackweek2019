package com.frederikam.hackweek2019

import net.dv8tion.jda.api.entities.Guild
import net.dv8tion.jda.api.entities.Message
import net.dv8tion.jda.api.entities.TextChannel
import net.dv8tion.jda.api.sharding.ShardManager

data class CommandContext(val jda: ShardManager, val message: Message) {
    val guild: Guild get() = message.guild
    val channel: TextChannel get() = message.channel as TextChannel
}