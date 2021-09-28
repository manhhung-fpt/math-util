/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.giaolang.mathutil.core;

import org.junit.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

/**
 *
 * @author Admin
 */
@RunWith(value=Parameterized.class)
public class DataDrivenMathUtilTest {
    @Parameter(value=0)
    public int intput;//ung voi cot 0
    @Parameter(value =1)
    public long expected;//ung voi cot 1
    
    @Test //no se tu loop qua cac ham unit o duoi
    public void checkFactorialGivenCorrectArgumentReturnsWell()
    {
        assertEquals(expected,MathUtil.getFactorial(intput));
    }
    
    @Parameterized.Parameters
    public static Object[][] initData()
    {   
        //int a[]={1,1,2,3,4,5,8,13,21};//mang 8 phan tu
                                       //mang 8 bien int co san value
        return new Integer[][]
        {
                        {0,1},
                        {1,1},
                        {3,6},
                        {5,2120},
                        {7,5040},
        };//dang chuan bi bo data
        //sau dua dua cho ham getfacotrial()
        //assert equal(1,?)
        //date driven testing
    }
}
