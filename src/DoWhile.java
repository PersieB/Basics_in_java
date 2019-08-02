import java.util.Scanner;
public class DoWhile{
    public static void main(String[] args){
        // Without using Do - While
        Scanner input = new Scanner(System.in);
        /*
        System.out.println("Enter an integer:");
        int value = input.nextInt();
        while(value!=5){
            System.out.println("Enter an integer:");
            value = input.nextInt();
        }
        System.out.println("Got 5!");*/
        int value;
        do{
            System.out.println("Enter an integer:");
            value = input.nextInt();
        }
        while(value!=5);
        System.out.println("Got 5!");
    }
}

