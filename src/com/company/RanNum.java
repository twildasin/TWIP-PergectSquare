package com.company;

/**
 * Created by tw073 on 10/9/18.
 */
public class RanNum {

    public int ran = 0;

    public RanNum()
    {
        ran = (int) (Math.random() * 100.0);
    }
    public int PerfectRandom()
    {
        int num = (int) Math.pow(ran, 2);
        return num;
    }
}
