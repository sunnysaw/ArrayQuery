/*
In this section we will see how we can find that any element in array is present or not 'n' time's.
_____________________________________________________________________________________________________
Question : Given 'Q' queries, check if the number is present or not in array.
           NOTE : Value of all the element in array is less than 10 to the power 5.
___________________________________________________________________________________________________________
 */

import java.util.Scanner;
public class Main {
    static int[] queries(int arr[]){
        int ref[] = new int[100005];
        for (int i = 0; i < arr.length; i++){
            ref[arr[i]]++;
        }
        return ref;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("GIVE THE LENGTH OF ARRAY :");
        int a = sc.nextInt();
        System.out.println("GIVE ELEMENT YOU WANT TO SAVE IN ARRAY :");
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }
        int ref1[] = queries(arr);
        System.out.println("ENTER THE NUMBER OF QUERIES :");
        int q = sc.nextInt();
        while (q > 0){
            System.out.println("enter number to be searched :");
            int x = sc.nextInt();
            if (ref1[x] > 0){
                System.out.println("YES ");
            }else {
                System.out.println("NO");
            }
            q--;
        }
        System.out.println("EXECUTION FINISH : ");
    }
}