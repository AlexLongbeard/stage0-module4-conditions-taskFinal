package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        byte leapYear=2;
        if (year<=0 && (month<1 || month>12)) {
            System.out.println("invalid date");
        }
        else if (year%4!=0) {
            leapYear = 0;
        }
        else if (year%100!=0) {
            leapYear = 1;
        }
        else if (year%400!=0) {
            leapYear = 0;
        }
        else {
            leapYear = 1;
        }
        if (leapYear==1 && month==2) {
            System.out.println("29");
        }
        else if (leapYear==0 && month==2) {
            System.out.println("28");
        }
        else {
            switch (month) {
                case (1), (3), (5), (7), (8), (10), (12) -> System.out.println("31");
                case (4), (6), (9), (11) -> System.out.println("30");
            }
            }
    }
}
