
public class BuilderPatternDemo {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
        //veg burger coke combo
		Meal vegMeal = mealBuilder.prepareVegMeal();

		System.out.println("Veg Meal");

		vegMeal.showItems();

		System.out.println("Total Cost: " + vegMeal.getCost());
		
		 //chicken burger pepsi combo
		Meal nonvegMeal = mealBuilder.prepareNonvegMeal();

		System.out.println("NonVeg Meal");

		nonvegMeal.showItems();

		System.out.println("Total Cost: " + nonvegMeal.getCost());
		//veg burger pepsi combo
		Meal vegMeal1 = mealBuilder.prepareVegMeal1();

		System.out.println("Veg Meal");

		vegMeal1.showItems();

		System.out.println("Total Cost: " + vegMeal1.getCost());
		
		//chicken burger coke combo
				Meal nonvegMeal1 = mealBuilder.prepareNonvegMeal1();

				System.out.println("NonVeg Meal");

				nonvegMeal1.showItems();

				System.out.println("Total Cost: " + nonvegMeal1.getCost());
	}
	

}
