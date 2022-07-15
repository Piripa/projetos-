//Biblioteca Importada
import java.util.Scanner;
//Classe Main
public class PrimeiroProjeto {
    public static void main(String[] args) {
        //Comando para ser possível a interação com o usuário, permitido por causa do importa da biblioteca
        Scanner input = new Scanner(System.in);
        System.out.println("Olá, pode me chamar de Piripa, sou o chatbot que irá lhe ajudar na inscrição do nosso site de apostas , a melhor banca de apostas que você encontra é aqui!");
        System.out.println("Para começarmos, você poderia me dizer como gostaria de ser chamado?");
        String name = input.nextLine();
        System.out.println("Olá "+name+" , é um prazer. Você pode me informa sua idade, por favor?");
        int idade = input.nextInt();
        //String e int são variáveis primitivas 
        //Condincional 
        if(idade>=18){
            System.out.println("Vejo que você é maior de idade, então você pode continuar na nossa inscrição.");
            System.out.println(name+" , Você poderia me informar seu CPF?");
            String cpf = input.next();
            System.out.println(name+" , agora você poderia me informar seu email?");
            String email = input.next();
            System.out.println(name+" , e agora ,por último, você poderia me informar sua senha ?");
            String senha = input.next();
            System.out.println(name+", de CPF:"+cpf+" seu email é "+email+" e, por último, sua senha para acesso é: "+senha);
            System.out.println("Inscrição Realizada com Sucesso!");
        }
        else{
            System.out.println("Vejo que você é menor de idade, então você não pode continuar sua inscrição.Obrigado!");
            input.close();
        }
    }
}
