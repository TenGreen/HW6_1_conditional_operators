public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int operatingSystemVersion = 1;
        switch (operatingSystemVersion) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Приложение для вашй операционной системы находится в разработке");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int operatingSystemVersion = 1;
        int clientDeviceYear = 2010;
        switch (operatingSystemVersion) {
            case 0:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            default:
                System.out.println("Приложение для вашей операционной системы находится в разработке");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int year = 2021;
        if (((year%4==0 )&&(year%100!=0)) || (year%400==0)) {
            System.out.println ( year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 80;
        int deliveryTime = 0;
        if (deliveryDistance>100) {
            System.out.println("Доставка по вашему адресу производится по отдельной договоренности");
        } else {
            deliveryTime = (deliveryDistance/40 + 1);
            System.out.println("Потребуется дней: " + deliveryTime);
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber =12;
        int season = ((monthNumber/3)%4 + ((monthNumber-1)/12)*4);
        switch (season) {
            case 0:
                System.out.println("Время года зима");
                break;
            case 1:
                System.out.println("Время года весна");
                break;
            case 2:
                System.out.println("Время года лето");
                break;
            case 3:
                System.out.println("Время года осень");
                break;
            default:
                System.out.println("Номер месяца не может быть больше 12");
        }
    }
}


