public class PrintArray {
    public static void printArray(int[] array){
        for (int ele: array){
            System.out.print (ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] intArray = new int[10];
        MakeRadomArray.MakeArray(intArray);
        PrintArray.printArray(intArray);
    }
}
