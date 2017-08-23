package main.collections;

import java.util.Arrays;

public class BinarySearch
{

    public static void main(String[] args)
    {
	int[] values = {1, 5, 8, 1, 5, 3};
	int index = BinarySearch.rank(1, values);
	System.out.println("index = " + index);

    }
    
    public static int rank(int key, int... values) {
        if (values.length == 0) {
            return -1;
        }
        Arrays.sort(values);
        return search(key, 0, values.length - 1, values);
    }
 
    private static int search(int key, int lo, int hi, int[] values) {
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (key < values[mid]) {
            return search(key, lo, mid - 1, values);
        } else if (key > values[mid]) {
            return search(key, mid + 1, hi, values);
        } else return mid;
    }

}
