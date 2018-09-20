public class Women extends Rachet {
     private int child;

    public Women(String name, int old, int stag, int child) {
        super(name, old,stag);
        this.child = child;
    }

    public Women(){}


    public int getChild() {
        return child;
    }

    public void setChild(int child) {
        this.child = child;
    }

    public double individualCalculation(double x){
        return (x  + getStag()  * 100)*child;
    }

}
