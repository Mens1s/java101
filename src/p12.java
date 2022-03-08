import java.util.Scanner;
public class p12 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int in = inp.nextInt();
        int step = 0, sum = 0;
        if (in < 12) System.out.println("Please enter bigger number from 12");
        else{
            for(int a = 11;a<=in;a++){
                if(a%4==0 &&a%3==0){
                    sum += a;
                    step++;
                }
            }
        }
        System.out.println("Median is "+sum/step);
    }
}
