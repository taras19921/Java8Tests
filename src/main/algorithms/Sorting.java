package main.algorithms;

import java.util.concurrent.ThreadLocalRandom;

public class Sorting
{

    public static void main(String[] args)
    {

	String s = "ABCDEFG";
	System.out.println(s);
	s = reverse(s);
	StringBuilder stringBuilder = new StringBuilder(s);
	System.out.println(stringBuilder.reverse());
	int[] arr = new int[20];

	for (int i = 0; i < 20; i++)
	{
	    arr[i] = randInt(1, 100);
	}
	System.out.println("Insertion sort method");
	System.out.println("unsorted array: " + arr);
	System.out.println("sorted array: " + insertIntoSort(arr));

    }

    public static String reverse(String orig)
    {
	char[] s = orig.toCharArray();
	int n = s.length;
	int halfLength = n / 2;
	for (int i = 0; i < halfLength; i++)
	{
	    char temp = s[i];
	    s[i] = s[n - 1 - i];
	    System.out.println(s);
	    s[n - 1 - i] = temp;
	    System.out.println(s);
	}
	return new String(s);
    }

    public static int randInt(int min, int max)
    {

	return ThreadLocalRandom.current().nextInt(min, max + 1);

    }

    public static int[] insertIntoSort(int[] arr)
    {
	int temp, j;
	for (int i = 0; i < arr.length - 1; i++)
	{
	    if (arr[i] > arr[i + 1])
	    {
		temp = arr[i + 1];
		arr[i + 1] = arr[i];
		j = i;
		while (j > 0 && temp < arr[j - 1])
		{
		    arr[j] = arr[j - 1];
		    j--;
		}
		arr[j] = temp;
	    }
	}
	return arr;
    }

}
