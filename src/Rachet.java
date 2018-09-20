public abstract class Rachet {
    private String name;
    private int old;
    private int stag;

    public Rachet(String name, int old,int stag) {
        this.name = name;
        this.old = old;
        this.stag = stag;
    }

    public Rachet(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public int getStag() {
        return stag;
    }

    public void setStag(int stag) {
        this.stag = stag;
    }

    public void calcul(){
        double x = old * 0.2 *1500;
        double p = individualCalculation(x);
        double rez = p/(old -5);
        System.out.println(name+" возраст - "+old+" "+"пенсия - "+rez);
        System.out.println("-------------------------------------------");

    }
    public abstract double individualCalculation(double x);



}
