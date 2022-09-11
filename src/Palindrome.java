import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindrome {
    public static void main(String[] args) {


        int a [] = {1,2,3,2,5};
        System.out.println(Increasing(a));
    }
    public static boolean Increasing(int a[]) {
        int count = 0;
        for (int i = 0; i < a.length-1; i++) {

            if (a[i] < a[i+1]) {
                continue;
            }
          //    a[0]=a[i];
             if (a[i] > a[i+1]) {
                 count++;

                 if (count > 1) {
                     return false;
                 }
                 if (a[i] > a[i - 1] && a[i + 1] <= a[i - 1]) {
                     a[i + 1] = a[i];
                 }
                 // System.out.println(a[i]);
                 //

             }//if (a[i] < a[i - 1] && a[i + 1] >= a[i - 1])
                 else {
                     a[i] = a[i + 1];
                 }
                 //System.out.println(a[i+1]);


            }
             return true;
        }

    }



   // }
  //  public static boolean Incr(int a[]){
   //     for(int i =0;i<a.length;i++) {
    //        for (int j = 1; j < a.length; j++) {

       //         if (a[i] < a[j]) {

       //         }
       //     }
    //    }
   //     return true;
   // }




  //  }
