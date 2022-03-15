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
        double temp = 0;
        for(int num : l1){
            temp += num;
        }
        return temp/l1.length;
    }

}
