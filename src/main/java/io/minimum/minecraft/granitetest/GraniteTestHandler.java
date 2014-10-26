package io.minimum.minecraft.granitetest;

import org.granitemc.granite.api.chat.ChatColor;
import org.granitemc.granite.api.chat.ChatComponentBuilder;
import org.granitemc.granite.api.event.On;
import org.granitemc.granite.api.event.player.EventPlayerJoin;

/**
 * This class contains our event handlers. There is just one simple one.
 */
public class GraniteTestHandler {
    /**
     * This is our {@link org.granitemc.granite.api.event.player.EventPlayerJoin} handler. It must be annotated with
     * {@link org.granitemc.granite.api.event.On} so Granite can register it.
     *
     * For simplicity, we are sending a message via Granite's chat component builder.
     *
     * @param event the event, this is required.
     */
    @On(event = EventPlayerJoin.class)
    public void onEventPlayerJoin(EventPlayerJoin event) {
        // This will send the actual message.
        event.getPlayer().sendMessage(new ChatComponentBuilder().text("Oow, that hurts!!!!").color(ChatColor.RED).build());
    }
}
