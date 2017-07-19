/**
 * Created by emma on 7/14/17.
 */

/**
 * Catches the ArrayIndexOutOfBoundsException
 */

public class ArrayIndexOutOfBoundsExceptionCatch {

    public static void main(String[] args) {

        try {
            String[] words = {"hello", "world", "blah"};
            System.out.println(words[5]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("That index is larger than the length of the array! Try a smaller index");
        }

    }

}
