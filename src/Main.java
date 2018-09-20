public class Main {
    public static void main(String[] args) {
        Rachet man = new Man("Mironov", 65, 30, 1.2);
        Rachet women = new Women("Mironova", 60, 20, 2);
        Rachet warMan = new WarMan("Warman", 50,15,1.3,2);

        man.calcul();
        women.calcul();
        warMan.calcul();

    }
}
