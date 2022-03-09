import java.util.Scanner;
public class hw6 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int maks = 0, min = 10000;
        System.out.print("How many numbers you will enter : ");
        int len = inp.nextInt();
        for(int a = 0;a<len;a++){
            System.out.print((a+1)+". Number : ");
            int temp = inp.nextInt();
            // for best solution if(a==0) maks = temp, min = temp;
            if(temp>maks) maks = temp;
            if(temp<min) min = temp;
        }
        System.out.println("Biggest number : "+maks+"\nSmallest number : "+min);
    }
}
