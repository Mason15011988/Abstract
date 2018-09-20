public class WarMan extends Man{
    private double warKaf;

    public WarMan(String name, int old, int stag ,double kaf, double warKaf) {
        super(name, old, stag ,kaf);
        this.warKaf = warKaf;
    }

    public WarMan(){}

    public double getWarKaf() {
        return warKaf;
    }

    public void setWarKaf(double warKaf) {
        this.warKaf = warKaf;
    }

    public double individualCalculation(double x){
        return (x * getKaf() + getStag() * getKaf() * 100) * warKaf;
    }

}
