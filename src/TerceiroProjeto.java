import java.util.Scanner;
//Import do scanner para interagir com o usuário
public class TerceiroProjeto {
    public static void main(String[] args) {
        //Atribuindo nome para meu scanner
            Scanner input = new Scanner(System.in);
            System.out.println("... Olá, meu nome é Piripa, sou o gênio da lâmpada que você esfregou."+
                               "Você tem direito um pedido para ser realizado, você pode pedir o que quiser," +
                               "porém fique atento as consequências que podem acarretar no futuro pelas suas decisões então fique bem atento no que irá pedir viu.");
            System.out.println("Enfim, vamos deixar de enrolagem e me diga, você vai realizar algum pedido?");
            String first = input.nextLine();
            //equalIgnoreCase para comparar o nome, caso é verdadeiro ou não, e para ignorar letras maiusculas e minusculas
            if(first.equalsIgnoreCase("Sim")){
                System.out.println("Bom...então se você vai realizar um pedido eu preciso que me informe antes o tipo de seu pedido, se ele vai ser pedido de poder ou  de tempo."+
                                   "\nO Pedido do tipo PODER, lhe proproe opções como habilidades especiais ou algo que você queira obter muito, por exemplo, dinheiro."+
                                   "\nJá o tipo TEMPO, permite você viajar 10 anos para seu futurou ou 10 anos para o seu passsado.");
                System.out.println("\nE então, qual vai ser o tipo do seu pedido?");
                // \n para pular ficar a baixo da linha.
                String firstTwo = input.nextLine();
                if(firstTwo.equalsIgnoreCase("Poder")){
                    System.out.println("Ahh você quer ter poderes né? espero que faça o bem com o que você está prestes a pedir, não se pode desperdiçar uma sortes de me encontrar ein! Agora me diga qual poder você vai querer?");
                    String poder = input.nextLine();
                    System.out.println("Seu desejo de obter "+poder+" será realizado o mais rápido possível! Aproveite o maximo, agora terei que me retirar pois só posso realizar um pedido! Tchauu.");
                    System.out.println("Mas lembre-se,'Com grandes poderes vêm grandes responsabilidades' - Stan Lee(Tio Ben)");
                }
                else if(firstTwo.equalsIgnoreCase("Tempo")){
                    System.out.println("Então você quer viajar? o futuro as vezes pode ser perturbador e o passado triste, mas você pode tirar proveito disso, eai pra onde você quer ir? ");
                    String tempo = input.nextLine();
                    System.out.println("Em breve você será levado para o "+tempo+". Agora terei que voltar para o meu tempo, não posso ficar vagando por ai, enfim boa sorte!");
                    System.out.println("Mas saiba, 'Não é só o passado que influencia o futuro. O futuro também influencia o passado.' - Dark");
                }

            }
            else{
                System.out.println(" infelizmente como não desejas realizar nenhum pedido,o terei que entrar na minha lâmpada novamente, fico triste porque você poderia adquirir algo novo para você mas é isso. Tchau!");
                System.out.println("'Tente a sua sorte! A vida é feita de oportunidades. O homem que vai mais longe é quase sempre aquele que tem coragem de arriscar.' - Dale Carnegie");
            }
            //Fechamento do input
             input.close();       
      }
}
