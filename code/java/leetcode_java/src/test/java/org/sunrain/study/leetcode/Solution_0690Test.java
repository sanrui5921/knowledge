package org.sunrain.study.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class Solution_0690Test {

    Solution_0690 solution;

    @Before
    public void init() {
        solution = new Solution_0690();
    }

    @Test
    public void getImportanceTest1() {
        //[[2,5,[]]]
        Employee employee1 = new Employee();
        employee1.id = 2;
        employee1.importance = 5;
        employee1.subordinates = new ArrayList<>();

    }
}
