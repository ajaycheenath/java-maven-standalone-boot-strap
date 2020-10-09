package com.cheen.demo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DemoMainTest {

    @Test
    public void shouldAddTwoNumbers() {
        DemoMain demoMain = new DemoMain();
        Assert.assertEquals(demoMain.add(2, 5), 7);
    }

}