package io.minimum.minecraft.granitetest;

import org.granitemc.granite.api.Granite;
import org.granitemc.granite.api.plugin.Plugin;
import org.granitemc.granite.api.plugin.PluginContainer;

/**
 * This class contains the plugin.
 *
 * It requires an {@link org.granitemc.granite.api.plugin.Plugin} annotation so that Granite knows to load it.
 *
 * Unlike Bukkit, however, you are expected to initialize data state in your constructor.
 */
@Plugin(name = "GraniteTestPlugin", id = "testplugin", version = "0.1")
public class GraniteTestPlugin {
    /**
     * The constructor allows us to initialize our state.
     *
     * @param container a {@link org.granitemc.granite.api.plugin.PluginContainer}, which will be passed with this. This parameter is not required.
     */
    public GraniteTestPlugin(PluginContainer container) {
        Granite.getLogger().info("i can haz controls");

        // Register our event handler.
        container.registerEventHandler(new GraniteTestHandler());
    }
}
