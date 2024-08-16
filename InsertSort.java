public class InsertSort {
    public static int[] insertSort(int[] array){
        return array;
    }
    public static void main(String[] args) {
        int intArray[] = new int[10];
        MakeRadomArray.MakeArray(intArray);
        PrintArray.printArray(intArray);
        System.out.println();
        InsertSort.insertSort(intArray);
        PrintArray.printArray(intArray);
    }
}
