import LazyInitialization.LazyInitializedSingletone;
import org.junit.Assert;
import org.junit.Test;

public class LazyInitializationTestSuite {
    @Test
    public void testShowText() {
        //Given
        //When
        String result = LazyInitializedSingletone.getInstance().showText("example");
        //Then
        Assert.assertEquals("example", result);
    }
}
