//Selection Sort Using java


import java.util.Scanner;

class SelectionSort {

    public void selection_sort(int arr[], int n) {   //selection sort function 
        int min;

        for (int i = 0; i < n - 1; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {   //getting the index of the minimum element 
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            //Initiating swapping 
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

    }

    public void display(int arr[], int n) {   //display function
        System.out.println("\n----------Elements of the array After Sorting-------------- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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
        sc.close();
        SelectionSort ss = new SelectionSort();
        // ss.display(arr, n);
        ss.selection_sort(arr, n);
        ss.display(arr, n);
    }

}