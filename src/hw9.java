public class hw9 {
    public static void main(String[] args) {
        for(int a = 2; a<100;a++ ){
            int control = 1;
            for(int b = 2;b<a;b++){
                if (a % b == 0) {
                    control = 0;
                    break;
                }
            }if(control == 1) System.out.print(a+" ");
        }
    }
}
