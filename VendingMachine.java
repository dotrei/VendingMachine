import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
public class VendingMachine {
    public static void main(String[] args) throws Exception {

        try {

        int i = 0;
        int j = 0;
        int k = 0;

        double vendingLength = 0;
        boolean done = false;

        Scanner input = new Scanner(System.in);

        double[] orderArray = new double[99];
        int h = 0;
        double finalAnswer = 0;

        double change = 0;

        String[] letterArray = {"A", "B", "C", "D", "E"};

        String[][] vendingLayout = {
            {"Fritos", "Onion Rings", "UTZ Original", "Ruffles", "Mini Pretzels"},
            {"Lays Original", "Lays BBQ", "Lays SC&O", "Lays Lightly Salted", "Lays Wavy"},
            {"Nacho Doritos", "Ranch Doritos", "Chili Doritos", "Cheetos", "Spicy Cheetos"},
            {"Pop-Tart", "Cheez-its", "Granola Bar", "M&Ms", "Skittles"},
            {"Oreo Pack", "Hershey Bar", "Sour Patch Kids", "Snickers Bar", "Twix Bar"},
        };
        
        double[][] priceLayout = {
            {1.50, 1.25, 1.50, 1.25, 1.25},
            {1.50, 1.50, 1.50, 1.50, 1.50},
            {1.25, 1.25, 1.25, 1.25, 1.25},
            {1.25, 1.00, 1.00, 1.00, 1.00},
            {1.50, 1.25, 1.75, 1.25, 1.25}
        };

        NumberFormat formatter = new DecimalFormat("#0.00");

        /*Part 1: Arrays and try/catch to set up the base of the program, by Henry*/

        

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("java.lang.StringIndexOutOfBoundsException");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException f) {
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
            f.printStackTrace();
        } catch (IndexOutOfBoundsException g) {
            System.out.println("java.lang.IndexOutOfBoundsException");
            g.printStackTrace();
        } catch (NumberFormatException h) {
            h.printStackTrace();
        }
    }
}