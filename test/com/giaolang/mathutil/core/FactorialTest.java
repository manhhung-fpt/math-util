/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.giaolang.mathutil.core;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized.Parameters;


/**
 *
 * @author Admin
 */
public class FactorialTest {
    
    @Test //viet code dung de check code chinh cua class mathutil
    //dat ten ham phai noi len muc dich cua vieec test
        public void checkFactorialGivenCorrectArgumentReturnsWell()
        {   //expected di truoc , ket qua di sau
            long expected=120;
            long actual = MathUtil.getSo1(5);
            assertEquals(expected, actual);
            assertEquals(720, MathUtil.getFactorial(6));
            assertEquals(1, MathUtil.getFactorial(1));
            assertEquals(1, MathUtil.getFactorial(0));
        }
    @Test(expected = IllegalArgumentException.class)
    public void checkFactorialGivenWrongArgumentThrowException()
    {
        MathUtil.getFactorial(-5);
        MathUtil.getFactorial(21);
    }
    
    //data
    

}
