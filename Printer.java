import java.util.ArrayList;


class Printer{
    
    static void textPrinter(){
        String printerText = """ 
            I love animals!
            Let's check on the animals...
            The deer looks fine.
            The bat looks happy.
            The lion looks healthy."""; 
        System.out.println(printerText);
    }

    static void animalPrinter(ArrayList<String> listOfHabitat, int habitat){
        if(habitat > listOfHabitat.size()){
                System.out.println("Enter Valid Habitat Number.");
            }
            else{
                System.out.println(listOfHabitat.get(habitat));
                String endMsg = """
                        ---
                        You've reached the end of the program. To check another habitat, please restart the watcher.""";
                System.out.println(endMsg);
            } 

    }
    
    
}