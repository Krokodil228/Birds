package com.company;
import java.awt.*;//Импортируем библиотеку для вывода окна
import javax.swing.*;//Импортируем библиотеку для работы с окном

public class MyWindow extends JFrame
{
    private array f;
    public MyWindow(array f)//Задаем окно через массив

    {
        this.f = f;
        super.setTitle("Kur");//устанавливаем название окна(высвечивается сверху)
        this.setSize(1920, 1080);//устанавливаем размер
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Задаем функцию закрытие программы через закрытие окна
        this.setVisible(true);//устанавливаем видимость окна(без нее оно невыведется)
        this.getBackground();//Задаем задний фон, по дефолту - белый

    }
    public void paint(Graphics g)//задаем метод в котором будем работать с окном, переменная g, через которую будем
            //указывать команды программе (вывести линию, задать форму, цвет, шрифт и тд)
    {


        g.setColor(Color.BLUE);
        g.drawOval(100,100,60, 90);
       // g.fillOval(100, 100, 60, 90);
       // g.setColor(Color.BLACK);
       // g.fillOval(100, 175, 20, 20);
        //g.fillOval(140, 175, 20, 20);
        //g.drawLine(100, 130, 80, 160);
        //g.drawLine(160, 130, 180, 160);
        //g.setColor(Color.WHITE);
        //g.fillOval(110, 102, 40, 40);
        //g.drawOval(110, 102, 40, 40);
        //g.drawOval(100, 175, 20, 20);
        //g.drawOval(140, 175, 20, 20);
        //g.drawOval(115, 135, 30, 35);
        //g.fillOval(115, 135, 30, 35);
        //g.drawOval(115, 110, 10, 10);
        //g.drawOval(135, 110, 10, 10);
        //g.setColor(Color.RED);
        //g.fillOval(135, 110, 10, 10);
        //g.fillOval(115, 110, 10, 10);
        //g.drawString("Пингвиненок", 100, 220);//
    }
}
