import java.util.Arrays;

public class third {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int n = 0;n < arr.length - 1;n++){
            arr[n] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    // 交换arr[j]和arr[j+1]:
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
