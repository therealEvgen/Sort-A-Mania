package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        SortCompetition team13 = new Team13SortCompetition();
        int[] randIntArr = randomIntsArr(10000);
        String[] randStringArr = randStringArr(10000,5);

        System.out.println("Unsorted");
        printArr(randIntArr);

        long time = System.currentTimeMillis();
        int median = team13.challengeOne(randIntArr);
        System.out.println("Challenge One Time Taken: " + time * .001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        printArr(randIntArr);

        int[][] multiDimensionalArr = new int[1000][1000];
        for (int i = 0; i < multiDimensionalArr.length; i ++) {
            multiDimensionalArr[i] = randomIntsArr(1000);
        }
        time = System.currentTimeMillis();
        median = team13.challengeFour(multiDimensionalArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge Four Time Taken: " + time * 0.001 + " seconds.");
        System.out.println("The median is " + median);
        team13.addTime(time);


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
    public static int[][] multiDimensionalArr(int count)
    {
        int[][] arr = new int[count][count];
        for (int i = 0; i < count; i++)
        {
            for (int j = 0; j < count; j++)
            {
                arr[i][j] = (int) (Math.random() * count);
            }
        }
        return arr;
    }
    public static void printArr(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }
}
