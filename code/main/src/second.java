import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        int Answer = 2 ;
        Scanner scanner = new Scanner(System.in);
        while(Answer == 2){
            Calculator(scanner);
            System.out.println("Whether to end the process");
            System.out.println("---1.yes---2.no---");
            Answer = scanner.nextInt();
        }
    }
    public static void Calculator(Scanner scanner) {
        System.out.println("Here is a calculator");
        System.out.println("please enter the first number");
        int First_number = scanner.nextInt();
        System.out.println("please choose your calculator");
        System.out.println("---1.Addition---2.Subtraction---3.multiplication---4.division---5.power---6.remainder---");
        int Calculator = scanner.nextInt();
        System.out.println("please enter the second number");
        int Second_number = scanner.nextInt();
        int number = 1;
        switch (Calculator){
            case 1:
                number = First_number + Second_number;
                break;
            case 2:
                number = First_number - Second_number;
                break;
            case 3:
                number = First_number * Second_number;
                break;
            case 4:
                if (Second_number != 0){
                    number = First_number / Second_number;
                }else{
                    System.out.println("Second number is Zero.");
                    System.exit(0);
                }break;
            case 5:
                for (int i=0;i<Second_number;i++){
                    number *= First_number;
                }break;
            case 6:
                number = First_number % Second_number;
                break;
        }
        System.out.println("Result is:"+number);
    }
}
