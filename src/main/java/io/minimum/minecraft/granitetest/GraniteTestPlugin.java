package io.minimum.minecraft.granitetest;

import org.granitemc.granite.api.Granite;
import org.granitemc.granite.api.plugin.Plugin;
import org.granitemc.granite.api.plugin.PluginContainer;

@Plugin(name = "GraniteTestPlugin", id = "testplugin", version = "0.1")
public class GraniteTestPlugin {
    public GraniteTestPlugin(PluginContainer container) {
        Granite.getLogger().info("i can haz controls");
        container.registerEventHandler(new GraniteTestHandler());
    }
}
