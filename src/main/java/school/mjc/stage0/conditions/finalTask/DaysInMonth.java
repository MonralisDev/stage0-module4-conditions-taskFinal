package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        // Перевірка валідності року
        if (year < 0) {
            System.out.println("invalid date");
            return;
        }

        // Перевірка валідності місяця
        if (month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }

        // Визначення кількості днів у місяці
        int daysInMonth;
        switch (month) {
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:
                // Перевірка на високосний рік
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            default:
                daysInMonth = 31;
                break;
        }

        // Виведення результату
        System.out.println(daysInMonth);
    }
}