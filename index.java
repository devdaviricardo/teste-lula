import java.util.Scanner;

public class index {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);

    System.out.println("digite seu nome: ");
    String nome = sc.nextLine();

    System.out.println("digite sua idade: ");
    int idade = sc.nextInt();

    System.out.println("digite o numero do seu candidato a presidente");
    System.out.println("lula = 13 ou bolsonaro = 22: ");
    int candidato = sc.nextInt();

    sc.nextLine(); // Limpar o buffer do scanner

if (idade >=16) {
    if (candidato == 22) {    System.out.println("VOCÊ É MUITO INTELIGENTE!");
        System.out.println("parabens "+ nome +" você tem "+ idade +" anos e votou no candidato de numero 22");
    }
    else {
        System.out.println("VOCÊ É MUITO INTELIGENTE!");
        System.out.println("parabens "+ nome +" você tem "+ idade +" anos e votou no candidato de numero 22 ");
    
        System.out.println("algo deu errado? SIM/NÃO?");
        String resposta = sc.nextLine();
        System.out.println();
    
        if (resposta.equalsIgnoreCase("sim")) {
               System.out.println("então você votou no candidato errado, você deveria ter votado no candidato de numero 22, " +
                            "mas se insiste em comer picanha... digite 'eu quero picanha' e você vai ver o que acontece: ");
                String resposta2 = sc.nextLine();
    System.out.println();
                if (resposta2.equalsIgnoreCase("eu quero picanha")) {
                    System.out.println("caraca, tu chegou ate aqui mesmo? é muita vontade de comer picanha mesmo, " +
                  " mas tudo bem, seja feliz la na urna vota 13 bem lentinho. FAZ O L! #PAPAILULE #VAMOSCOMERPICANHA #RECUAFACISTA");
                }
    
            }
            else if (resposta.equalsIgnoreCase("não")) {
                System.out.println("então você votou no candidato certo");
    }
    else {
        System.out.println("você digitou uma resposta inválida"
        );
    }
            }
}
else {
    System.out.println("você não tem idade suficiente para votar");
}
    }
}