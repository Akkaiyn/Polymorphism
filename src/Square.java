public class Square extends  Shapes {
    private int a;

    public Square(){

    }

    public Square(int a) {
        this.a = a;
    }
    void findArea(){
        System.out.println(a*a);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
