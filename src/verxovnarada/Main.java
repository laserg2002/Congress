package verxovnarada;

import verxovnarada.Congress;
import verxovnarada.Deputat;

import java.util.Collection;
import java.util.Scanner;
import java.util.TreeSet;

import static verxovnarada.Congress.addFractionByName;


/**
 * Created by ссс on 26.06.2017.
 */
public class Main {
    public static TreeSet<Deputat> vrAll;
    public static Congress vr;

    public static void inputStartData() throws InterruptedException{

        Collection<Fraction> vrFractionsList= vr.getFractionsList();

        Fraction f1 = vr.addFraction("Блок Петра Порошенка");
        Fraction f2 = vr.addFraction("Самопоміч");
        Fraction f3 = vr.addFraction("Опозиційний блок");
        Fraction f4 = vr.addFraction("Народний фронт");
        Fraction f5 = vr.addFraction("БЮТ");


         Deputat d11 =   new Deputat("Юлія", "Тимошенко", 55,60,160);
        vr.registrDeputat(d11);
        Deputat d12 =  new Deputat("Семен", "Семенченко", 55,60,160);
        vr.registrDeputat(d12);
        Deputat d13 =  new Deputat("Юрій", "Луценко", 55,60,160);
        vr.registrDeputat(d13);
        Deputat d14 =  new Deputat("Михайло", "Поплавський", 55,60,160);
        vr.registrDeputat(d14);
        Deputat d15 =  new Deputat("Дмитро", "Добродомов", 55,60,160);
        vr.registrDeputat(d15);
        Deputat d16 =  new Deputat("Оксана", "Юринець", 55,60,160);
        vr.registrDeputat(d16);
        Deputat d17 =  new Deputat("Богдан", "Дубневич", 55,60,160);
        vr.registrDeputat(d17);
        Deputat d18 =  new Deputat("Ярослав", "Дубневич", 55,60,160);
        vr.registrDeputat(d18);
        Deputat d19 =  new Deputat("Володимир", "Парасюк", 55,60,160);
        vr.registrDeputat(d19);
        Deputat d20 =  new Deputat("Сергій", "Ківалов", 55,60,160);
        vr.registrDeputat(d20);
        Deputat d21 =  new Deputat("Віталій", "Хомутиннік", 55,60,160);
        vr.registrDeputat(d21);
        Deputat d22 =  new Deputat("Дмитро", "Добкін", 55,60,160);
        vr.registrDeputat(d22);
        Deputat d23 =  new Deputat("Анатолій", "Гіршфельд", 55,60,160);
        vr.registrDeputat(d23);
        Deputat d24 =  new Deputat("Роман", "Мацола", 55,60,160);
        vr.registrDeputat(d24);
        Deputat d25 =  new Deputat("Олександр", "Герега", 55,60,160);
        vr.registrDeputat(d25);
        Deputat d26 =  new Deputat("Леонід", "Ємець", 55,60,160);
        vr.registrDeputat(d26);
        Deputat d27 =  new Deputat("Тетяна", "Чорновол", 55,60,160);
        vr.registrDeputat(d27);
        Deputat d28 =  new Deputat("Вікторія", "Сюмар", 55,60,160);
        vr.registrDeputat(d28);
        Deputat d29 =  new Deputat("Андрій", "Парубій", 55,60,160);
        vr.registrDeputat(d29);
        Deputat d30 =  new Deputat("Віктор", "Пинзеник", 55,60,160);
        vr.registrDeputat(d30);
        Deputat d31 =  new Deputat("Мустафа", "Джемільов", 55,60,160);
        vr.registrDeputat(d31);
        Deputat d32 =new Deputat("Ольга", "Богомолець", 55,60,160);
        vr.registrDeputat(d32);
        Deputat d33 =new Deputat("Сергій", "Лещенко", 55,60,160);
        vr.registrDeputat(d33);
        Deputat d34 =new Deputat("Мустафа", "Найєм", 55,60,160);
        vr.registrDeputat(d34);
        Deputat d35 =new Deputat("Анатолій", "Матвієнко", 55,60,160);
        vr.registrDeputat(d35);
        Deputat d36 =new Deputat("Оксана", "Білозір", 55,60,160);
        vr.registrDeputat(d36);
        Deputat d37 =new Deputat("Оксана", "Сироїд", 55,60,160);
        vr.registrDeputat(d37);
        Deputat d38 =new Deputat("Нестор", "Шуфрич", 55,60,160);
        vr.registrDeputat(d38);
        Deputat d39 =new Deputat("Олександр", "Вілкул", 55,60,160);
        vr.registrDeputat(d39);

//        Пробуємо ввести дублікати
        vr.registrDeputat(new Deputat("Нестор", "Шуфрич", 55,60,160));
        vr.registrDeputat(new Deputat("Олександр", "Вілкул", 55,60,160));

        System.out.println("Друкуємо всю Верховну Раду:");
        vr.printVerhovnaRadaAll();
        System.out.println("Друкуємо вcі фракції:");
        vr.printFractions();
        Thread.sleep(6000);

        vr.moveDeputatToFraction(d39,f3);
        vr.moveDeputatToFraction(d38,f3);
        vr.moveDeputatToFraction(d21,f3);
        vr.moveDeputatToFraction(d22,f3);
        vr.moveDeputatToFraction(d23,f3);

        vr.moveDeputatToFraction(d13,f1);
        vr.moveDeputatToFraction(d17,f1);
        vr.moveDeputatToFraction(d18,f1);
        vr.moveDeputatToFraction(d27,f1);
        vr.moveDeputatToFraction(d33,f1);
        vr.moveDeputatToFraction(d34,f1);

        vr.moveDeputatToFraction(d37,f2);
        vr.moveDeputatToFraction(d19,f2);
        vr.moveDeputatToFraction(d12,f2);


        vr.moveDeputatToFraction(d26,f4);
        vr.moveDeputatToFraction(d30,f4);
        vr.moveDeputatToFraction(d36,f4);

        vr.moveDeputatToFraction(d11,f5);
        vr.moveDeputatToFraction(d25,f5);
        vr.moveDeputatToFraction(d14,f5);

        vr.printVerhovnaRadaAll();

        Thread.sleep(6000);

        System.out.println("Забираєм Герегу з Народного Фронта");

        vr.justRemoveDeputatFromFraction(f4,d25);

        System.out.println("Забираєм Герегу з БЮТ");

        vr.justRemoveDeputatFromFraction(f5,d25);

        vr.printVerhovnaRadaAll();


//        vrFractionsList.
        Thread.sleep(6000);

        d11.setXabarAmount(2000);
        d12.setXabarAmount(3000);
        d13.setXabarAmount(1500);
        d14.setXabarAmount(2200);
        d15.setXabarAmount(2600);
        d16.setXabarAmount(3100);
        d39.setXabarAmount(3100);
        d18.setXabarAmount(2400);
        d19.setXabarAmount(2300);

        System.out.println();
        System.out.println("Друкуєм всіх хабарників в блоці:");
        f1.printAllXabarnyk();
        f1.printBiggestXabarnyk();

        System.out.println();
        System.out.println("Друкуєм всіх хабарників в блоці:");
        f5.printAllXabarnyk();
        f5.printBiggestXabarnyk();

        Thread.sleep(6000);
    }

