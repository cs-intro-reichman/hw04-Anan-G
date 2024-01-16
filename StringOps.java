public class StringOps {
    public static void main(String[] args) {

    }

    public static String capVowelsLowRest (String string) {

        String newS = "";
        char C;

        for (int i = 0; i < string.length(); i++){

            if (string.charAt(i) == 97 || string.charAt(i) == 101 || string.charAt(i) == 105 || string.charAt(i) == 111 || string.charAt(i) == 117){

                C = string.charAt(i);
                C -= 32; 
                newS += C;

            } else if (string.charAt(i) >= 98 && string.charAt(i) <= 122 || string.charAt(i) == 32
                        || string.charAt(i) == 65 || string.charAt(i) == 69 || string.charAt(i) == 73 
                        || string.charAt(i) == 79 || string.charAt(i) == 85){
            
                    newS += string.charAt(i);
                
                } else {

                    C = string.charAt(i);
                    C += 32;
                    newS += C;

                }

        }

        return newS;
    }

    public static String camelCase (String string) {

        int indexLetter = 0;
        String substr = "";
        String newS = "";
        char C;

        for (int i = 0; i < string.length(); i++){

            if (string.charAt(i) >= 65){

                indexLetter = string.indexOf(string.charAt(i));
                break;
            }
        }

        substr = string.substring(indexLetter);

        if(substr.charAt(0) < 97){

            C = substr.charAt(0); 
            C += 32;
            newS += C;

            } else {

                newS += substr.charAt(0);

            }

        for(int j = 1; j < substr.length(); j++){

            C = substr.charAt(j);

            if ((substr.charAt(j-1) == 32) && (substr.charAt(j) >= 97)){

                C = substr.charAt(j);
                C -= 32;
                newS += C;
                
            } else if ((substr.charAt(j) < 97) && (substr.charAt(j-1) != 32) && (C != 32)){

                C = substr.charAt(j);
                C += 32;
                newS += C;
                
            } else if (C != 32){

                newS += C;
            
                }
        }

        return newS;
    }

    public static int[] allIndexOf (String string, char chr) {

        int indexCounter = 0;
        int arrayIndexCounter = 0;

        for (int i = 0; i < string.length(); i++){

            if (string.charAt(i) == chr){

                indexCounter++;

            }
        }

        int[] arr1 = new int[indexCounter];

        for (int j = 0; j < string.length(); j++){

            for (int i = arrayIndexCounter; i < arr1.length; i++){

              if (string.charAt(j) == chr){
            
                    arr1[i] = j;
                    arrayIndexCounter++;
                    break;

                } 
            }
        }

        return arr1;
    }
}
