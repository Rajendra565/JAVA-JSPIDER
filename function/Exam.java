// defind a function to find gst amount of price 1500.00
// Gst is 18% formula (18/100)*price


public class Exam {
    public static void main(String[] args) {
        FindGst();

    }
    public static void FindGst(){
        int price=15000;
        int gst=18;
        float amount=(gst/100.0f)*price;
        System.out.println("Amount "+amount);
    }
}
