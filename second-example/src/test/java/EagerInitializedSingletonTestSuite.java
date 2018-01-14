import eagerInitialization.EagerInitializedSingleton;
import org.junit.Assert;
import org.junit.Test;

public class EagerInitializedSingletonTestSuite {
    @Test
    public void testGetInstance() {
        //Given
        //When
        String result = EagerInitializedSingleton.getInstance().showLog("Test log");
        //Then
        Assert.assertEquals("Test log", result);
    }
}
