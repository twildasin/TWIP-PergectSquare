package com.company;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.ObjectStreamException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //RanNum one = new RanNum();
        //System.out.println(one.PerfectRandom());
        Scanner kbin = new Scanner(System.in);
        RanNum in;
        String name;
        String dec;
        String end = "";
        int out = 0;

        System.out.println("Welcome user, please input your name:");
        name = kbin.nextLine();

        while(true)
        {
            in = new RanNum();
            out = in.PerfectRandom();
            System.out.println("Nice to meet you " + name +", your lucky number is: " + out);
            String temp = name + ": " + out;
            end += ("\n" + temp);

            System.out.println("\nWould you like to:\n0 - Exit\n1 - Get a list of all stored names and numbers\n2 - Enter a new name and number");
            while(true)
            {
                dec = kbin.nextLine();
                if(Objects.equals(dec, "0"))
                {
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                }
                else if(Objects.equals(dec, "1"))
                {
                    System.out.println("Printing List...");
                    System.out.println(end);
                    System.exit(0);
                    break;
                }
                else if(Objects.equals(dec, "2"))
                {
                    break;
                }
                else
                {
                    System.out.println("Invalid Input, please input a \"0\", \"1\", or \"2\"");
                }

            }
            System.out.println("\nPlease input another name:");
            name = kbin.nextLine();
        }

    }
}
