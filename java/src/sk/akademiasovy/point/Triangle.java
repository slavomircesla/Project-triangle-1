package sk.akademiasovy.point;

public class Triangle implements InterfaceTriangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle (Point a,Point  b,Point  c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getSideA(){
        return b.getDistanceFromOtherPoint(c);
    }

    public double getSideB() {
        return a.getDistanceFromOtherPoint(c);
    }

    public double getSideC() {
        return a.getDistanceFromOtherPoint(b);
    }

    public double getPerimeter(){
        return getSideA()+getSideB()+getSideC();
    }

    public double getHalfArea(){
        return (getSideA()+getSideB()+getSideC())/2;
    }

    public double getArea(){
        return (Math.sqrt(getHalfArea()*(getHalfArea()-getSideA())*(getHalfArea()-getSideB())*(getHalfArea()-getSideC())));
    }

    public  boolean isRectangular()
    {
        if(getSideA()*getSideA()==(getSideC()*getSideC())*(getSideB()*getSideB()))
            return true;
        else if (getSideB()*getSideB()==(getSideC()*getSideC())*(getSideA()*getSideA()))
        return true;
        else  if(getSideC()*getSideC()==(getSideA()*getSideA())*(getSideB()*getSideB()))
            return true;
        else return false;
    }

    @Override
    public boolean isEquilateral() {

        if(getSideA()==getSideB() && getSideB()==getSideC())
            return true;
        else

            return false;
    }

    @Override
    public boolean isIsosceles() {
        if(getSideA()==getSideC() || getSideA()==getSideB() || getSideB()==getSideC())
            return true;
        else
        return false;
    }
}
