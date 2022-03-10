import java.util.Scanner;
public class p23 {

    static void fibonacci(int num, int temp,int max, int step){
        System.out.print(num+" ");
        int t = num;
        num = temp +num;
        temp = t;
        step++;
        if(step>max-1) return;
        fibonacci(num,temp,max,step);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter len : ");
        int num = inp.nextInt();
        fibonacci(1,0,num,0);
    }
}
