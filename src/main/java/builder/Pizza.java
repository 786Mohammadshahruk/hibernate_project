package builder;

public class Pizza {
    private String sauce;
    private String crust;
    public boolean cheese;

    private Pizza() {

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "sauce='" + sauce + '\'' +
                ", crust='" + crust + '\'' +
                ", cheese=" + cheese +
                '}';
    }

    public static class PizzaBuilder {
        private String sauce;
        private String crust;
        public boolean cheese;

        public PizzaBuilder() {
            crust = "thin";
            sauce = "tomato";
        }

        public PizzaBuilder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public Pizza build() {
            Pizza pizza = new Pizza();
            pizza.sauce = this.sauce;
            pizza.cheese = this.cheese;
            pizza.crust = this.crust;
            return pizza;
        }
    }
}
