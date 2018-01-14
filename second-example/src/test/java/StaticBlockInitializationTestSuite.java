import org.junit.Assert;
import org.junit.Test;
import staticBlockInitialization.StaticBlockInitalization;

public class StaticBlockInitializationTestSuite {
    @Test
    public void testSearchForWord() {
        //Given
        //When
        boolean result = StaticBlockInitalization.getInstance().searchForWord("ball");
        //Then
        Assert.assertTrue(result);
    }
}
