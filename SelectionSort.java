public class SelectionSort {
    public static int[] selectionSort(int[] array){
        for (int i= 0; i < array.length - 1; i++){
            int minflag = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[minflag]){
                    minflag = j;
                }       
            }
            if (minflag !=i){
                SwapArrayEle.SwapEle(array, i, minflag);
            }
        }
        return array;
    }

    public static void main (String[] args){
        int intArray[] = new int[10];
        MakeRadomArray.MakeArray(intArray);
        PrintArray.printArray(intArray);
        System.out.println();
        SelectionSort.selectionSort(intArray);
        PrintArray.printArray(intArray);
    }
}
