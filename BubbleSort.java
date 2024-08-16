public class BubbleSort {
    public static int[] bubbleSort(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - i- 1;j++){
                if (i + 1 < array.length - 1){
                    if (array[j] > array[j + 1]){
                        SwapArrayEle.SwapEle(array, j, j+1);
                    }
                }   
            }
        }
        return array;
    }
    public static void main(String[] args){
        int intArray[] = new int[10];
        MakeRadomArray.MakeArray(intArray);
        PrintArray.printArray(intArray);
        System.out.println();
        BubbleSort.bubbleSort(intArray);
        PrintArray.printArray(intArray);
    }
}
