
public class MealBuilder {
	public Meal prepareVegMeal (){

		Meal meal = new Meal();

		meal.addItem(new VegBurger());

		meal.addItem(new Coke());

		return meal;

		}
	public Meal prepareVegMeal1 (){

		Meal meal = new Meal();

		meal.addItem(new VegBurger());

		meal.addItem(new Pepsi());

		return meal;

		}
	public Meal prepareNonvegMeal (){

		Meal meal = new Meal();

		meal.addItem(new ChickenBurger());

		meal.addItem(new Pepsi());

		return meal;

		}
	public Meal prepareNonvegMeal1 (){

		Meal meal = new Meal();

		meal.addItem(new ChickenBurger());

		meal.addItem(new Coke());

		return meal;

		}
}
