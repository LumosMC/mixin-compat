package enterprises.stardust.atlas.mixin.obfuscation;

import org.spongepowered.tools.obfuscation.interfaces.IMixinAnnotationProcessor;
import org.spongepowered.tools.obfuscation.service.IObfuscationService;
import org.spongepowered.tools.obfuscation.service.ObfuscationTypeDescriptor;

import java.util.Collection;
import java.util.Set;

public class AtlasObfuscationService implements IObfuscationService {
    @Override
    public Set<String> getSupportedOptions() {
        return null;
    }

    @Override
    public Collection<ObfuscationTypeDescriptor> getObfuscationTypes(IMixinAnnotationProcessor ap) {
        return null;
    }
}
