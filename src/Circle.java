public class Circle extends Shapes {
    private final double PI;
    private  int r;



    public Circle(double PI, int r) {
        this.PI = PI;
        this.r = r;
    }
    @Override
    void findArea(){
        System.out.println(PI*r*r);
    }

    public double getPI() {
        return PI;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
