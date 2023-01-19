package enterprises.stardust.atlas.mixin.service.atlas;

import org.spongepowered.asm.service.IMixinServiceBootstrap;
import org.spongepowered.asm.service.ServiceInitialisationException;

public class MixinServiceAtlasBootstrap implements IMixinServiceBootstrap {
    @Override
    public String getName() {
        return "Atlas Framework";
    }

    @Override
    public String getServiceClassName() {
        return "enterprises.stardust.atlas.mixin.service.atlas.MixinServiceAtlas";
    }

    @Override
    public void bootstrap() {
        try {
            // Load AtlasFramework/Loader/TransformerService
        } catch (Throwable th) {
            throw new ServiceInitialisationException(this.getName() + " is not available");
        }
    }
}
