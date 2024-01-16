public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
        System.out.println(capVowelsLowRest("heLLo WorLD"));
    }

    public static String capVowelsLowRest (String string) {

        String newS = "";
        char C;

        for (int i = 0; i < string.length(); i++){

            if (string.charAt(i) >= 97 && string.charAt(i) <= 122 || string.charAt(i) == 32){
            
                    newS += string.charAt(i);
                
                }
                else {

                    C = string.charAt(i);
                    C += 32;
                    newS += C;

                }

            

        }

        return newS;
    }

    public static String camelCase (String string) {
        // Write your code here:
        return "";
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
