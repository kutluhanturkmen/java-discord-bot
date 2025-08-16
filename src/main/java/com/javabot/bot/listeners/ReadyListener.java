package com.username.bot.listeners;

import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ReadyListener extends ListenerAdapter {
    @Override
    public void onReady(ReadyEvent event) {
        System.out.println(event.getJDA().getSelfUser().getAsTag() + " olarak giriş yapıldı!");
    }
}
