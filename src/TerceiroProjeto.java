import java.util.Scanner;

public class TerceiroProjeto {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("... Olá, meu nome é Piripa, sou o gênio da lâmpada que você esfregou."+
                               "Você tem direito um pedido para ser realizado, você pode pedir o que quiser," +
                               "porém fique atento as consequências que podem acarretar no futuro pelas suas decisões então fique bem atento no que irá pedir viu.");
            System.out.println("Enfim, vamos deixar de enrolagem e me diga, você vai realizar algum pedido?");
            String first = input.nextLine();
            if(first.equalsIgnoreCase("Sim")){
                System.out.println("Bom...então se você vai realizar um pedido eu preciso que me informe antes o tipo de seu pedido, se ele vai ser pedido de poder ou  de tempo."+
                                   "O Pedido do tipo PODER, lhe proproe opções como habilidades especiais ou algo que você queira obter muito, por exemplo, dinheiro."+
                                   "Já o pedido do tempo, permite você viajar 10 anos para seu futurou ou 10 anos para o seu passsado.");
                System.out.println("E então, qual vai ser o tipo do seu pedido?");
                String firstTwo = input.nextLine();
                if(firstTwo.equalsIgnoreCase("Poder")){
                    System.out.println("Parabéns! Você escolheu o tipo poder e agora você pode escolher qual habilidade ou algo que queira muito ter. Eai, qual?");
                    String poder = input.nextLine();
                    System.out.println("Seu desejo de obter "+poder+" será realizado o mais rápido possível! Aproveite o maximo, até a próxima.");
                    System.out.println("Mas lembre-se,'Com grandes poderes vêm grandes responsabilidades' - Stan Lee(Tio Ben)");
                }
                else if(firstTwo.equalsIgnoreCase("Tempo")){
                    System.out.println("Parabéns! Você escolheu o tipo tempo e agora você pode escolher ir para o futuro ou para o passado. Me diga, para onde você quer ir? ");
                    String tempo = input.nextLine();
                    System.out.println("Em breve você será levado para o "+tempo+". Agora irei voltar para tempo. Até a próxima.");
                    System.out.println("Mas saiba, 'Não é só o passado que influencia o futuro. O futuro também influencia o passado.' - Dark");
                }

            }
            else{
                System.out.println("Parabéns pela escolha, infelizmente como não desejas realizar nenhum pedido,o terei que entrar na minha lâmpada novamente. Até a próxima!");
                System.out.println("'Tente a sua sorte! A vida é feita de oportunidades. O homem que vai mais longe é quase sempre aquele que tem coragem de arriscar.' - Dale Carnegie");
            }
             input.close();       
      }
}
