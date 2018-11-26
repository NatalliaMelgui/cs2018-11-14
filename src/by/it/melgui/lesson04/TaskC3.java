package by.it.melgui.lesson04;

/*
Вывести таблицу умножения 10 x 10 (двоныйм циклом),
но вывод должен быть словами:

Ожидаемый вывод:
два умножить на два равно четыре
два умножить на три равно шесть
два умножить на четыре равно восемь
два умножить на пять равно десять
два умножить на шесть равно двенадцать
два умножить на семь равно четырнадцать
два умножить на восемь равно шестнадцать
два умножить на девять равно восемнадцать
два умножить на десять равно двадцать
три умножить на два равно шесть
три умножить на три равно девять
три умножить на четыре равно двенадцать
...
и т.д. до фразы
...
десять умножить на десять равно сто
*/

public class TaskC3 {
    public static void main(String[] args) {
        for (int i = 2; i <=10; i++)
            for (int j = 2; j <= 10; j++)
            System.out.println(str(i)+"*"+str(j)+"="+str(i*j));

    }


    private static String str(int i){
        switch (i){
            case 1: return "один";
            case 2: return "два";
            case 3: return "три";
            case 4: return "четыре";
            case 5: return "пять";
            case 6: return "шесть";
            case 7: return "семь";
            case 8: return "восемь";
            case 9: return "один";
            case 10: return "один";
            case 11: return "один";
            case 12: return "один";
            case 13: return "один";
            case 14: return "один";


            case 19: return "девятнадцать";
        }
        int mod=i%10;
        String end=mod==0?"":" "+str(mod);
        switch (i/10){
            //case 2: return "двадцать"+
        }

        return "null";
    }
}
