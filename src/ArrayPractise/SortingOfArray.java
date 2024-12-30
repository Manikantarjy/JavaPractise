package ArrayPractise;

import java.util.Arrays;

public class SortingOfArray {
    public static void main(String[] args) {
        //Sorting the elements inside array - using built-in
        int[] a = {100, 600, 200, 400, 500};

        System.out.println("Before Sorting---");

        //just for printing purpose instead of loop
        System.out.println(Arrays.toString(a));

        Arrays.sort(a); //sorting elements
        System.out.println("After Sorting---");
        System.out.println(Arrays.toString(a));


        //Sorting String
        char[] arr = {'D','C','B','A'};
        System.out.println("Before Sorting---" +Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("After Sorting---" +Arrays.toString(arr));

        //String sorting..
        String[] str = {"Mani", "Aloo","Lakshmi","Krithikesh"};
        System.out.println("Before sorting----" +Arrays.toString(str));

        Arrays.sort(str);
        System.out.println("After sorting----" +Arrays.toString(str));

    }
}
