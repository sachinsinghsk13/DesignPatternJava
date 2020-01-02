public class Main {
    public static void main(String[] args) {
        WallSocket wallSocket = new WallSocketImpl(240);
        System.out.println(wallSocket.getVolt());

        SocketAdapter sa = new SocketAdapter(wallSocket);
       MobileChargerSocket mcs = sa;
       System.out.println(mcs.get3Volt());

       CarBatteryChargerSocket cbcs = sa;
       System.out.println(cbcs.get12Volt());
    }
}