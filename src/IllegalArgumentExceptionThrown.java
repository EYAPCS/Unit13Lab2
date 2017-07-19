/**
 * Created by emma on 7/14/17.
 */

/**
 * Throws an IllegalArgumentException
 */

public class IllegalArgumentExceptionThrown {

    public static void main(String[] args) {

        if(args.length == 0) {
            //Throwing it myself because otherwise it will create a compile error
            throw new IllegalArgumentException();
        }

    }

}
