import java.util.Scanner;
public class p10 {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter first number : ");
        n1 = inp.nextInt();

        System.out.print("Enter second number : ");
        n2 = inp.nextInt();

        System.out.print("Enter third number : ");
        n3 = inp.nextInt();

        if(n1>n2){
            int temp = n2;
            n2=n1;
            n1 = temp;
            if(n2>n3){
                temp = n3;
                n3 = n2;
                n2 = temp;
            }
            if(n1>n2){
                temp = n2;
                n2=n1;
                n1 = temp;
            }
        }else{
            if(n2>n3){
                int temp = n3;
                n3 = n2;
                n2 = temp;
            }
            if(n1>n2){
                int temp = n2;
                n2=n1;
                n1 = temp;
            }
        }
        System.out.println("Our order is : "+n1+" "+n2+" "+n3);
    }
}
