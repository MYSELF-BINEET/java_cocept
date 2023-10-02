public class trappingwater2 {
    public static int trapwater(int arr[]) {
        if (arr.length == 0) {
            return -1;
        }

        int left[] = new int[arr.length];
        left[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }

        int right[] = new int[arr.length];
        right[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }

        int trapwater = 0;

        for (int i = 0; i < arr.length; i++) {
            int waterlevel = Math.min(left[i], right[i]);
            trapwater = trapwater + (waterlevel - arr[i]);
        }

        return trapwater;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        int index = trapwater(arr);
        System.out.println("the total trapwater is " + index);
    }
}
