package btw.community.translucency;

import btw.AddonHandler;
import btw.BTWAddon;

public class TranslucencyAddon extends BTWAddon {
    private static TranslucencyAddon instance;

    private TranslucencyAddon() {
        super("Translucency", "1.0.0", "");
    }

    @Override
    public void initialize() {
        AddonHandler.logMessage(this.getName() + " Version " + this.getVersionString() + " Initializing...");
    }

    public static TranslucencyAddon getInstance() {
        if (instance == null)
            instance = new TranslucencyAddon();
        return instance;
    }
}
