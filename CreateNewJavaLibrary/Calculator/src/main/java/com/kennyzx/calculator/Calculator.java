/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kennyzx.calculator;

import com.kennyzx.simplemath1.*;
import com.kennyzx.simplemath2.*;

/**
 *
 * @author kennyzx
 */
public class Calculator {
    public static void main(String... args)
    {
        int result1 = MyAdd.AddByDouble(34, 4);
        int result2 = MySubtract.SubtractByDouble(34, 4);
        System.out.println(String.valueOf(result1) + String.valueOf(result2));
    }
}
