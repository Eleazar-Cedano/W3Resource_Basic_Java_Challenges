package W3Resource;

public class W3Question15 {
    static String swap(String a, String b){
        String temp =  a;
         a = b;
         b = temp;

         return  a + " " + b;
    }

    public static void main(String[] args){

        System.out.println(swap("Heave!", "Ho!"));
    }
}
//15. Write a Java program to swap two variables.

/* I didn't understand the question, so I had to look at the clue.
* The question is asking to swap the values of the variables from a to b, and vice-versa.
* So (a) is what (b) is, and (b) is what (a) was before becoming (b). */
