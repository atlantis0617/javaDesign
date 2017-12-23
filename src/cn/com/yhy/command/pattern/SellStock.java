package cn.com.yhy.command.pattern;

public class SellStock implements Order{
	private Stock abcStock;
	
	public SellStock(Stock abcStock){
		this.abcStock = abcStock;
	}

	@Override
	public void execute() {
		abcStock.sell();
	}

}
