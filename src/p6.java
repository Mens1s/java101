import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        // Simple Calculator
        float n1, n2, result;
        int op;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first number : ");
        n1  = input.nextFloat();
        System.out.print("Please enter your second number : ");
        n2 = input.nextFloat();
        System.out.println("Please enter your op: \n1-) + \n2-) -\n3-) *\n4-) /  : ");
        op = input.nextInt();
        switch (op){
            case 1:
                System.out.println("Result is : "+(n1+n2));
                break;
            case 2:
                System.out.println("Result is : "+(n1-n2));
                break;
            case 3:
                System.out.println("Result is : "+(n1*n2));
                break;
            case 4:
                if(n2==0) System.out.println("Please don't enter n2 to zero it is not true for math... Your result is infinitive");
                else System.out.println("Result is : "+(n1/n2));
                break;
            default:
                System.out.println("Your input is wrong ! ");
        }
    }
}
