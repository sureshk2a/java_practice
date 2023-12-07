public class BubbleSort {
    public static void swap(int[] array, int i, int j ){
        if(i==j){
            return;
        }
         int temp = array[i];
         array[i] = array[j];
         array[j] = temp;
    }
    public static void main(String[] args) {

        int[]  intArray = {20, 35, -15, 7, 55, 1, -22};
        for(int lastUnsortedInt = intArray.length - 1; lastUnsortedInt > 0; lastUnsortedInt -- ){
            for(int i=0;i<lastUnsortedInt;i++){
                if(intArray[i] > intArray[i+1]){
                    swap(intArray, i, i+1);
                }
            }
        }

        System.out.println(java.util.Arrays.toString(intArray));


    }
}
