import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        checkLeapYear(2021);

        // Задача 2
        recommendAppVersion(0, 2014);
        recommendAppVersion(1, 2016);

        // Задача 3
        int deliveryDistance = 95;
        System.out.println("Потребуется дней: " + calculateDeliveryDays(deliveryDistance));
    }

    // Задача 1: проверка високосного года
    public static void checkLeapYear(int year) {
        boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
        if (isLeapYear) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    // Задача 2: рекомендация версии приложения
    public static void recommendAppVersion(int osType, int deviceYear) {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear(); // Получаем текущий год

        String os = (osType == 0) ? "iOS" : "Android";
        String message;

        if (deviceYear < 2015) {
            message = "Установите облегчённую версию приложения для " + os + " по ссылке.";
        } else {
            message = "Установите приложение для " + os + " по ссылке.";
        }

        System.out.println(message);
    }

    // Задача 3: расчёт дней доставки
    public static int calculateDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            throw new IllegalArgumentException("Доставка на расстояние более 100 км не предусмотрена");
        }
    }
}