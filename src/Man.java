public class Man extends Rachet {
    private double kaf;

    public Man(String name, int old,int stag, double kaf) {
        super(name, old,stag);
        this.kaf = kaf;
    }

    public Man(){}

    public double getKaf() {
        return kaf;
    }

    public void setKaf(double kaf) {
        this.kaf = kaf;
    }



    public double individualCalculation(double x){
        return x * kaf + getStag() * kaf * 100;
    }


}
