package homework30.telran.dateComparator;

import java.util.Comparator;

public class DateComparator implements Comparator<String> {
    @Override
    public int compare(String arg0, String arg1) {
        if (arg0.substring(6).equals(arg1.substring(6)))
            if (arg0.substring(3, 5).equals(arg1.substring(3, 5)))
                return arg0.substring(0, 3).compareTo(arg1.substring(0, 3));
            else
                return arg0.substring(3, 5).compareTo(arg1.substring(3, 5));
        else
            return arg0.substring(6).compareTo(arg1.substring(6));
        //такое решение достаточно универсально. Даты в формате "01.01.2021", "01/01/2021" и т.д. будут точно так же работать

    }
}


