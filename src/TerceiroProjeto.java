import java.util.Scanner;

public class TerceiroProjeto {
    public static void main(String[] args) {
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("...");
            System.out.println("Você aceita....?");
            String first = input.nextLine();
            if(first=="sim"){
                System.out.println("Continua história");
            }
            else{
                System.out.println("sim ou não?");
                String second = input.nextLine();
                if(second =="não"){
                    System.out.println("então...");
                }
                else{
                    System.out.println("oãtne... ");
                }
            }

        
            input.close();
        
        } while (false);

    }
}
