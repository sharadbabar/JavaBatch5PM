//package control_statements;
//
//import java.util.Scanner;
//
//public class Do_while {
//
//
//    public static void main(String[] args) {
//        int number;
//        int trial=0;
//        int guess;
//
//        number=(int)(Math.random()*100)+1;
//        Scanner scanner =new Scanner(System.in);
//        do {
//            System.out.println("Guess the number");
//            guess=scanner.nextInt();
//
//            trial++;
//            if (number==guess){
//                System.out.println("Correct guess");
//            }
//            else if (number>guess)
//                System.out.println("Number is greater");
//            else
//                System.out.println("number is smaller");
//
//
//
//        }while (number!=guess);
//
//
//
//    }
//
//}
