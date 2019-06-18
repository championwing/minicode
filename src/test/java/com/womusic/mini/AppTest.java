package com.womusic.mini;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

/**
 * Unit test for minicode.
 */
public class AppTest 
{
    /*
        TestCase of stage one:(2,1,9,3) is equal to (2,9,3), so the result set size would be 36
     */
    @Test
    public void testStageOne()
    {
        StageOneMapper stageOneMapper = new StageOneMapper();
        Solution stageOneSolution = new Solution(stageOneMapper);
        int[] testNumbers={2,1,9,3};
        List<String> results = stageOneSolution.CalCombinationsByNumbers(testNumbers);
        assertTrue( results.size() == 36 );
        assertEquals( "awd", results.get(0));
        assertEquals( "bwd", results.get(12));
        assertEquals( "czf", results.get(35));
    }

    /*
     TestCase of stage two:1,20,3. Since 1, 0 have no output to result, so the serial is equal to 2,3,
     so the result set size would be 9
    */
    @Test
    public void testStageTwo()
    {
        StageOneMapper stageTwoMapper = new StageTwoMapper();
        Solution stageTwoSolution = new Solution(stageTwoMapper);
        int[] testNumbers={1,20,3};
        List<String> results = stageTwoSolution.CalCombinationsByNumbers(testNumbers);
        assertTrue( results.size() == 9);
        assertEquals( "ad", results.get(0));
        assertEquals( "be", results.get(4));
        assertEquals( "cf", results.get(8));
    }

    /*
     TestCase of stage two:91, 22. Since 1, have no output to result, so the serial is equal to
     9,2,2, so the result set size would be 36
    */
    @Test
    public void testStageTwo_2()
    {
        StageOneMapper stageTwoMapper = new StageTwoMapper();
        Solution stageTwoSolution = new Solution(stageTwoMapper);
        int[] testNumbers={91, 22};
        List<String> results = stageTwoSolution.CalCombinationsByNumbers(testNumbers);
        assertTrue( results.size() == 36);
        assertEquals( "waa", results.get(0));
        assertEquals( "xcb", results.get(16));
        assertEquals( "zcc", results.get(35));
    }
}
