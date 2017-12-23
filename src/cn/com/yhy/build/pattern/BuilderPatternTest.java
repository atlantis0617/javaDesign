package cn.com.yhy.build.pattern;

public class BuilderPatternTest {
	public static void main(String[] args) {
		MealBuilder mb = new MealBuilder();
		Meal vegMeal = mb.prepareVegMeal();
		System.out.println("VegMeal");
		vegMeal.showItems();
		System.out.println("Total cost:"+vegMeal.getCost());
		
		Meal nonVegMeal = mb.prepareNonVegMeal();
		System.out.println("NON VEG MEAL");
		nonVegMeal.showItems();
		System.out.println("Total cost:"+nonVegMeal.getCost());
	} 
}
