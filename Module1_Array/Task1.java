import java.util.*;
public class Task1 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the size of the array: ");
        // int n = scanner.nextInt();
        // int[] array = new int[n];
        // System.out.println("Enter " + n + " integers:");
        // for (int i = 0; i < n; i++) {
        //     array[i] = scanner.nextInt();
        // }
        // System.out.println("You entered:");
        // for (int num : array) {
        //     System.out.print(num + " ");
        // }


        // Static D & I  

        int[] n={1,2,3,4,5};
        System.out.println(n[0]);
         System.out.println(n.length);

         for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
         }

         // new key word

         int[] n1= new int[] {1,2,3,4,5};
            for(int i=0;i<n1.length;i++){
                System.out.print(n1[i]+" ");
            }

             int[] n2= new int[10];

             n2[0]=10;
             n2[1]=20;

             for(int i=0;i<n2.length;i++){
                System.out.print(n2[i]+" ");
             }


}}