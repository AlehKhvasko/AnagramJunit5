package extensions;

import org.junit.jupiter.api.extension.AfterAllCallback;

import org.junit.jupiter.api.extension.ExtensionContext;

public class AfterTestTimerExtension implements AfterAllCallback {
    @Override
    public void afterAll(ExtensionContext extensionContext) throws Exception {
        Long start = (Long) extensionContext.getStore(ExtensionContext.Namespace.GLOBAL).get("start");
        System.out.println();
        System.out.printf(" %.3f sec. \n",((double)(System.nanoTime() - start))/1000000000);
    }
}
