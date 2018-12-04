package com.company;

public class Team13SortCompetition extends SortCompetition{

    public int challengeOne(int[] arr)
    {
        boolean x = false;
        quickSort(arr,0,arr.length-1);
        return arr[arr.length/2];
    }
    private static void quickSort(int[] arr, int left, int right)
    {
        if(left < right)
        {
            int pivot = partition(arr,left,right);
            quickSort(arr,left,pivot - 1);
            quickSort(arr,pivot + 1, right);
        }
    }
    private static int partition(int[] arr, int left, int right)
    {
        int pivot = arr[right];
        int i = left - 1;
        int temp;
        for(int j = left; j < right; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                temp = arr[j];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[right];
        arr[right] = arr[i+1];
        arr[i+1] = temp;
        return (i+1);
    }
    
    public int challengeTwo(String[] arr, String target)
    {
        int swap = 1;
        while(swap != 0) {
            swap = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i].compareTo(arr[i - 1]) < 0) {
                    String temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swap++;
                }
            }
        }
        for(int i = 0; i < arr.length; i++)
        {
            if(target.compareTo(arr[i].toString()) == 0)
            {
                return i;
            }
        }
        return -1;
    }

    public int challengeThree(int[] arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            for(int num = i; num > 0; num--)
            {
                if(arr[num] < arr[num-1])
                {
                    int temp = arr[num];
                    arr[num] = arr[num-1];
                    arr[num-1] = temp;
                }
            }
        }
        return arr[arr.length/2];
    }
    public int challengeFour(int[][] arr) {
        int[] medians = new int[arr.length];
        for (int i = 0; i < arr.length; i ++) {
            quickSort(arr[i], 0, arr[i].length - 1);
            medians[i] = arr[i][arr[i].length/2 - 1];
        }
        quickSort(medians, 0, medians.length - 1);
        return medians[medians.length/2 - 1];
    }
    public int challengeFive(Comparable[] arr, Comparable query) {return 0;}

    public String greeting() {return "";}
}
