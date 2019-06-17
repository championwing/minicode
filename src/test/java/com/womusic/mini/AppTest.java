package com.womusic.mini;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

/**
 * Unit test for minicode.
 */
public class AppTest 
{
    @Test
    public void testStageOne()
    {
        StageOneMapper stageOneMapper = new StageOneMapper();
        Solution stageOneSolution = new Solution(stageOneMapper);
        int[] testNumbers={2,1,9,3};
        List<String> results = stageOneSolution.CalCombinationsByNumbers(testNumbers);
        assertTrue( results.size() == 36 );
        assertTrue( results.get(0).equals("awd"));
        assertTrue( results.get(35).equals("czf"));
    }

    @Test
    public void testStageTwo()
    {
        StageOneMapper stageTwoMapper = new StageTwoMapper();
        Solution stageTwoSolution = new Solution(stageTwoMapper);
        int[] testNumbers={1,20,3};
        List<String> results = stageTwoSolution.CalCombinationsByNumbers(testNumbers);
        assertEquals( 9, results.size());
        assertEquals( "ad", results.get(0));
        assertEquals( "cf", results.get(8));
    }
}
