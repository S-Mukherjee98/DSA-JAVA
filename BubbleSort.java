import java.util.*;

public class BubbleSort {

    public void bubble_sort(int arr[], int n) {   //bubble sort funtion 
        int i = 0, j = 0;
        for (i = 0; i < n - 1; i++) {              //i will iterate upto n-2 and j will iterate upto  n-i-1
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //Swapping 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

                //after complete iteration of the j loop on e of the element of the array will get the accurate place 
                //eg : if input 5 4 3 2 1 then 5 will get its accurate place after completing the j loop iteration  when i=0
            }
        }
    }

    public void display(int arr[], int n) {
        System.out.println("\nElements of the array  ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[20];
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter Size of the array: ");
        n = sc.nextInt();
        System.out.println("Enter All Elements One By One: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        BubbleSort bs = new BubbleSort();
        bs.bubble_sort(arr, n);
        bs.display(arr, n);
    }
}
