package calculator;

public class SimpleCalculator implements Calculator
{
   public int sum( final int i, final int i1 )
   {
      return i + i1;
   }


   @Override
   public int add( final int first, final int second )
   {
      return first + second;
   }


   @Override
   public long multiply( final int first, final int second )
   {
      return ( long ) first * second;
   }


   @Override
   public long divide( final int first, final int second )
   {
      return first / second;
   }


   @Override
   public long pow( final int num, final int power )
   {
      return ( long ) Math.pow( num, power );
   }
}
