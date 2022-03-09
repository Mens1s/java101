import java.util.Scanner;
public class p21 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter num1 : ");
        int n1 = inp.nextInt();
        System.out.print("Please enter num2 : ");
        int n2 = inp.nextInt();

        // ebob
        int ebob = 0;
        int small = n1<n2 ? n1 : n2;
        for(int a = 1; a<=small;a++)  if(n1 % a == 0 && n2 % a == 0) ebob = a;
        //ekok
        int big = n1>n2 ? n1 : n2;
        int ekok = big;
        while(ekok%small != 0){
            ekok += big;
        }
        System.out.println("Ebob : "+ebob+"  Ekok  "+ekok);
    }
}
