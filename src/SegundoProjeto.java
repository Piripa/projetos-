
import java.util.Scanner;

public class SegundoProjeto {
    public static int potencia( int base, int expoente){
        if(expoente==1){
            return base;
        }
        else if(expoente == 0 ){
            return 1;
        }
        else{
           int a = base;
            while(expoente>1){ 
                int b = base;
                int c = a;
                while(c>1){
                    base+=b;
                    c-=1;
                }
            expoente=expoente-1;
            }
            return base;
        } 
     }
                  
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número da base: ");
        int numberBase= input.nextInt();
        System.out.println("Digite o número do expoente: ");
        int numberExp=input.nextInt();
        System.out.println(potencia(numberBase, numberExp));
        input.close();
    } 
 }
  
     