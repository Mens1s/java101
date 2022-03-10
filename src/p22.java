import java.util.Scanner;
public class p22 {
    static String polindrom(int num){
        int temp = num, reverse = 0, last=0;
        while(temp>0){
            last = temp%10;
            reverse = reverse*10+last;
            temp /= 10;
        }
        if(num==reverse) return "";
        return "not";
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter a num : ");
        int num = inp.nextInt();
        System.out.println("İt is "+polindrom(num)+"polindrom.");
    }
}
