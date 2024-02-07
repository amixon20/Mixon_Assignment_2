public class MergeSort implements SortingAlgorithm{

    void merge(int[] input, int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;

        int[] sub1 = new int[n1];
        int[] sub2 = new int[n2];

        for (int i = 0; i < n1; ++i) {
            sub1[i] = input[l + 1];
        }
        for (int j = 0; j < n2; ++j) {
            sub2[j] = input[m + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (sub1[i] <= sub2[j]) {
                input[k] = sub1[i];
                i++;
            } else {
                input[k] = sub2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            input[k] = sub1[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            input[k] = sub2[j];
            j++;
            k++;
        }
    }
    void sort(int[] input, int l, int r) {
        if(l < r) {
            int m = l + (r - l) / 2;

            sort(input, l, m);
            sort(input, m + 1, r);

            merge(input, l, m, r);
        }
    }
    public int[] sorty(int[] input) {
        int n = input.length;
        int l = 0;
        sort(input, l, n-1);
        return input;
    }
}
