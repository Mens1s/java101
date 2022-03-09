import java.util.Scanner;
public class p17 {
    public static void main(String[] args) {
        /*
            Java döngüler ile sayının armstrong sayı olup olmadığını bulan programı yazıyoruz.
            Armstrong Sayı Nedir ?
            N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
            Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
            1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.
            1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634
            54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748
        */
        Scanner inp = new Scanner(System.in);
        System.out.print("PLEASE enter a number : ");
        int num = inp.nextInt();
        int temp = num;
        int con = num;
        int len = 0;
        while(temp>0){
            temp /= 10;
            len++;
        }
        int result = 0;
        for(int a = 0;a<len;a++){
            result += pow(num%10,len);

            num /= 10;

        }
        if(result==con) System.out.println("Armstrong number");
        else System.out.println("not an Armstrong number");
    }
    public static int pow(int a, int b){
        int temp = a;
        for(int c = 0;c<b-1;c++) a *= temp;
        return a;
    }
}
