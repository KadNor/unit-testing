/************************************************************************
 ** PROJECT:   XVP
 ** LANGUAGE:  Java, J2SE JDK 1.8
 **
 ** COPYRIGHT: FREQUENTIS AG
 **            Innovationsstrasse 1
 **            A-1100 VIENNA
 **            AUSTRIA
 **            tel +43 1 811 50-0
 **
 ** The copyright to the computer program(s) herein
 ** is the property of Frequentis AG, Austria.
 ** The program(s) shall not be used and/or copied without
 ** the written permission of Frequentis AG.
 **
 ************************************************************************/
package calculator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest
{
   @Test
   public void calculator_addition_sumAsExpected()
   {
      // Given
      final SimpleCalculator simpleCalculator = new SimpleCalculator();

      // When
      final int result = simpleCalculator.sum( 1, 2 );

      // Then
      Assert.assertEquals( result, 3 );
   }


   @Test
   public void addition_overflow_sumAsExpected()
   {
      // Given
      final SimpleCalculator simpleCalculator = new SimpleCalculator();

      // When
      final int result = simpleCalculator.sum( 1, 2 );

      // Then
      Assert.assertEquals( result, 3 );
   }


   @Test
   public void multiply_bigNumbers_overflow()
   {
      // Given
      final SimpleCalculator sut = new SimpleCalculator(); // System Under Test

      // When
      final long actual = sut.multiply( Integer.MAX_VALUE, 2 );

      // Then
//      Assert.assertEquals( 4294967294L, actual );
      assertThat( actual, equalTo( 4294967294L ) );
   }


   @Test(expected = ArithmeticException.class)
   public void divide_byZero_exception()
   {
      // Given
      final SimpleCalculator sut = new SimpleCalculator(); // System Under Test

      // When
      final long actual = sut.divide( 1, 0 );
   }


   public void divideByZero_shouldThrowAnException()
   {

   }
}
