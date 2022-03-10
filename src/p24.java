import java.util.Scanner;
public class p24 {
    /*
        1- Toplama İşlemi
        2- Çıkarma İşlemi
        3- Çarpma İşlemi
        4- Bölme işlemi
        5- Üslü Sayı Hesaplama
        6- Faktoriyel Hesaplama
        7- Mod Alma
        8- Dikdörtgen Alan ve Çevre Hesabı
    */
    static void sum(int n1,int n2){
        System.out.println("Result : "+(n1+n2));
    }
    static void ext(int n1,int n2){
        System.out.println("Result : "+(n1-n2));
    }
    static void min(int n1,int n2){
        System.out.println("Result : "+(n1*n2));
    }
    static void div(int n1,int n2){
        System.out.println("Result : "+(n1/n2));
    }
    static void pow(int n1,int n2){
        int temp = 1;
        for(int n = 0;n<n2;n++)temp *= n1;
        System.out.println("Result : "+temp);
    }
    static void fact(int n1){
        int res = 1;
        for(int n = n1;n>1;n--) res *= n;
        System.out.println("Result is : "+res);
    }
    static void mod(int n1, int n2){
        System.out.println("Result is : "+(n1%n2));
    }
    static void dik(int n1,int n2){
        System.out.println("Area : "+(n1*n2)+" Circumference : "+(2*(n1+n2)));
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("1- Toplama İşlemi\n2- Çıkarma İşlemi\n3- Çarpma İşlemi\n4- Bölme işlemi\n5- Üslü Sayı Hesaplama\n6- Faktoriyel Hesaplama\n7- Mod Alma\n8- Dikdörtgen Alan ve Çevre Hesabı");
        System.out.print("Please enter choice : ");
        int choice = inp.nextInt();
        int n1=0,n2=0;
        switch (choice) {
            case 1:
                    System.out.println("Please enter 2 number ");
                    System.out.print("Num 1 : ");
                    n1 = inp.nextInt();
                    System.out.print("Num 2 : ");
                    n2 = inp.nextInt();
                    sum(n1,n2);
                    break;
            case 2 :
                    System.out.println("Please enter 2 number ");
                    System.out.print("Num 1 : ");
                    n1 = inp.nextInt();
                    System.out.print("Num 2 : ");
                    n2 = inp.nextInt();
                    ext(n1,n2);
                    break;
            case 3:
                    System.out.println("Please enter 2 number  ");
                    System.out.print("Num 1 : ");
                    n1 = inp.nextInt();
                    System.out.print("Num 2 : ");
                    n2 = inp.nextInt();
                    min(n1,n2);
                    break;

            case 4:
                    System.out.println("Please enter 2 number");
                    System.out.print("Num 1 : ");
                    n1 = inp.nextInt();
                    System.out.print("Num 2 : ");
                    n2 = inp.nextInt();
                    div(n1,n2);
                    break;
            case 5:
                    System.out.println("Please enter 2 number  ");
                    System.out.print("base num : ");
                    n1 = inp.nextInt();
                    System.out.print("exponent : ");
                    n2 = inp.nextInt();
                    pow(n1,n2);
                    break;

            case 6:
                    System.out.print("Please enter number  ");
                    n1 = inp.nextInt();
                    fact(n1);
                    break;

            case 7:
                    System.out.println("Please enter 2 number ");
                    System.out.print("Big : ");
                    n1 = inp.nextInt();
                    System.out.print("Small : ");
                    n2 = inp.nextInt();
                    mod(n1,n2);
                    break;
            case 8:
                    System.out.println("Please enter 2 number ");
                    System.out.print("a : ");
                    n1 = inp.nextInt();
                    System.out.print("b : ");
                    n2 = inp.nextInt();
                    dik(n1,n2);
                    break;
            default:
                System.out.println("Wrong Choice!");
        }

    }
}