    public static void main(String[] args) throws InterruptedException{
        vr = Congress.getVerhovnaRada();
        Main.inputStartData();
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (true) {
            System.out.println();
            System.out.println("Введіть 1 щоб добавити фракцію");
            System.out.println("Введіть 2 щоб видалити фракцію");
            System.out.println("Введіть 3 щоб очистити фракцію");
            System.out.println("Введіть 4 щоб вивести фракції");
            System.out.println("Введіть 5 щоб вивести фракцію");
            System.out.println("Введіть 6 щоб додати депутата в фракцію");
            System.out.println("Введіть 7 щоб видалити депутата з фракції");
            System.out.println("Введіть 8 щоб вивести список хабарників");
            System.out.println("Введіть 9 щоб вивести найбільшого хабарника");
            System.out.println("Введіть 0 для виходу");
            i=scanner.nextInt();
            switch (i) {
                case 1:
                    vr.addFractionByName();
                    break;
                 case 2:
                     vr.removeFraction();
                    break;
                 case 3:
                     vr.clearFraction();
                     break;
                 case 4:
                     vr.printFractions();
                    break;
                 case 5:
                     vr.printFractionByName();
                    break;
                 case 6:
                     vr.moveDeputatToFractionByName();
                    break;
                 case 7:
                     vr.removeDeputatFromFraction();
                    break;
                 case 8:
                     vr.printAllXabarnykVR();
                    break;
                 case 9:
                     vr.printBiggestXabarnyk();
                    break;
                 case 0:
                    return;

            }

        }

    }
}
