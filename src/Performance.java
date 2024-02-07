import java.io.*;
public class Performance {
    static BubbleSort bubble = new BubbleSort();
    static InsertionSort insert = new InsertionSort();
    static MergeSort merge = new MergeSort();
    static QuickSort quick = new QuickSort();
    static SelectionSort select = new SelectionSort();
    static ShellSort shell = new ShellSort();

    public static void main(String[] args) {
        try {
            // changed filename for initial runtime report.txt
            File file = new File("kSortRuntimeReport.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        Tester bubbleTest = new Tester(bubble);
        Tester insertTest = new Tester(insert);
        Tester mergeTest = new Tester(merge);
        Tester quickTest = new Tester(quick);
        Tester selectTest = new Tester(select);
        Tester shellTest = new Tester(shell);
        try {
            // changed filename for initial runtime report.txt
            FileWriter myWriter = new FileWriter("kSortRuntimeReport.txt");
            myWriter.write("Sorting Algorithm - BubbleSort");
            myWriter.write(bubbleTest.test(20, 100));
            myWriter.write(bubbleTest.test(20, 500));
            myWriter.write(bubbleTest.test(20, 1000));
            myWriter.write(bubbleTest.test(20, 2000));
            myWriter.write(bubbleTest.test(20, 5000));
            myWriter.write(bubbleTest.test(20, 10000));
            myWriter.write(bubbleTest.test(20, 20000));
            myWriter.write(bubbleTest.test(20, 75000));
            myWriter.write(bubbleTest.test(20, 150000));
            myWriter.write("\n" + "Sorting Algorithm - InsertionSort");
            myWriter.write(insertTest.test(20, 100));
            myWriter.write(insertTest.test(20, 500));
            myWriter.write(insertTest.test(20, 1000));
            myWriter.write(insertTest.test(20, 2000));
            myWriter.write(insertTest.test(20, 5000));
            myWriter.write(insertTest.test(20, 10000));
            myWriter.write(insertTest.test(20, 20000));
            myWriter.write(insertTest.test(20, 75000));
            myWriter.write(insertTest.test(20, 150000));
            myWriter.write("\n" + "Sorting Algorithm - MergeSort");
            myWriter.write(mergeTest.test(20, 100));
            myWriter.write(mergeTest.test(20, 500));
            myWriter.write(mergeTest.test(20, 1000));
            myWriter.write(mergeTest.test(20, 2000));
            myWriter.write(mergeTest.test(20, 5000));
            myWriter.write(mergeTest.test(20, 10000));
            myWriter.write(mergeTest.test(20, 20000));
            myWriter.write(mergeTest.test(20, 75000));
            myWriter.write(mergeTest.test(20, 150000));
            myWriter.write("\n" + "Sorting Algorithm - QuickSort");
            myWriter.write(quickTest.test(20, 100));
            myWriter.write(quickTest.test(20, 500));
            myWriter.write(quickTest.test(20, 1000));
            myWriter.write(quickTest.test(20, 2000));
            myWriter.write(quickTest.test(20, 5000));
            myWriter.write(quickTest.test(20, 10000));
            myWriter.write(quickTest.test(20, 20000));
            myWriter.write(quickTest.test(20, 75000));
            myWriter.write(quickTest.test(20, 150000));
            myWriter.write("\n" + "Sorting Algorithm - SelectionSort");
            myWriter.write(selectTest.test(20, 100));
            myWriter.write(selectTest.test(20, 500));
            myWriter.write(selectTest.test(20, 1000));
            myWriter.write(selectTest.test(20, 2000));
            myWriter.write(selectTest.test(20, 5000));
            myWriter.write(selectTest.test(20, 10000));
            myWriter.write(selectTest.test(20, 20000));
            myWriter.write(selectTest.test(20, 75000));
            myWriter.write(selectTest.test(20, 150000));
            myWriter.write("\n" + "Sorting Algorithm - ShellSort");
            myWriter.write(shellTest.test(20, 100));
            myWriter.write(shellTest.test(20, 500));
            myWriter.write(shellTest.test(20, 1000));
            myWriter.write(shellTest.test(20, 2000));
            myWriter.write(shellTest.test(20, 5000));
            myWriter.write(shellTest.test(20, 10000));
            myWriter.write(shellTest.test(20, 20000));
            myWriter.write(shellTest.test(20, 75000));
            myWriter.write(shellTest.test(20, 150000));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }
            catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
