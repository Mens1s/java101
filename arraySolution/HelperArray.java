import java.util.Arrays;
public class HelperArray {
    static void print(int[] arr){
        for(int i= 0; i < arr.length ;i++){
            System.out.println(" : "+arr[i]+" : ");
        }
    }
    static void fill(int[] arr, int a){
        for(int i = 0 ; i < arr.length;i++){
            arr[i] = a;
        }
    }

    static boolean equals(int[] l1, int[] l2){
        if(l1.length != l2.length) return false;
        for(int i = 0;i<l1.length;i++){
            if(l1[i]!=l2[i]) return false;
        }
        return true;
    }

    static double average(int[] l1){
        double res=0;

        for(int i=0;i<l1.length;i++) {
            res+=1.0/l1[i];
        }
        return l1.length/res;
    }

    static void find(int[] l1 ,int num){
        Arrays.sort(l1);
        int small = l1[0], big = l1[l1.length-1];
        for(int i = 0; i < l1.length ; i++){
            if(num<l1[i] && big > l1[i]) big = l1[i];
            if(num>l1[i] && small < l1[i]) small = l1[i];
        }
        System.out.println("The nearest big number : "+small);
        System.out.println("The nearest small number : "+big);
    }

    static void star(){
        String[][] arr = new String[6][4];

        for(int i = 0; i<arr.length;i++){
            for(int a = 0 ; a < arr[i].length; a++){
                if(i == 0 || i==2 || a == 0 || a == 3){
                    arr[i][a] = " * ";
                } else{
                    arr[i][a] = "   ";
                }
            }
        }
        for(String[] a : arr){
            for(String b : a){
                System.out.print(b);
            }
            System.out.println();
        }
    }

    static void repeat(int[] arr){
        Arrays.sort(arr);
        int temp=arr[arr.length-1];
        int counter = 0;
        for(int i : arr){
            if(temp == i && counter==0 && i%2==0){
                System.out.println(i+" is repeat!");
                counter++;
            }
            else counter = 0;
            temp = i;
        }
    }
}
