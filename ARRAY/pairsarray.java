public class pairsarray {

    public static void pairsarry(int arr[]) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                total++;
            }
            System.out.println();
        }

        System.out.println("the total pairs is " + total);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        pairsarry(numbers);
    }
}
