package N1Ex3;

import java.util.ArrayList;

public class OutOfBoundsException {


    public static void outOfBoundsException() throws ArrayIndexOutOfBoundsException {
    int index = 0;

      ArrayList<Integer> names = new ArrayList<Integer>();
      if (index < names.size()) {
        throw new ArrayIndexOutOfBoundsException();
    }
}
}
