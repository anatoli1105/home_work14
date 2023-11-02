import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Line();

 /*Напишите программу, которая определяет,
        является ли год високосным или нет.
Назовите year переменную года, в которую можно подставить значение интересующего нас года.
 Например, 2021.
Программа должна определять, високосный год или нет,
и выводить соответствующее сообщение: « …. год является високосным» или «... год не является високосным».
Небольшая справка: високосным является каждый четвертый год,
 но не является каждый сотый. Также високосным является каждый четырехсотый год.*/
        System.out.println("введите год ");
        int year = imputDatа();
        determineLeapYear(year);
        Line();
        /*задача про телефоны*/

        int clientDeviseYear = 2015;
        int yearPhone = 2012;
        int clientOS = 1;
        searchApplicationForPhone(yearPhone, clientOS);
        Line();
/*В банке для клиентов организовывается доставка карт на дом.
Чтобы известить клиента о том, когда будет доставлена его карта,
 нужно знать расстояние от офиса до адреса доставки.*/
        System.out.println("введите расстояние до адреса доставки");
        int deliveryDistance=imputDatа();
        calculateDeliveryTime(deliveryDistance);
        Line();


    }

    public static int imputDatа() {
        Scanner scanner=new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void calculateDeliveryTime(int deliveryDistance) {
        int countDay = 1;
        if (deliveryDistance > 100) {
            System.out.println("нет доставки");
        } else {
            if (deliveryDistance < 20) {
                System.out.println("Доставка в пределах 20 км занимает сутки.");
            } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
                countDay++;
                System.out.println("доставка займет " + countDay + " дня");

            } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
                countDay += 2;
                System.out.println("доставка займет " + countDay + " дня");
            }
        }
    }

    public static void searchApplicationForPhone(int yearPhone, int clientOS) {
        int clientDeviseYear = 2015;
        int OSForIOS = 0;
        int OSForAndroid = 1;
        if (clientOS == OSForIOS && yearPhone < clientDeviseYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке...");
        } else if (clientOS == OSForIOS && yearPhone >= clientDeviseYear) {
            System.out.println("Установите версию приложения для iOS по ссылке...");
        } else if (clientOS == OSForAndroid && yearPhone < clientDeviseYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке...");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке...");
        }
    }

        public static void determineLeapYear ( int year){
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " это високосный год");
            } else {
                System.out.println(year + " это не високосный год");
            }


        }

        public static void Line () {
            System.out.println("========================");
        }


}