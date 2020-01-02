public class SocketAdapter implements MobileChargerSocket, CarBatteryChargerSocket {
    private WallSocket wallSocket;

    SocketAdapter(WallSocket ws) {
        this.wallSocket =ws;
    }

    @Override
    public Volt get12Volt() {
        Volt v = new Volt();
        v.setValue(this.wallSocket.getVolt().getValue()/20);
       return v;
    }

    @Override
    public Volt get3Volt() {
        Volt v = new Volt();
        v.setValue(this.wallSocket.getVolt().getValue()/80);
        return v;
    }

}