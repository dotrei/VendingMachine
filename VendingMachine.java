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

        while (!done) {
            while (i < 5) {
                while (j < 5) {

                    System.out.print(vendingLayout[i][j]);

                    while (j < 4) {

                        System.out.print(" | ");
                        break;
                    }
                    j++;
                }
                j = 0;
                //prints product name row

                
                System.out.println("");
                while (j < 5) {
                    vendingLength = vendingLayout[i][j].length();


                    System.out.print("$" + formatter.format(priceLayout[i][j]));
                    while (j < 4) {
                        k = 3;
                        while ((vendingLength) > k) {
                            System.out.print(" ");
                            k++;
                        }
                        k = 0;
                        System.out.print("| ");
                        break;
                    }
                    j++;
                }
                j = 0;
                //prints price row


                System.out.println("");
                while (j < 5) {

                    System.out.print(letterArray[i] + (j+1));
                    k = 1;
                    while (j < 4) {
                        while ((vendingLength) > k) {
                            System.out.print(" ");
                            k++;
                        }
                        k = 0;
                        System.out.print(" | ");
                        break;
                    }
                    j++;
                }
                j = 0;
                //prints label row

                System.out.println("");
                System.out.println("");
                i++;
            }

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