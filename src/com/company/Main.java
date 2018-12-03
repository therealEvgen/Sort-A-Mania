package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SortCompetition team1 = new Team1SortCompetition();
        int[] randIntArr = randomIntsArr(10000);
        String[] randStringArr = randStringArr(10000,5);

        System.out.println("Unsorted");
        printArr(randIntArr);

        long time = System.currentTimeMillis();
        int median = team1.challengeOne(randIntArr);
        System.out.println("Challenge One Time Taken: " + time * .001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        printArr(randIntArr);
    }

    public static int[] randomIntsArr(int num)
    {
        int[] temp = new int[num];
        for(int i = 0; i < num; i ++)
        {
            temp[i] = (int)(Math.random()*num);
        }
        return temp;
    }

    public static String[] randStringArr(int num, int length)
    {
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] temp = new String[num];
        for(int i = 0; i < num; i ++)
        {
            String x = "";
            for(int j = 0; j < length; j ++)
            {
                x += alphabet[(int)(Math.random() * (alphabet.length-1))];
            }
            temp[i] = x;
        }
        return temp;
    }
    public static void printArr(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }
}
