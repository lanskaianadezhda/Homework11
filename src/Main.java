import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //task 1
        System.out.println("Задача 1");
        printLeapYear(2020);
    }

    public static void printLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
        //task 2
        System.out.println("Задача 2");
        printRecommendedAppVersion(1, 2014);
    }

    public static void printRecommendedAppVersion(int deviceType, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (deviceYear < currentYear && deviceType == 0) {
            System.out.println("Установите облегченную версию приложения для iOS  по ссылке");
        } else if (deviceYear >= currentYear && deviceType == 0) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (deviceYear < currentYear && deviceType == 1) {
            System.out.println("Установите облегченную версию приложения для Android  по ссылке");
        } else {
            System.out.println("Установите обычную версию приложения для Android по ссылке");

        }
        //task 3
        System.out.println("Задача 3");
        calculateDeliveryDays(22);
    }

    public static int calculateDeliveryDays(int distance) {
        if (distance < 20) {
            return 1;
        } else if (distance >= 20 && distance < 60) {
            return 2;
        } else if (distance >= 60 && distance < 100) {
            return 3;
        } return -1;
    }
}