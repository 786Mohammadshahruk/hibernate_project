package builder;

public class Test {

    public static void main(String[] args) {

        Pizza pizza = new Pizza.PizzaBuilder().cheese(true).build();
        System.out.println(pizza);


        Computer computer = new Computer.ComputerBuilder().ram("RAM").isBluetoothEnabled(true).build();

        System.out.println(computer);
    }
}
