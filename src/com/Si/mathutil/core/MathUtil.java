/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Si.mathutil.core;

/**
 *
 * @author ASUS
 */
public class MathUtil {
    
    //Class này cung cấp cho ai đó nhiều hàm xử lí toán học - clone class Math của JDK
    //Hàm thư viện sài chung cho ai đó mà ko cần lưu trạng thái/giá trị
    //          => Chọn thiết kế hàm STATIC
    
    
    // Hàm tính giai thừa -  n! = 1.2.3.4.5... n (KHÔNG có giai thừa số ÂM)
    // QUY ƯỚC: 0! = 1! = 1
    // Giai thừa là hàm đồ thị dốc đứng, tăng nhanh về phía giá trị.
    // 20! ~ 18 con số 0, vừa đủ cho kiểu Long trong Java
    // -> bài này n! với n chỉ trong khoảng 0...20 (21! tràn kiểu Long)
    public static long getFactorial (int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. N must be between 0...20");
        
        if (n == 0 || n == 1)
            return 1;
        
        long product = 1;
        
        for (int i = 2; i <= n; i++) 
            product *= i;
        return product;
    }
}
