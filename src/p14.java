import java.util.Scanner;
public class p14 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter a num : ");
        int num = inp.nextInt();
        for (int a = 19;a<num;a++) if(a%20==0) System.out.println(a+" can be divided by five and four");
    }
}
