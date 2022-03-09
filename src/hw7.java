import java.util.Scanner;
public class hw7 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter num : ");
        int num = inp.nextInt();
        int temp = 0;
        for(int a = 1;a<=num/2;a++) if(num%a==0) temp+=a;
        if(temp==num) System.out.println("It is a perfect number.");
        else System.out.println("It is not a perfect number.");
    }
}
