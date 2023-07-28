package builder;

public class Computer {
    private String RAM;
    private String HDD;
    private boolean isGraphicCardEnabled;
    private boolean isBluetoothEnabled;

    @Override
    public String toString() {
        return "Computer{" +
                "RAM='" + RAM + '\'' +
                ", HDD='" + HDD + '\'' +
                ", isGraphicCardEnabled=" + isGraphicCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }

    public Computer(String RAM, String HDD, boolean isGraphicCardEnabled, boolean isBluetoothEnabled) {
        this.RAM = RAM;
        this.HDD = HDD;
        this.isGraphicCardEnabled = isGraphicCardEnabled;
        this.isBluetoothEnabled = isBluetoothEnabled;
    }

    public Computer(ComputerBuilder computerBuilder) {
        this.RAM = computerBuilder.RAM;
        this.HDD = computerBuilder.HDD;
        this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
        this.isGraphicCardEnabled = computerBuilder.isGraphicCardEnabled;
    }

    public static class ComputerBuilder {

        private String RAM;
        private String HDD;
        private boolean isGraphicCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder ram(String ram) {
            this.RAM = ram;
            return this;
        }

        public ComputerBuilder hdd(String hdd) {
            this.HDD = hdd;
            return this;
        }

        public ComputerBuilder isGraphicCardEnabled(boolean isGraphicCardEnabled) {
            this.isGraphicCardEnabled = isGraphicCardEnabled;
            return this;
        }

        public ComputerBuilder isBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }


}
