package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService cashBackHacker = new CashbackHackService();

    @Test
    public void lessLimitTest() {
        int amount = 800;
        int expected = 200;
        int actual = cashBackHacker.remain(amount);
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void exactlyLimitTest() {
        int amount = 1000;
        int expected = 0;
        int actual = cashBackHacker.remain(amount);
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void overLimitTest() {
        int amount = 1600;
        int expected = 400;
        int actual = cashBackHacker.remain(amount);
        Assert.assertEquals(actual, expected);

    }
}