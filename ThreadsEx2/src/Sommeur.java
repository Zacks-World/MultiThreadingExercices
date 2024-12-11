public class Sommeur implements Runnable{
    int[] Tab;
    int Debut;
    int Fin;
    static int Somme;
    @Override
    public void run() {
        for (int i = Debut; i < Fin; i++) {
            Somme+=Tab[i];
        }

    }
    public Sommeur(int[] tab, int debut, int fin) {
        Tab = tab;
        Debut = debut;
        Fin = fin;
    }
    public static int getSomme(){
        return Somme;
    }
}
