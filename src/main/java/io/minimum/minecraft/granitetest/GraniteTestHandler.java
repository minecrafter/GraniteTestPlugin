package io.minimum.minecraft.granitetest;

import org.granitemc.granite.api.chat.ChatColor;
import org.granitemc.granite.api.chat.ChatComponentBuilder;
import org.granitemc.granite.api.event.On;
import org.granitemc.granite.api.event.player.EventPlayerJoin;

public class GraniteTestHandler {
    @On(event = EventPlayerJoin.class)
    public void onEventPlayerJoin(EventPlayerJoin event) {
        event.getPlayer().sendMessage(new ChatComponentBuilder().text("Oow, that hurts!!!!").color(ChatColor.RED).build());
    }
}
