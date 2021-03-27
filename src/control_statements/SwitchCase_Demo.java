package control_statements;

import java.util.Scanner;

public class SwitchCase_Demo {

    void read_info() {


    }

    public static void main(String[] args) {
        int num1;
        int num2;
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        num1 = scanner.nextInt();
        System.out.println("Enter number 2");
        num2 = scanner.nextInt();

        System.out.println("Enter the operator-->");
        ch=scanner.next().charAt(0);
        switch(ch){
            case '+' :
                System.out.println(num1+num2);
                break;
            case '-' :
                System.out.println(num1-num2);
                break;
            case '*' :
                System.out.println(num1*num2);
                break;
            case '/' :
                System.out.println(num1/num2);
            default:
                System.out.println("Incorrect choice!!!!!!!!!!!!!");


        }


    }
}
