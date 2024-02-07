public class QuickSort implements SortingAlgorithm{

    static int partition(int[] input, int l, int h) {
        int pivot = input[h];
        int i = (l - 1);
        for(int j = l; j < h; ++j) {
            if(input[j] <= pivot) {
                i++;
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
        }
        int temp = input[i + 1];
        input[i + 1] = input[h];
        input[h] = temp;

        return (i + 1);
    }
    void quickSort(int[] input, int l, int h) {
        if(l < h) {
            int p = partition(input, l, h);
            quickSort(input, l, p - 1);
            quickSort(input, p + 1, h);
        }
    }
    public int[] sorty(int[] input) {
        int n = input.length;
        quickSort(input, 0, n - 1);
        return input;
    }
}
