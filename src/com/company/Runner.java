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

        System.out.println();
        System.out.println("Challenge 2");
        String[] two = randStringArr(10000, 5);
        printStringArr(two);
        time = System.currentTimeMillis();
        System.out.println("Unsorted");
        System.out.println(team13.challengeTwo(two, "abcde"));
        time = System.currentTimeMillis() - time;
        System.out.println("Sorted");
        System.out.println(time / 1000 + " seconds");
        printStringArr(two);

        System.out.println();
        System.out.println("Challenge 3");
        int[] three = new int[10];
        three[0] = (int) (Math.random() * 10) + 1;
        for (int i = 1; i < three.length; i++)
        {
            three[i] = three[i - 1] + (int) (Math.random() * 12) - 2;
        }
        printIntArr(three);
        System.out.println("Unsorted");
        time = System.currentTimeMillis();
        System.out.println("Median: " + team13.challengeThree(three));
        time = System.currentTimeMillis() - time;
        System.out.println("Sorted");
        System.out.println(time / 1000 + " seconds");
        printIntArr(three);


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

        System.out.println();
        System.out.println("Challenge 4");
        int[][] four = multiDimensionalArr(1000);
        System.out.println("Unsorted");
        time = System.currentTimeMillis();
        System.out.println("Median: " + team13.challengeFour(four));
        time = System.currentTimeMillis() - time;
        System.out.println("Sorted");
        System.out.println(time / 1000 + " seconds");

        System.out.println("\nUnsorted");
        printArr(randomThingArr);

        time = System.currentTimeMillis();
        index = team13.challengeFive(randomThingArr, thing);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge Five Time Taken: " + (time * 0.001) + " Seconds");
        System.out.println("Thingy appears at: " + index);

        System.out.println("Sorted");
        printArr(randomThingArr);
    }


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
    public static void printIntArr(int[] arr) {
        String string = "";
        for (int i = 0; i < arr.length; i++) {
            string = string + arr[i] + " ";
        }
        System.out.println(string);
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
    public static void printStringArr(String[] arr) {
        String string = "";
        for (int i = 0; i < arr.length; i++) {
            string = string + arr[i] + " ";
        }
        System.out.println(string);
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
