public class SelectionSortAlgo {

    private void sort(int inputArr[]) {
        for (int i = 0; i < inputArr.length - 1; i++) {
            int index_pos = i;
            for (int j = i + 1; j < inputArr.length; j++) {
                if (inputArr[j] < inputArr[index_pos]) {
                    index_pos = j;
                }
            }
            int temp = inputArr[index_pos];
            inputArr[index_pos] = inputArr[i];
            inputArr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int inputArr[] = {64, 34, 25, 12, 22, 11, 90};
        SelectionSortAlgo ssa = new SelectionSortAlgo();
        ssa.sort(inputArr);
        for (int i : inputArr) {
            System.out.print(i + " ");
        }
    }
}
