package com.company;


import javax.swing.*;
import java.util.Scanner;
//Задачи для программы 1) Создать отдельные виды птиц, -Попугай -Пингвин + добавить к ним функции(методы) для того
//чтобы они ожили (Я Пингвин, я Попугай). 2)создать уникальный номер для каждой птицы и поместить их в массив, номер
//выдается случайно и выводится на экран вместе с их фразой. 3)Образовать стаи и вывести количество птиц в определенной
//стае, (посчитать через цикл) ++. 4)Не умереть пока пишешь это
public class Main
{
    public static void main(String[] args)
    {
        /*System.out.println("Введите количество птиц");
        Scanner sc = new Scanner(System.in);
        int Count = sc.nextInt();

        array array = new array(Count);

        for (int i = 0; i < Count; i++)
        {
            System.out.println("Введите птицу 0 - пингвин 1 - попугай");
            switch (sc.nextInt())
            {
                case 0: array.add(new Penguin()); break;
                case 1: array.add(new Macaw()); break;
                default: i--;
            }
        }

        array.Say();*/

        array f = new array(0);
        MyWindow s = new MyWindow(f);
    }

}