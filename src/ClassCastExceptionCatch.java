/**
 * Created by emma on 7/14/17.
 */

/**
 * Catches the ClassCastException
 */

public class ClassCastExceptionCatch {

    public static void main(String[] args) {

        try {

            //Using object so that there are no compile errors
            Object name = "Hi";
            int nameInt = (int) name;

        } catch(ClassCastException e) {
            System.out.println("You can't cast between those two types! Try a different type");
        }

    }

}
