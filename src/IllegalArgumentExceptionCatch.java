/**
 * Created by emma on 7/14/17.
 */

/**
 * Catches the IllegalArgumentException
 */

public class IllegalArgumentExceptionCatch {

    public static void main(String[] args) {

        try {
            if(args.length == 0) {
                //Throwing it myself because otherwise it will create a compile error
                throw new IllegalArgumentException();
            }
        } catch(IllegalArgumentException e) {
            System.out.println("You can't use that parameter with the function!");
        }

    }

}
