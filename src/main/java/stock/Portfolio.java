package stock;

import java.util.ArrayList;
import java.util.List;

public class Portfolio
{
   private StockService stockService;

   private List<Stock> stocks = new ArrayList<>();


   public StockService getStockService()
   {
      return this.stockService;
   }


   public void setStockService( final StockService stockService )
   {
      this.stockService = stockService;
   }


   public List<Stock> getStocks()
   {
      return this.stocks;
   }


   public void setStocks( final List<Stock> stocks )
   {
      this.stocks = stocks;
   }


   public void addStocks( final Stock stock )
   {
      this.stocks.add( stock );
   }


   public int getMarketValue()
   {
      return this.stocks.stream().mapToInt( stock -> this.stockService.getPrice( stock ) * stock.getQuantity() ).sum();
   }
}
