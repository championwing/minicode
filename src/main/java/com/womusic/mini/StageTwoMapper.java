package com.womusic.mini;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of mapping one number from 0..99 to possible strings
 */
public class StageTwoMapper extends StageOneMapper {

    // split two numbers from 0..99 to two numbers of 0..9, and call StageOneSolution to get all possible strings
    public List<String> genListByOneNumber(int number) {
        List<String> list = new ArrayList<String>();
        if (number<0 || number>99) {
            list.add("");
            return list;
        }

        //if number has one digit
        if (number<10)
            return super.genListByOneNumber(number);

        //number has two digits, and split to left and right and enumerate all possible stirngs
        List<String> left = super.genListByOneNumber(number/10);
        List<String> right = super.genListByOneNumber(number%10);

        for (int i = 0; i<left.size(); i++)
            for (int j = 0; j < right.size(); j++)
                list.add(left.get(i) + right.get(j));

        return list;
    }
}
