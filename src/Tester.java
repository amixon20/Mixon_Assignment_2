import java.util.*;
public class Tester {
    SortingAlgorithm algorithm;
    public Tester(SortingAlgorithm sa) {
        algorithm = sa;
    }

//takes random array and makes it 10 sorted
    int[] generateKSorted(int[] arr) {
        int gap = 10;
        for(int i = gap; i < arr.length; i += gap) {
            int j = i;
            while(j - gap >= 0 && arr[j] < arr[j - gap]) {
                int temp = arr[j];
                arr[j] = arr[j - gap];
                arr[j - gap] = temp;
                j -= gap;
            }
        }
        return arr;
    }
        double singleTest (int size){
            int[] arr = new int[size];
            Random gen = new Random();
            for (int i = 0; i < size; ++i) {
                arr[i] = gen.nextInt();
            }
            // Commented out line below to generate initial random runtime report numbers
            int[] kArr = generateKSorted(arr);
            long startTime = System.nanoTime();
            // Changed arr to kArr to generate numbers for 10 sorted data
            algorithm.sorty(kArr);
            long endTime = System.nanoTime();

            long totalTime = endTime - startTime;
            return (double) totalTime / 5000000;
        }
        String test (int iterations, int size){
            double[] times = new double[iterations];
            double totalTime = 0;
            for (int i = 0; i < iterations; ++i) {
                times[i] = singleTest(size);
            }
            for (int i = 0; i < iterations; i++) {
                totalTime += times[i];
            }
            double avgTime = totalTime / iterations;
            return "\n" + "Sorted " + size + " elements in " +
                    avgTime + " ms (avg)";
        }

}
