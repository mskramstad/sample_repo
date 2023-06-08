public class Stock {
    private String company;
    private String symbol;
    private String[] products;
    private double price;
    
    // constructor with no data provided
    public Stock () {
    this.company = "";
    this.symbol = "";
    this.products = new String[10];
    this.price = 0;
    }
    // constructor with data provided
    public Stock (String company, String symbol, double price) {
    this.company = company;
    this.symbol = symbol;
    this.price = price;
    }
    
    public String toString() {
        return company;
    }
}