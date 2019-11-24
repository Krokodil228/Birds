package com.company;

public class array
{
    public Birds[] GlobalArr;
    private int leght;
    private int lastindex = 0;

    public array(int l) {
        this.GlobalArr = new Birds[l];
        this.leght = l;
    }

    public void add(Birds b)
    {
        if (this.lastindex<this.GlobalArr.length) {
            this.GlobalArr[this.lastindex] = b;
            this.lastindex++;
        }
    }

    public void Say()
    {
        for (int i = 0; i < this.GlobalArr.length; i++)
        {
            GlobalArr[i].Say();
        }
    }

}