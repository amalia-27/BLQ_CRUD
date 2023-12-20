public class No_12 {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 4, 7, 1, 1, 5, 6, 1, 8};

        urutkanArray(array);

        System.out.print("Output: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    private static void urutkanArray(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Tukar elemen jika elemen saat ini lebih besar dari elemen berikutnya
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
