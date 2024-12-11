//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       Thread th1 = new Thread(new Talkative(1,"thread1"));
       Thread th2 = new Thread(new Talkative(2,"thread2"));
       Thread th3 = new Thread(new Talkative(3,"thread3"));
       Thread th4 = new Thread(new Talkative(4,"thread4"));
       Thread th5 = new Thread(new Talkative(5,"thread5"));
       Thread th6 = new Thread(new Talkative(6,"thread6"));
       Thread th7 = new Thread(new Talkative(7,"thread7"));
       Thread th8 = new Thread(new Talkative(8,"thread8"));
       Thread th9 = new Thread(new Talkative(9,"thread9"));
       Thread th10 = new Thread(new Talkative(10,"thread10"));
       th1.start();
       th2.start();
       th3.start();
       th4.start();
       th5.start();
       th6.start();
       th7.start();
       th8.start();
       th9.start();
       th10.start();



    }
}