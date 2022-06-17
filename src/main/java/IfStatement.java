import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);

        int num =scn.nextInt();
        switch (num){
            case 1:
                if (num>100) {
                    System.out.println("You are in");
                }
                break;
                case 2:
                    if(num<100) {
                        System.out.println("You cant register");
                    }

               break;


        }

    }
}
