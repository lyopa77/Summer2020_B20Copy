package Office_Hours.Practice_12_30_2020;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class reverseString {
    public static void main(String[] args) {
        String str = "Lyopa";
        String reverse = "";
        for (int i =str.length()-1; i >=0;  i--){
          reverse += str.charAt(i);
        }
        System.out.println(reverse);
        StringBuffer rev = new StringBuffer(str);
        rev.reverse();
        System.out.println(rev);
        StringBuilder rev2 = new StringBuilder(str);
        System.out.println(rev2.reverse());


   int [] arr = {6,1,2,3,4,5};

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        StringBuffer sb = new StringBuffer(Arrays.toString(arr));
        System.out.println(sb.reverse());





        int max =arr[0];
        for (int  y =0;  y< arr.length; y++){
            if (arr[y]>max)
                max = arr[y];
        }
        System.out.println(max);

        int min =arr[0];
        for (int  y =0;  y< arr.length; y++){
            if (arr[y]<min)
                min = arr[y];
        }
        System.out.println(min);

        Arrays.sort(arr);
        int min2 = arr[0];
        int max2 = arr[arr.length-1];
        System.out.println("min "+min2);
        System.out.println("max "+max2);

        System.out.println(Arrays.stream(arr).min());


        System.out.println( Integer.min(1,-3));
        




}}
