public class SelectionSort implements SortingAlgorithm{

    public int[] sorty(int[] input) {

        int n = input.length;
        for(int i = 0; i < n-1; ++i) {
            int min = i;
            for(int j = i + 1; j < n; ++j) {
                if(input[j] < input[min]) {
                    min = j;
                }
            }
            int temp = input[i];
            input[i] = input[min];
            input[min] = temp;
        }
        return input;
    }
}
