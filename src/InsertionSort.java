public class InsertionSort implements SortingAlgorithm{
    public int[] sorty(int[] input) {
        int n = input.length;
        for(int i = 0; i < n; ++i) {
            int key = input[i];
            int j = i-1;

            while(j >= 0 && key < input[j]) {
                input[j+1] = input[j];
                --j;
            }
            input[j+1] = key;
        }
        return input;
    }
}
