import java.util.Arrays;

public class BubbleSortAlgo {

    private int[] bubbleSort(int inputArr[]) {
        int temp = 0;
        for (int i = 0; i < inputArr.length - 1; i++) {
            for (int j = 0; j < inputArr.length - i - 1; j++) {
                if (inputArr[j] > inputArr[j + 1]) {
                    temp = inputArr[j];
                    inputArr[j] = inputArr[j + 1];
                    inputArr[j + 1] = temp;
                }
            }
            System.out.println("After loop: " + i);
            Arrays.stream(inputArr).forEach(s -> System.out.print(s + " "));
            System.out.println();
        }
        return inputArr;
    }

    public static void main(String[] args) {
        BubbleSortAlgo bsa = new BubbleSortAlgo();
        int inputArr[] = {2, 5, 3, 4, 1, 6}; //2, 3, 4, 1 , 5, |6 // 2, 3, 1, 4, |5, 6// 2, 1, 3, 4 , 5, 6// 1,2,3,4,5,6
        int sortedArray[] = bsa.bubbleSort(inputArr);
        //Arrays.stream(sortedArray).forEach(s -> System.out.print(s + " "));
        //Arrays.stream(inputArr).sorted().forEach(s -> System.out.print(s + " "));
    }
}
