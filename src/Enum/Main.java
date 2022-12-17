package Enum;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите номер месяца от 1 до 12, где 1 - Январь, а 12 - Декабрь");
        int selection = console.nextInt();
            switch (selection) {
                case 1:
                    System.out.println(Mounths.Январь);
                    break;
                case 2:
                    System.out.println(Mounths.Февраль);
                    break;
                case 3:
                    System.out.println(Mounths.Март);
                    break;
                case 4:
                    System.out.println(Mounths.Апрель);
                    break;
                case 5:
                    System.out.println(Mounths.Май);
                    break;
                case 6:
                    System.out.println(Mounths.Июнь);
                    break;
                case 7:
                    System.out.println(Mounths.Июль);
                    break;
                case 8:
                    System.out.println(Mounths.Август);
                    break;
                case 9:
                    System.out.println(Mounths.Сентябрь);
                    break;
                case 10:
                    System.out.println(Mounths.Октябрь);
                    break;
                case 11:
                    System.out.println(Mounths.Ноябрь);
                    break;
                case 12:
                    System.out.println(Mounths.Декабрь);
                    break;
            }


    }
}
