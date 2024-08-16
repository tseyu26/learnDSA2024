public class SwapArrayEle {
    public static int[] SwapEle(int[] array, int flag1, int flag2){
        int tmp = array[flag1];
        array[flag1] = array[flag2];
        array[flag2] = tmp;
        return array;
    }
    public static void main (String[] args){
        int[] intArray = new int[10];
        MakeRadomArray.MakeArray(intArray);
        PrintArray.printArray(intArray);
        SwapArrayEle.SwapEle(intArray, 9, 0);
        System.out.println();
        PrintArray.printArray(intArray);
    }
}
