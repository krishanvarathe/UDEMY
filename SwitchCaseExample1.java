import java.util.Scanner;

public class SwitchCaseExample1 {
    public static void main(String[] args) {
        Double a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a:");
        a=sc.nextDouble();
        System.out.println("enter the value of b:");
        b=sc.nextDouble();
        System.out.println("enter the operation (+,-,*,/)");
        char operation=sc.next().charAt(0);
        System.out.println("operation is:"+operation);

        switch(operation){
            case '+':
            System.out.println("addition :"+(a+b));
            break;
            case '-':
            System.out.println("subtraction :"+(a-b));
            break;
            case '*':
            System.out.println("multiplication :"+(a*b));
            break;
            case '/':
            System.out.println("divide :"+(a/b));
            break;
            default:
            System.out.println("invalid operation");
        }
    }
}