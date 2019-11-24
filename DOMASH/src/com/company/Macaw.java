package com.company;
import java.util.Scanner;
public class Macaw extends Birds
{
    String name = "Аноним Поп";

    public Macaw(String name)
    {
        System.out.println("Новый попугай "+ name);
        this.name = name;
    }
    public Macaw()
    {
        System.out.println("Новый попугай "+ this.name);
    }

    @Override
    public void Say()
    {
        System.out.println("Я Попуг "+ this.name +" и я таки умею летать");
    }
}
