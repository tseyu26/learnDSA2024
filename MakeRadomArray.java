import java.util.Random;
public class MakeRadomArray{
    public static int[] MakeArray(int[] array){
        Random random = new Random();
        for (int element = 0;element < array.length;element++){
            array[element] = random.nextInt();
        }
        return array;
    }
    public static void main(String[] args){
        int intArray[] = new int[10];
        MakeArray(intArray);
        for (int ele : intArray){
            System.out.println(ele);
        }
    } 
}