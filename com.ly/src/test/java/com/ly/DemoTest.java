package com.ly;

import org.junit.Assert;
import org.junit.Test;

public class DemoTest {
    @Test
    public void testSay(){
        Demo demo=new Demo();
        String lyy = demo.say("lyy");
        Assert.assertEquals(" hellolyy",lyy);
    }
}
