import java.util.ArrayList;
import java.util.Scanner;

public class ZooManager {

    static void statusUpdate(ArrayList<String> list){
        boolean flag = true;
        while(flag){
            System.out.println("Please enter the number of the habitat you would like to view:");

            Scanner input = new Scanner(System.in);
            String habitatIndex = input.nextLine();

        
            switch (habitatIndex) {
                case "0":
                    System.out.println(list.get(Integer.parseInt(habitatIndex)));
                    break;
                case "1":
                    System.out.println(list.get(Integer.parseInt(habitatIndex)));
                    break;
                case "2":
                    System.out.println(list.get(Integer.parseInt(habitatIndex)));
                    break;
                case "3":
                    System.out.println(list.get(Integer.parseInt(habitatIndex)));
                    break;
                case "4":
                    System.out.println(list.get(Integer.parseInt(habitatIndex)));
                    break;
                case "5":
                    System.out.println(list.get(Integer.parseInt(habitatIndex)));
                    break;
            
                case "exit":
                    System.out.println("See you later!");
                    flag = false;
                    break;
            }
        }
    }
}
