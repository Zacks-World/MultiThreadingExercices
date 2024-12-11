public class Talkative implements Runnable{
    private int Param;
    private String Name;
    public Talkative(int param,String name){
        Name=name;
        Param=param;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Name+" "+Param);
        }

    }

}
