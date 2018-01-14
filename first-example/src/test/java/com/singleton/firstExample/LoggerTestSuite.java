package com.singleton.firstExample;

import com.singleton.firstExample.logger.Logger;
import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        //Given
        Logger.getInstance().log("Test. Do you see me?");
        //When
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Test. Do you see me?", result);
    }
}
