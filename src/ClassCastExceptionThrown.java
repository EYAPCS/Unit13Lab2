/**
 * Created by emma on 7/14/17.
 */
public class ClassCastExceptionThrown {

    public static void main(String[] args) {

        //Using object so that there are no compile errors
        Object name = "Hi";
        int nameInt = (int) name;
    }

}
