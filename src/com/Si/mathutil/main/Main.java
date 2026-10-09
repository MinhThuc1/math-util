/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Si.mathutil.main;

import com.Si.mathutil.core.MathUtil;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        
        
        //thử hàm tính giai thừa coi chạy đúng thiết kế không
        // ta phải đưa ra các tình huống sử dụng hàm trong thực tế. 
        //-> TEST CASE: 1 tình huống hàm/app/màn hình/tính năng được đưa vào sử dụng
        // giả lập hành vi sài app/hàm của ai đó, bao gồm:
        // INPUT : DATA ĐẦU VÀO CỤ THỂ NÀO ĐÓ
        // OUTPUT: ĐẦU RA ỨNG VỚI XỬ LÍ HÀM/CHỨC NĂNG CỦA APP, DĨ NHIÊN DÙNG ĐẦU VÀO ĐỂ XỬ LÍ
        // KÌ VỌNG: MONG HÀM SẼ TRẢ VỀ VALUE NÀO ĐÓ ỨNG VỚI INPUT TRÊN, SO SÁNH XEM KQ CÓ NHƯ KÌ VỌNG
        
        long expected = 120;
        int n = 5;
        
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " expected");
        System.out.println("5! = " + actual + " actual");
        
        
        
    }
}
