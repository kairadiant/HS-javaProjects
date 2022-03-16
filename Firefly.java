//Kayla Washington
public class Firefly {
    public double x;
    public double y;
    public double z;
    public boolean alive=true;

    Firefly(){
        x=(Math.random()*10.0)-10.0;
        y=(Math.random()*10.0)-10.0;
        z=(Math.random()*10.0)-10.0;
    }
    public void move(){
        x+=(Math.random()*1.0)-1.0;
        y+=(Math.random()*1.0)-1.0;
        z+=(Math.random()*1.0)-1.0;
    }
    public void display(){
        System.out.println("x: "+x+", y: "+y+", z: "+z);
    }
}
