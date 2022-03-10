import java.util.Scanner;
public class hw11 {
    static void pow(int base,int exp,int step) {
        if (base == 0 || exp == 0) {
            System.out.println("Result is 0");
            return;
        }
        if(step==exp){
            System.out.println("Result is : "+base);
            return;
        }
        step++;
        pow(base*base,exp,step);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter base : ");
        int a = inp.nextInt();
        System.out.print("Please enter exp : ");
        int b = inp.nextInt();
        pow(a,b,1);
    }
}
