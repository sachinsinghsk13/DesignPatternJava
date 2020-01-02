public class CarBatteryChargerSocketImpl implements CarBatteryChargerSocket {
    private Volt volt;

    CarBatteryChargerSocketImpl(int value) {
        this.volt = new Volt();
        this.volt.setValue(value);
    }

    @Override
    public Volt get12Volt() {
        return this.volt;
    }
}