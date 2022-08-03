package learnCollection;

import java.util.ArrayList;

public class NonNullArrayList extends ArrayList {
    @Override
    public boolean add(Object o) {
        if (o == null)
            return false;
        return super.add(o);
    }
}