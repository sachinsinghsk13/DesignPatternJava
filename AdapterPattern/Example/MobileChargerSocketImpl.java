public class MobileChargerSocketImpl implements MobileChargerSocket {
    private Volt volt;

    MobileChargerSocketImpl(int value) {
        this.volt = new Volt();
        this.volt.setValue(value);
    }
    @Override
    public Volt get3Volt() {
        return this.volt;
    }

}