package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class HolidayPlanningServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/freelancer.csv")
    public void testHolidayPlanning1(int expected, int income, int expenses, int threshold) {
        HolidayPlanningService service = new HolidayPlanningService();
        int actual = service.calculate(income, expenses, threshold);
//        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }
}
 //   @Test
 //   public void testHolidayPlanning2() {
 //      HolidayPlanningService service = new HolidayPlanningService();
//      int actual = service.calculate(100_000, 600_000, 150_000);
//       int expected = 0;

//        Assertions.assertEquals(expected, actual);
//    }
//}