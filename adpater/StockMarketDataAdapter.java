public class StockMarketDataAdapter implements CSVParser {
    private StockMarketDataParser stock;

    public StockMarketDataAdapter(StockMarketDataParser stock){
        this.stock = stock;
    }

    @Override
    public void parseCSV(){
        stock.parseFromCSV();
    }
}
