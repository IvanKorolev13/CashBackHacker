package ru.netology.service;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void testMinSumPurchase() {
        CashbackHackService service = new CashbackHackService();
        int amountPurchase = 1;

        int expected = 999;
        assertEquals(service.remain(amountPurchase), expected);
    }

    @Test
    public void testLessBorder() {
        CashbackHackService service = new CashbackHackService();
        int amountPurchase = 999;

        int expected = 1;
        assertEquals(service.remain(amountPurchase), expected);
    }

    @Test
    public void testEqualsBorder() {
        CashbackHackService service = new CashbackHackService();
        int amountPurchase = 1000;

        int expected = 0;
        assertEquals(service.remain(amountPurchase), expected);
    }

    @Test
    public void testOverBorder() {
        CashbackHackService service = new CashbackHackService();
        int amountPurchase = 1001;

        int expected = 999;
        assertEquals(service.remain(amountPurchase), expected);
    }

    @Test
    public void testPurchaseNull() {
        CashbackHackService service = new CashbackHackService();
        int amountPurchase = 0;

        int expected = 1000;
        //не запланировано выброс исключения при нулевой сумме или валидация на сумму покупки
        assertEquals(service.remain(amountPurchase), expected);
    }

    @Ignore
    @Test
    public void testNegativeAmount() {
        CashbackHackService service = new CashbackHackService();
        int amountPurchase = -1;

        //не запланировано выброс исключения при отрицательной сумме или валидация на сумму покупки
        //assertThrows(ThrowingRunnable.);
    }

    @Test
    public void testMostPurchase() {
        CashbackHackService service = new CashbackHackService();
        int amountPurchase = 2_147_483_437;

        int expected = 563;
        assertEquals(service.remain(amountPurchase), expected);
    }
}