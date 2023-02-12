import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        int i = 0;
        while(i>=0){
            System.out.println("Please enter a command:");
            Scanner scanner = new Scanner(System.in);
            String a = scanner.nextLine();
            //System.out.println("Ops, you got the wrong command: " + a);
            if(a.equals("stop")){
                System.out.println("You entered: " + a);
                break;
            }else System.out.println("Ops, you got the wrong command: " + a);


        }
    }
}
