package com.username.bot;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

import com.username.bot.listeners.ReadyListener;

public class Bot {
    public static void main(String[] args) throws Exception {
        String token = System.getenv("DISCORD_TOKEN"); // Tokeni .env veya environment değişkeni ile al

        JDABuilder builder = JDABuilder.createDefault(token);
        builder.enableIntents(GatewayIntent.GUILD_MESSAGES, GatewayIntent.MESSAGE_CONTENT);

        // Event listener ekle
        builder.addEventListeners(new ReadyListener());

        builder.setActivity(Activity.playing("Discord bot hazır!"));
        builder.build();
    }
}
