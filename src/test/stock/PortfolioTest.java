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
package stock;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.junit.Test;

public class PortfolioTest
{

   @Test
   public void stocksReady_calculateMarketValue_resultAsExpected()
   {
      // Given
      final Stock microsoft = new Stock( UUID.randomUUID().toString(), "Microsoft", 100 );
      final Stock apple = new Stock( UUID.randomUUID().toString(), "Apple", 100 );
      final Portfolio sut = new Portfolio();
      final List<Stock> stocks = new ArrayList<>();
      stocks.add( microsoft );
      stocks.add( apple );
      sut.setStocks( stocks );


      final StockService stockService = mock( StockService.class );
      when( stockService.getPrice( any() ) ).thenReturn( 10 );
      sut.setStockService( stockService );

      // When
      final int actual = sut.getMarketValue();

      // Then
      verifyNoInteractions( stockService );
//      verify( stockService ).getPrice( eq( microsoft ) );
//      assertThat( actual, equalTo( 2000 ) );
   }

}
