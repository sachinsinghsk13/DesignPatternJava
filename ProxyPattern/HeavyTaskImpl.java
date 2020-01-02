public class HeavyTaskImpl implements HeavyTaskInf {

    public HeavyTaskImpl() {
        System.out.println("Real Heavy Task Worker Created");
    }

    @Override
    public void doTask() {
        System.out.println("I'm the Real Heavy Task Worker");
        System.out.println("Now I'm Doing Heavy Task");
    }

}