package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;
public class CashbackHackServiceJUnit4Test {

    @Test
    public void testMinSumPurchase() {
        CashbackHackService service = new CashbackHackService();
        int amountPurchase = 1;

        int expected = 999;
        assertEquals(expected, service.remain(amountPurchase));
    }

    @Test
    public void testLessBorder() {
        CashbackHackService service = new CashbackHackService();
        int amountPurchase = 999;

        int expected = 1;
        assertEquals(expected, service.remain(amountPurchase));
    }

    @Test
    public void testEqualsBorder() {
        CashbackHackService service = new CashbackHackService();
        int amountPurchase = 1000;

        int expected = 0;
        assertEquals(expected, service.remain(amountPurchase));
    }

    @Test
    public void testOverBorder() {
        CashbackHackService service = new CashbackHackService();
        int amountPurchase = 1001;

        int expected = 999;
        assertEquals(expected, service.remain(amountPurchase));
    }

    @Test
    public void testPurchaseNull() {
        CashbackHackService service = new CashbackHackService();
        int amountPurchase = 0;

        int expected = 1000;
        //не запланировано выброс исключения при нулевой сумме или валидация на сумму покупки
        assertEquals(expected, service.remain(amountPurchase));
    }

    @Test
    public void testMostPurchase() {
        CashbackHackService service = new CashbackHackService();
        int amountPurchase = 2_147_483_437;

        int expected = 563;
        assertEquals(expected, service.remain(amountPurchase));
    }
}