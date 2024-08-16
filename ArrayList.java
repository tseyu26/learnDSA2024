import java.util.Random;
public class ArrayList{
    public static void main(String[] args){
        int[] array = new int[10];
        Random random = new Random();
        for (int element=0;element < array.length;element++){
            array[element] = random.nextInt();
        }
        for (int element:array){
            System.out.println(element + " ");
        }
    }
}
// It is a duplication while using for-each
// assigning the ele can only use traditional for
// read can use for-each 