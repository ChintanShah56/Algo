public class LinearSearch {

    public static void main(String[] args) {
        int inputArr[] = {10, 20, 80, 30, 60, 50,
                110, 100, 130, 170};
        int elementToSearch = 100;
        int result = linearSearch(inputArr, elementToSearch);
        if (result == -1) {
            System.out.println("The element " + elementToSearch + " is not present in the list");
        } else {
            System.out.println("The element is present at index: " + result);
        }
    }

    private static int linearSearch(int inputArr[], int elementToSearch) {

        for (int i = 0; i < inputArr.length; i++){
            if (elementToSearch == inputArr[i]) {
                return i;
            }
        }
        return -1;
    }
}
