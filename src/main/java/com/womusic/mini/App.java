package com.womusic.mini;

import java.util.List;

/**
 * Entry point to show the solution to the problem,
 * including both stage one and stage two solutions.
 *
 * @author wuyongtao
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<String> results = null;
        System.out.println("-------------------- Stage One Solution ---------------------------------");

        StageOneMapper stageOneMapper = new StageOneMapper();
        Solution stageOneSolution = new Solution(stageOneMapper);
        int[] testNumbers={2,1,9,3};
        results = stageOneSolution.CalCombinationsByNumbers(testNumbers);
        System.out.println("result size=" + results.size());
        for(int i=0; i<results.size(); i++) {
            System.out.print(results.get(i) + " ");
        }
        System.out.println("");
        System.out.println("-------------------- Stage One Solution End ----------------------------- ");

        System.out.println("-------------------- Stage Two Solution ---------------------------------");

        StageTwoMapper stageTwoMapper = new StageTwoMapper();
        Solution stageTwoSolution = new Solution(stageTwoMapper);
        int[] testNumbers2={91,22};
        results = stageTwoSolution.CalCombinationsByNumbers(testNumbers2);
        System.out.println("result size=" + results.size());
        for(int i=0; i<results.size(); i++) {
            System.out.print(results.get(i) + " ");
        }
        System.out.println("");
        System.out.println("-------------------- Stage Two Solution End ----------------------------- ");
    }
}
