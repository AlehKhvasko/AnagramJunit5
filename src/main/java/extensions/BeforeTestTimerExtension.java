package extensions;

import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class BeforeTestTimerExtension implements BeforeAllCallback {
    @Override
    public void beforeAll(ExtensionContext extensionContext) throws Exception {
        extensionContext.getStore(ExtensionContext.Namespace.GLOBAL).put("start", System.nanoTime());
    }
}
