import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static ArrayList<Integer> list = new ArrayList<>();
    static Boolean cicle = true;

    static void getInput(){
        System.out.println("\n*** Enter your list ***" + "\n" +
                           "For close the input enter '001' \n");
        Scanner console = new Scanner(System.in);
        int input=0;
        do{
            System.out.print("Enter a number: ");
            input = console.nextInt();
            if(input!=001)
                list.add(input);
            else
                cicle=false;
        }while(cicle);
        console.close();
    }
    public static void main(String[] args) throws Exception {
        System.out.println("*** QuickSort Parallel Algorithm ***");
        getInput();
    }
}
