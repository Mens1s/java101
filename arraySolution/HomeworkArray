import java.util.Arrays;
public class HomeworkArray {
    /* HOMEWORK1 */
    static int[] sort(int[] arr, int len){
        for(int i = 0;i<arr.length;i++){
            for (int a = 0;a<arr.length-1;a++){
                int temp = arr[a];
                if(arr[a]>arr[a+1]){
                    arr[a] = arr[a+1];
                    arr[a+1] =temp;
                }
            }
        }
        return arr;
    }
    /* HOMEWORK 2 */
    static void repeat(int[] arr){
        int count = 0 ;
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length -1; i ++) {
            for(int j = 0 ; j < arr.length-1; j++ ) {
                if (  arr[i] == arr[j] ) {
                    count += 1 ;
                }
            }
            if(i==arr.length-2){
                if(arr[i]==arr[i+1]) System.out.println(arr[arr.length-1] + " repeated " + (count+1) + " times.");
            }
            else if(arr[i] != arr[i+1]) {
                System.out.println(arr[i] + " repeated " + count + " times.");
            }
            else if(arr[i] == arr[arr.length-1] && i == arr.length-2 ) {
                System.out.println(arr[arr.length-1] + " repeated " + count + " times.");
            }

            count = 0;


        }
    }
}
