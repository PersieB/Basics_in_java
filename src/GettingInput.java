import java.util.Scanner;
public class GettingInput {
    public static void main(String[] args){
        // Creating scanner object
        Scanner entry = new Scanner(System.in);

        System.out.println("Type a text");
        //Waiting for the user to type

        String text = entry.nextLine();
        System.out.println("You entered: " + text);


    }
}
