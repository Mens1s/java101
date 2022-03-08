import java.util.Scanner;
public class p13 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sum = 0;
        do {
            System.out.print("Enter a num : ");
            int temp = inp.nextInt();
            if(temp%4==0) sum+=temp;
            if(temp%2==1) break;
        }while(true);
        System.out.println("sum is "+sum);
    }
}
