/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.giaolang.mathutil.main;

import com.giaolang.mathutil.core.MathUtil;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        //MathUtil.getFactorial(-5);
        System.out.println("0!:1?"+MathUtil.getFactorial(0));
        System.out.println("1!:1?"+MathUtil.getFactorial(1));
        System.out.println("5!:120?"+MathUtil.getFactorial(6));
    }
}
