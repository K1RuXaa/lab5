package commandProvider;

import spaceMarines.SpaceMarine;
import java.util.Comparator;

public class CompareSpaceMarine implements Comparator<SpaceMarine> {
    @Override
    public int compare(SpaceMarine sp1, SpaceMarine sp2){
        return sp1.getName().length() - sp2.getName().length();
    }
}
