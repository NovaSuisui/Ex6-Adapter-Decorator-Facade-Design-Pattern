public class App {

	public static void main(String[] args) {
		
		CSVParser realEstate = new RealEstateMarketDataParser();
		CSVParser machineLearning = new MachineLearningDataParser();
		CSVParser stockParser = new StockMarketDataAdapter(new StockMarketDataParser());
			
		parse(realEstate);
		parse(machineLearning);
		parse(stockParser);
		
	}
	public static void parse(CSVParser parser) {
		parser.parseCSV();
	}
}
