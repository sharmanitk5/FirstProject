public class Remove {
    public static void main(String[] args) {


        int a[] = {1, 1, 2,2,3,4,5};
        System.out.println(Increasing(a));
    }

    public static int Increasing(int[] a) {
        //int count = 1;
        int count = 1;
        for (int i = 1; i < a.length; i++) {

            if (a[i] != a[i - 1]) {
                a[count++] = a[i];

            }
        }
            return count;



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
