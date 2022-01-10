import java.util.Random;
import java.util.Scanner;

public class App {
    
    static void getArray(int my_array[],int len){
        Random random = new Random();

        System.out.println("\n*** Creating your Array ***");

        for (int i=0;i<len;i++){
            my_array[i] = random.nextInt(10000);
        }


        System.out.println("Array Complete :D");
    }

    static void printList(int my_array[]){
        System.out.println("*** Printing List ***");
        System.out.print("[ ");
        for (int i : my_array) {
            System.out.print(i + ", ");
        }
        System.out.print("]\n");
    }
    public static void main(String[] args) throws Exception {
        int noElements = 10;

        // Scanner noElements
        Scanner console = new Scanner(System.in);
        System.out.print("\nEnter number Elements you want: ");
        noElements = console.nextInt();
        console.close();
        
        int[] my_array = new int[noElements];
        
        System.out.println("\n*** QuickSort Parallel Algorithm ***"); // Tittle of Program
        getArray(my_array,noElements);
        System.out.println("\nBefore Sorting");
        printList(my_array);
        
        System.out.println("\nSorting.....");
        QuickParallel.quickSort(my_array);
        printList(my_array);

    }
}
