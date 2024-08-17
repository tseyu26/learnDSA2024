public class InsertSort {
    public static int[] insertSort(int[] array){
        for (int i = 1; i < array.length;i++){
            int j = i;
            while (j > 0 && array[j] < array[j - 1]){
                SwapArrayEle.SwapEle(array, j-1, j);
                j--;
            }  
        }
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
