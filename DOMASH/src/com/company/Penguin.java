package com.company;
import java.awt.*;
import java.util.Scanner;
public class Penguin extends Birds {
    public String name = "Аноним Пин";

    public Penguin(String name)
    {
        System.out.println("Новый пингвин "+ name);
        this.name = name;
    }

    public Penguin()
    {
        System.out.println("Новый пингвин "+ this.name);
    }

    @Override
    public void Say()
    {
        System.out.println("Я Пингвинчик "+ this.name+ " и я не умею летать");
    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.drawOval(50,60,30, 90 );
    }
}
