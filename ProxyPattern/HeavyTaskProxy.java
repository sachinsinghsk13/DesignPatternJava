public class HeavyTaskProxy implements HeavyTaskInf {
    private HeavyTaskImpl heavyTaskImpl;
    
    HeavyTaskProxy() {
        System.out.println(" Created... I'm Fake Heavy Task Worker. I just show I do Heavy Task");
    }

    public void setHeavyTaskImpl(HeavyTaskImpl heavyTaskImpl) {
        this.heavyTaskImpl = heavyTaskImpl;
    }

    @Override
    public void doTask() {
        System.out.println("proxy do task method is called");
        if (this.heavyTaskImpl == null)
            this.heavyTaskImpl = new HeavyTaskImpl();
        this.heavyTaskImpl.doTask();    
    }

}