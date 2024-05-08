import java.util.Scanner;

public class snu {
    public static int converthtom(int hour){
        if(hour < 24){
            return hour*60;
        };
        return hour;
    }
    public static void main(String[] args) {
        snu sc = new snu();
        int minutes = sc.converthtom(2);
        System.out.println("2 hours in minutes: " + minutes);
    }

}
