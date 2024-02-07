package N1Ex3;

import java.util.ArrayList;

public class OutOfBoundsException {


    public static void outOfBoundsException() {
    int index = 0;

      ArrayList<Integer> names = new ArrayList<Integer>();
      if (index <= names.size()) {
        throw new ArrayIndexOutOfBoundsException();
    }
}
}
