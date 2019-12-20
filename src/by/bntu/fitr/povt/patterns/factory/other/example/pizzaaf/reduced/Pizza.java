package by.bntu.fitr.povt.patterns.factory.other.example.pizzaaf.reduced;

public abstract class Pizza {
	String name;

	Cheese cheese;

	abstract void prepare();

	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (cheese != null) {
			result.append(cheese);
			result.append("\n");
		}

		return result.toString();
	}
}
