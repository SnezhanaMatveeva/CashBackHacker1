package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();


    @Test
    public void testRemain() {
        int actual = service.remain(825);
        int expected = 175;
        assertEquals(actual, expected);
    }

    @Test
    public void testRemain1() {
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void testRemain2() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void testRemain3() {
        int actual = service.remain(1100);
        int expected = 900;
        assertEquals(actual, expected);
    }

    @Test
    public void testRemain4() {
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(actual, expected);
    }
}