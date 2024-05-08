package khushveer;

public class Bike {

    public static void main(String[] args){
        Brand honda = new Brand();
//        honda.some();   // This will print the initial value of speed, which is 0.
//        honda.speed = 450;  // Here,     you assign 450 to the speed variable.
        honda.setSpeed(450);   // Now print the updated value of speed.
    }

}
