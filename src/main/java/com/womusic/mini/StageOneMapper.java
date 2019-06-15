package com.womusic.mini;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of mapping one number from 0..9 to possible strings
 */
public class StageOneMapper implements IStringGenerator{
    String mapper[][]={{""},{""},{"a", "b", "c"},{"d", "e", "f"}, {"g", "h", "i"},{"j", "k", "l"},
            {"m", "n", "o"},{"p", "q", "r", "s"}, {"t", "u", "v"},{"w", "x", "y", "z"}};

    public List<String> genListByOneNumber(int number)
    {
        List<String> list = new ArrayList<String>();
        if (number<0 || number>9) {
            list.add("");
            return list;
        }

        for (int i=0; i<mapper[number].length; i++) {
            list.add(mapper[number][i]);
        }
        return list;
    }
}
