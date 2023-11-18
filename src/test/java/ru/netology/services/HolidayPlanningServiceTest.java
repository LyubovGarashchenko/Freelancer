package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HolidayPlanningServiceTest {
    @Test
    public void testHolidayPlanning1() {
        HolidayPlanningService service = new HolidayPlanningService();
        int actual = service.calculate(10_000, 3_000, 20_000);
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testHolidayPlanning2() {
        HolidayPlanningService service = new HolidayPlanningService();
        int actual = service.calculate(100_000, 600_000, 150_000);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}