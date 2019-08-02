import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Type a command");
        String txt = obj.nextLine();
        switch(txt){
            case "start":
                System.out.println("Machin started");
                break;
            case "stop":
                System.out.println("Machine stopped");
                break;
            default:
                System.out.println("Command not recognised");

        }

    }


}
