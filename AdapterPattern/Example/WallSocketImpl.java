public class WallSocketImpl implements WallSocket {
    private Volt volt;
    WallSocketImpl(int value) {
        this.volt = new Volt();
        this.volt.setValue(value);
    }
    @Override
    public Volt getVolt() {
        return this.volt;
    }

}