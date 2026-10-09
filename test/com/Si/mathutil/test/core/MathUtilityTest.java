/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.Si.mathutil.test.core;

import com.Si.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author ASUS
 */
public class MathUtilityTest {  
    // Đây là class sẽ sử dụng các hàm của thư viện/framework JUnit
    // để kiểm tra-kiểm thử code chính - hàm tínhGiaiThừa() bên class core.MathUtil
    
    // Có nhiều quy tắc đặt tên hàm kiểm thử nhưng thường sẽ nói lên mục đích
    // của các case/tình huống kiểm thử, tình huống sài hàm theo kiểu thành công/thất bại
    
    // Hàm dưới đây là tính huống test hàm chạy thành công, trả về Ngon 
    // ta sẽ sài hàm kiểu Well - đưa 5!, 6! - KHÔNG đưa -5!, 30! (>20)
    //@Test JUnit sẽ phối hợp với JVM để chạy hàm này. @Test phía hậu trường chính là psv Main()
    // Có nhiều @Test ứng với nhiều case khác nhau để kiểm thử hàm
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        int n = 0; //test thử tình huống tử tế đầu vào, phải chạy đúng
        long expected = 1;
            
        long actual = MathUtil.getFactorial(n); //gọi hàm cần test bên core/app chính
       
        // So sánh expected vs actual dùng xanh xanh đỏ đỏ, framework 
        Assert.assertEquals(expected, actual);
        //hàm giúp so sánh 2 giá trị nào đó có giống nhau không. 
        // Nếu giống nhau       -> màu xanh - code ngon ít nhất cho case đang test
        // Nếu không giống nhau -> màu đỏ - expected và actual không giống nhau.
        
        Assert.assertEquals(1,MathUtil.getFactorial(1));
        Assert.assertEquals(2,MathUtil.getFactorial(2)); 
        Assert.assertEquals(6,MathUtil.getFactorial(3));
        Assert.assertEquals(24,MathUtil.getFactorial(4));
        Assert.assertEquals(120,MathUtil.getFactorial(5));
        Assert.assertEquals(720,MathUtil.getFactorial(6));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);  // hàm @Test chạy, hoặc hàm getF() chạy ném về ngoại lệ NumberFormat....
    }

    
    // Cách khác để bắt ngoại lệ xuất hiện , viết tự nhiên hơn : Sài LAMBDA 
    // Test case: hàm sẽ ném về ngoại lệ nếu nhận vào 21 -> Cần thấy màu xanh khi test 21.
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion() {
        //Assert.assertThrows( loại ngoại lệ muốn so sánh , loại ngoại lệ được trả ra runnable );
                
        Assert.assertThrows(IllegalArgumentException.class, () ->  MathUtil.getFactorial(-5));
        
        //MathUtil.getFactorial(-5);
    }
    
    // Bắt ngoại lệ, xem hàm có ném về ngoại lệ hay KO khi N cà chớn.
    // Có ném -> hàm chạy đúng 
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch() {
        try {
            MathUtil.getFactorial(-5);
            
        } catch (Exception e) {
            // bắt try-catch là JUnit sẽ ra xanh do đã chủ động kiểm soát ngoại lệ
            // Nhưng không chắc ngoại lê mình cần có xuất hiện hay không
            // -> Có đoạn code kiểm soát đúng IllegalArgumentException 
            Assert.assertEquals("Invalid argument. N must be between 0...20", e.getMessage()); 
            // Phải đúng cả Message Expected "Invalid arg....." bên hàm gốc 
        }
        
        
    }
    
}
