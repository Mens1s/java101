import java.util.Scanner;
public class hw13 {
    static int hw(int n,int start, int dir){
        System.out.print(n+" ");
        int add;
        if(n>0 && dir == 1 ) add = -5;
        else{
            dir += -1;
            add = 5;
        }
        n +=  add;
        if(n==start) return n;
        return hw(n,start,dir);

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = inp.nextInt();
        System.out.print(hw(num,num,1));
    }
}
