/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.giaolang.mathutil.core;

import static com.giaolang.mathutil.core.MathUtil.getFactorial;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Admin
 */
@RunWith(value = Parameterized.class)
public class AdvancedFactorialTest {
    //muc dich de tach toan bo cac data can test ra mot ham rieng de thuan tien cho viec xu li
    @Parameters
    public static Object[][] initData() {
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {5, 120},
            {6,720}
        };
    }

    @Parameter(value = 0)
    public int input;
    @Parameter(value = 1)
    public int expected;

    @Test
    public void checkFactorialGivenCorrectArgumentReturnsWell() {
        assertEquals(expected, getFactorial(input));
    }

}
