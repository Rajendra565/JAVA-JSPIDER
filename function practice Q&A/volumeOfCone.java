// pi(r*r)h/3
public class volumeOfCone {
    public static void Cone(double r,double h){
        double total=3.14*(r*r)*(h/3);
        System.out.println(total);
    }
    public static void main(String[] args) {
        Cone(4, 4);
    }
}
