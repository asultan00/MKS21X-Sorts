import java.io.*;
import java.util.*;

public class Sorts {
     public static void selectionSort(int[] input) {
          int minval;
          int tempval;
          int index2;
          //looping through whole array
          for (int i = 0; i < input.length; i++) {
               minval = input[i];
               index2 = i;
               //looping to find where to switch
               for (int q = i; q < input.length; q++) {
                    tempval = input[q];
                    if (tempval < minval) {
                         minval = tempval;
                         index2 = q;
                    }
               }
               int holdval = input[i];
               input[i] = minval;
               input[index2] = holdval;
          }

     }
     public static void main(String[] args) {
          //testing
          int[] testary1 = {51, 3, 6, -4, 8, 99, 10, 1, 7};
          selectionSort(testary1);
          System.out.println(Arrays.toString(testary1));
     }
}
