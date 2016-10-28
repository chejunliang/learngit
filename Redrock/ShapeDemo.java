

/**
 * Created by Darktosee on 2016/10/24.
 */
/*
抽象父类
 */
abstract class Shape {

    public abstract float getArea() ;


}
class Circle extends Shape {
    private float r;


    public Circle(float r){
        this.setR(r);
    }

    public float getR() {
        return r;
    }


    public void setR(float r) {
        this.r = r;
    }


    public float getArea() {
        return (float) (3.14*this.getR()*this.getR());
    }
}



class Square extends Shape {
    private float a;

    public  Square(float a) {
        this.setA(a);

    }


    public void setA(float a) {
        this.a = a;
    }

    public float getA() {
        return a;
    }


    public float getArea() {
        return this.getA()*this.getA();
    }
}

class Triangle extends Shape {
    private float b;
    private float h;
    public Triangle(int b,int h){
        this.setB(b);
        this.setH(h);
    }
    public void setB(int b) {
        this.b = b;
    }

    public void setH(int h) {
        this.h = h;
    }

    public float getB() {
        return b;
    }

    public float getH() {
        return h;
    }

    public float getArea() {

        return this.getB()*this.getH()/2;
    }
}




public class ShapeDemo {

    public static void main(String[] args) {
        Shape  s=new Square(9);
        Shape  t= new Triangle(8,10);
        Triangle t1=(Triangle)t;
        Shape c=new Circle(6);


        System.out.println("SquareArea:"+s.getArea());
        System.out.println("TriangleArea:"+t1.getArea());
        System.out.println("CircleArea:"+c.getArea());


    }
}
