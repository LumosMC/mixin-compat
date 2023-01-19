package enterprises.stardust.atlas.mixin.service.atlas;

import org.spongepowered.asm.service.IGlobalPropertyService;
import org.spongepowered.asm.service.IPropertyKey;

/**
 * @author xtrm
 */
public class Blackboard implements IGlobalPropertyService {
    @Override
    public IPropertyKey resolveKey(String name) {
        return null;
    }

    @Override
    public <T> T getProperty(IPropertyKey key) {
        return null;
    }

    @Override
    public void setProperty(IPropertyKey key, Object value) {

    }

    @Override
    public <T> T getProperty(IPropertyKey key, T defaultValue) {
        return null;
    }

    @Override
    public String getPropertyString(IPropertyKey key, String defaultValue) {
        return null;
    }
}
