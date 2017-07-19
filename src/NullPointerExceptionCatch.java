/**
 * Created by emma on 7/14/17.
 */

/**
 * Catches the NullPointerException
 */

public class NullPointerExceptionCatch {

    public static void main(String[] args) {

        try {
            String name = null;
            name.length();
        } catch(NullPointerException e) {
            System.out.println("You can't use null there!");
        }

    }

}
