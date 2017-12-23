package cn.com.yhy.command.pattern;

public class CommandPatternTest {
	public static void main(String[] args) {
		Stock abcStock = new Stock();
		
		BuyStock buy = new BuyStock(abcStock);
		SellStock sell = new SellStock(abcStock);
		
		Broker broker = new Broker();
		broker.takeOrder(buy);
		broker.takeOrder(sell);
		
		broker.placeOrders();
	}
}
