package by.it.melgui.lesson04;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
Напишите программу которая спрашивает у пользователя:
Какую вы хотите зарплату в $$$?

После ввода суммы, программа анализирует полученное значение
и если введенная цифра меньше 300 или больше 3000 программа выводит на экран:
Мы вам перезвоним!

Иначе выводит в цикле по переменной int month от 0 до 14 рассчитанную зарплату.
В летние месяцы - выводится введенная сумма с названием месяца.
В несуществующие месяцы 0, 13 и 14 выводится сумма в $0.0
в остальные месяцы выводится указанная сумма с премией в 50%.

Сделайте так, чтобы в тот месяц, когда получилась зарплата в $666 цикл после вывода прерывался.

Пример работы программы (у вас должно быть так же, до символа):

Какую вы хотите зарплату в $$$?
2000
За месяц 0 начислено $0.0
За январь начислено $3000.0
За февраль начислено $3000.0
За март начислено $3000.0
За апрель начислено $3000.0
За май начислено $3000.0
За июнь начислено $2000.0
За июль начислено $2000.0
За август начислено $2000.0
За сентябрь начислено $3000.0
За октябрь начислено $3000.0
За ноябрь начислено $3000.0
За декабрь начислено $3000.0
За месяц 13 начислено $0.0
За месяц 14 начислено $0.0

*/
public class TaskC1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую вы хотите зарплату в $$$?");
        int zzz = scanner.nextInt();
        if (zzz < 300 || zzz > 3000)
            System.out.println("Мы вам перезвоним!\n");
        else {
            for (int month = 0; month <= 14; month ++){
                double pay = zzz * 1.5;
                if (month < 1 || month > 12)
                    pay = 0;
                else if (month > 5 && month < 9)
                    pay = zzz;
                String name;
                name = getMonth (month);
                System.out.println("За "+name+" начислено $"+pay);
                if (pay==666) break;
        }
    }


}

    private static String getMonth(int month) {
        return "";
    }
    }
