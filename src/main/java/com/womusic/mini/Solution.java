package com.womusic.mini;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Make solution to calculate all possible strings representing given number serials
 */
public class Solution {
    private List<String> combinations;
    private IStringGenerator generator;

    public Solution(IStringGenerator gen) { generator = gen; }

    //calculate all possible strings from number serials
    public List<String> CalCombinationsByNumbers(int[] numbers) {
        combinations = new ArrayList<String>();
        GenCombinations(numbers, 0, "");
        return combinations;
    }

    public void GenCombinations(int[] numbers, int depth, String combination)
    {
        //when make one possible string, add it to result set
        if (depth>=numbers.length) {
            combinations.add(combination);
            return;
        }

        //get all possibilities on number[depth]
        List<String> possibilities =  generator.genListByOneNumber(numbers[depth]);

        //recursefully call CalCombinations to get next number possibilities
        for(int i=0; i<possibilities.size(); i++) {
            String tmp = combination + possibilities.get(i);
            GenCombinations(numbers, depth+1, tmp);
        }
    }

}
