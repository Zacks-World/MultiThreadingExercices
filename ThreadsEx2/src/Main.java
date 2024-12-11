//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int [] Tab = {1,35,89,100,55,89,35,99,47,29,64,774,1000};
        Thread th1 = new Thread(new Sommeur(Tab,0,5));
        Thread th2 = new Thread(new Sommeur(Tab,6,8));
        Thread th3 = new Thread(new Sommeur(Tab,9,12));
        th1.start();
        th2.start();
        th3.start();
        th1.join();
        th2.join();
        th3.join();

        System.out.println(Sommeur.getSomme());
    }
}