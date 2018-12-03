package com.company;

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
        String[] temp = new String[num];
        for(int i = 0; i < num; i ++);
    }

}
