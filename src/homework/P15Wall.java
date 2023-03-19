package homework;

public class P15Wall {
    double width;
    double height;
    public P15Wall(){
       // constructor
    }
    public P15Wall(double width, double height){
        if (width<0){
            width=0;
        }else if (height<0){
            height=0;
        }else{
            this.width=width;
            this.height=height;
        }
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double width){
        if (width<0){
           this.width=0;}
    }
    public void setHeight(double height){
        if (height<0){
            this.height=0;}
    }
    public double getArea(){
        double area = width*height;
        return area;
    }
    public static void main(String[] args) {
        P15Wall wall = new P15Wall (5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
