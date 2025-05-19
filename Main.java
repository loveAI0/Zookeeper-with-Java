import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Printer.textPrinter();
        System.out.println();

        System.out.println("Please enter the number of the habitat you would like to view:");

        Scanner input = new Scanner(System.in);
        int cameraNumber = input.nextInt();

        Printer.animalPrinter(cameraNumber);
    }
}