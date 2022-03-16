//Kayla Washington
public class FireflyGame {
    public static void main(String []args){
        Firefly[] fireflyarray = new Firefly[10];
        int flies=10;
        double hold;
        for(int i=0;i<10;i++){
            fireflyarray[i]=new Firefly();
            fireflyarray[i].display();
        }
        while(flies>1){
            for (int i = 0; i < 10; i++) {
                if(fireflyarray[i]!=null) {
                    System.out.println("Firefly " + (i + 1) + " is moving.");
                    fireflyarray[i].move();
                    for (int j = 0; j < 10; j++) {
                        if (i != j && fireflyarray[i] != null && fireflyarray[j] != null) {
                            hold = distance(fireflyarray[i].x, fireflyarray[j].x, fireflyarray[i].y, fireflyarray[j].y, fireflyarray[i].z, fireflyarray[j].z);
                            System.out.println("Firefly "+(i+1)+" and Firefly "+(j+1)+" have a distance of "+hold);
                            if (hold <= 1) {
                                System.out.println("Firefly " + (i + 1) + " has been eliminated.");
                                fireflyarray[j] = null;
                                flies -= 1;
                            }
                        }
                    }
                }
            }
        }
        for(int i=0;i<10;i++){
            if(fireflyarray[i]!=null){
                System.out.println("Firefly "+(i+1)+" is the winner.");
            }
        }
    }


    public static double distance(double x1,double x2,double y1,double y2,double z1,double z2){
        return Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2)+Math.pow(z1-z2,2));
    }
}
