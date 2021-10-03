package GuiXe;

import java.util.Scanner;

public class Vehicles {
    private static double price;
    private int type;
    public static double price(int setType){
        if (setType == 1){
            price = 2000;
        }
        else if (setType == 2){
            price = 5000;
        }
        else{
            price=50000;
        }
        return price;
    }
    public static double nightPrice(double price){
        return price *2;
    }
    public static boolean IsNight(float time){
        if ( time > 24){
            return true;
        }
        return false;
    }
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("Nhap loai xe: [1] Xe dap, [2]xe may , [3]Xe hoi");
        int type =in.nextInt();
        System.out.println("Nhap thoi gian gui: ");
        float time =in.nextFloat();
        boolean b = IsNight(time);
        if ( b == true)
        {
            System.out.println("Xe qua dem: " + nightPrice(price(type)));
        }
        else
        {
        System.out.println("Xe k co qua dem: " + price(type));
        }
    }
}
