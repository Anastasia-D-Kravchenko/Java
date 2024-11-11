public class MAin4_6 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    for (int i=0;i<arr.length;i++){
        for (int j=0;j<i;j++){
            if (arr[i]>arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

