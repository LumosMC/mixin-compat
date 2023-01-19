package enterprises.stardust.atlas.mixin.launch.platform;

import org.spongepowered.asm.launch.platform.IMixinPlatformServiceAgent;
import org.spongepowered.asm.launch.platform.MixinPlatformAgentAbstract;
import org.spongepowered.asm.launch.platform.container.IContainerHandle;

import java.util.Collection;

public class MixinPlatformAgentAtlas extends MixinPlatformAgentAbstract implements IMixinPlatformServiceAgent {
    @Override
    public void init() {

    }

    @Override
    public String getSideName() {
        return null;
    }

    @Override
    public Collection<IContainerHandle> getMixinContainers() {
        return null;
    }
}
