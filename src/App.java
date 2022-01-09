import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static ArrayList<Integer> list = new ArrayList<>();
    static Boolean cycle = true;

    static void getInput(){
        System.out.println("\n*** Enter your list ***" + "\n" +
                           "For close the input enter '001' \n");

        Scanner console = new Scanner(System.in);
        int input=0; // This variable we use in the conditional 
        do{
            System.out.print("Enter a number: ");
            input = console.nextInt();
            if(input!=001)
                list.add(input);
            else
                cycle=false; // Break cycle
        }while(cycle);
        console.close();
    }
    public static void main(String[] args) throws Exception {
        System.out.println("*** QuickSort Parallel Algorithm ***"); // Tittle of Program
        getInput();
    }
}
