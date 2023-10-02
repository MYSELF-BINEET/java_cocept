public class trappingwater {

    public static int trapwater(int arr[]) {
        if (arr.length == 0) {
            return -1;
        }

        // left auxilary array
        int left[] = new int[arr.length];
        left[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }

        // right auxilary array

        int right[] = new int[arr.length];
        right[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }

        int trapwater = 0;

        for (int i = 0; i < arr.length; i++) {
            int waterlevel = Math.min(left[i], right[i]);
            trapwater += waterlevel - arr[i];
        }

        return trapwater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("the trapwater is " + trapwater(height));
    }
}