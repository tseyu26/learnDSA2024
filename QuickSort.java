public class QuickSort {
    public static int[] quickSort(int[] array){
        return array;
    }

    public static void main(String[] args) {
        int intArray[] = new int[10];
        MakeRadomArray.MakeArray(intArray);
        PrintArray.printArray(intArray);
        System.out.println();
        QuickSort.quickSort(intArray);
        PrintArray.printArray(intArray);
    }
}
