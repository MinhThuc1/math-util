    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.Si.mathutil.test.core;

import com.Si.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author ASUS
 */

// Báo hiệu cần loop qua tập data để lấy cặp input/expected nhồi vào hàm test
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    @Parameterized. Parameters // JUnit ngầm chạy lướt qua từng dòng của mảng để lấy ra 
            // từng cặp Data Input/Expected . Tên hàm ko quan trọng, quan trọng là @
    public static Object[][] initData() { // Trả về mảng 2 chiều gồm nhiều cặp Expected | Input
        return new Integer[][] {
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {6, 720},
                
        };
    }
    
    // giả sử Loop qua từng dòng của mảng, ta cần gán từng value của cột vào biến 
    // tương ứng input/ expected để feed cho hàm
    
    @Parameterized.Parameter(value = 0) // map với biến [0] của mảng
    public int n; // biến map với value của cột 0 của mảng
    
    @Parameterized.Parameter(value = 1)
    public long expected; // giá trị trả về của hàm getF()
    
    @Test
    public void testGetFactorialGivenRightArguemntReturnWell() { // 1 hàm nhưng test 6 test cases
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
    
    
 }

