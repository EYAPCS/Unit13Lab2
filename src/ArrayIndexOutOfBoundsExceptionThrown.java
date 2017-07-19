/**
 * Created by emma on 7/14/17.
 */

/**
 * Throws an ArrayIndexOutOfBoundsException because the length of words is 3
 */

public class ArrayIndexOutOfBoundsExceptionThrown {

    public static void main(String[] args) {

        String[] words = {"hello", "world", "blah"};

        System.out.println(words[5]);

    }

}
