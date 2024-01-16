public class ArrayOps {
    public static void main(String[] args) {

    }
    
    public static int findMissingInt(int [] array) {

        int[] arr1 = new int[array.length + 1];
        int a = 0;

        for(int i = 0; i < array.length; i++){

            arr1[array[i]] = array[i];

        }

        for(int j = 1; j < arr1.length; j++){

            if (arr1[j] == 0) a = j;
                
        }
        
        return a;
    }

    public static int secondMaxValue(int [] array) {
        
        int max = array[0];
        int maxIndex = 0;
        int secondMax = array[0];
    
        for (int i = 0; i < array.length; i++){

            if (array[i] > max) {  
                
                max = array[i];
                maxIndex = i;

            }

            if (i == array.length-1) {
                
                array[maxIndex] = 0;
                
                for (int j = 0; j < array.length; j++){

                    if (array[j] > secondMax) {

                        secondMax = array[j];
                        
                    }

                }

            }
        }

        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {

            int greaterArr = Math.max(array1.length, array2.length);
            int lowerArr = Math.min(array1.length, array2.length);
            int num = 0;

            for (int i = 0; i < greaterArr; i++){

                for (int j = 0; j < lowerArr; j++){

                    if(array1.length == greaterArr && array1[i] == array2[j]){

                        num++;
                        break;

                    } else if (array2.length == greaterArr && array2[i] == array1[j]) {

                        num++; 
                        break;

                    }

                }

            }

            if (num == greaterArr) {

                return true;

            }

        return false;
    }

    public static boolean isSorted(int [] array) {

            if (array[0] < array [1]){

                for (int i = 2; i < array.length; i++){

                    if (array[i] < array[i-1]){

                        return false; 

                    }

                }

            }


            if (array[0] > array[1]){

                for (int i = 2; i < array.length; i++){

                    if (array[i] > array[i-1]){

                        return false; 

                    }

                }

            }

        return true;
    }

}
