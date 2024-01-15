public class ArrayOps {
    public static void main(String[] args) {
        
        System.out.println(isSorted(new int[] {7, 5, 4, 3, -12}));
        System.out.println(isSorted(new int[] {1, 2, 3})); // true
        System.out.println(isSorted(new int[] {1, -2, 3})); // false
        System.out.println(isSorted(new int[] {1, 1, 500})); // true
        System.out.println(isSorted(new int[] {1, 3, 2})); // false
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
        
        int [] arr2 = new int [array.length];
        int max = array[0];
        int secondMax = arr2[0];
        int repetitionCounter = 0;
    
        for (int i = 0; i < array.length; i++){

            if (array[i] > max)    max = array[i];

        }

        for (int l = 0; l < array.length; l++){

            if(array[l] == max)     repetitionCounter++;

            if(repetitionCounter > 1)        return max;

        }

        for (int j = 0; j < arr2.length; j++){

            if (array[j] != max)      arr2[j] = array[j];

        }

        for (int i = 0; i < arr2.length; i++){

            if (arr2[i] > secondMax)    secondMax = arr2[i];

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

            //increasing 
            if (array[0] < array [1]){

                for (int i = 2; i < array.length; i++){

                    if (array[i] < array[i-1]){

                        return false; 

                    }

                }

            }


            //decreasing
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
