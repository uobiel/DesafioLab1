public class Principal {
    public static void main(String[] args){

        while(true){

            int quest = Teclado.leInt("\n[1] Criar uma loja\n[2] Criar um produto\n[3] Sair\n");

            if(quest == 1){

                Endereco endereco = new Endereco(Teclado.leString("\nNome da rua: \n"), Teclado.leString("\nNome da cidade: \n"), Teclado.leString("\nNome do estado: \n"), Teclado.leString("\nNome do país: \n"), Teclado.leString("\nCEP do estabelecimento: \n"), Teclado.leString("\nNúmero do estabelecimento: \n"), Teclado.leString("\nComplemento: \n"));

                Data data = new Data(Teclado.leInt("Dia da fundação da loja: "), Teclado.leInt("Mês da fundação da loja: "), Teclado.leInt("Ano da funcação da loja"));

                Loja loja = new Loja(Teclado.leString("\nDigite o nome da loja: "), Teclado.leInt("Digite a quantidade de funcionário da loja: "), Teclado.leDouble("Digite o salário base dos funcionários: "), endereco, data );

            }

            else if(quest == 2){
                Data data = new Data(Teclado.leInt("\nData de validade do produto: \n"), Teclado.leInt("\nMês de validade do produto: \n"), Teclado.leInt("\nAno de validade do produto: \n"));

                Produto produto = new Produto(Teclado.leString("\nNome do produto: \n"), Teclado.leDouble("\nPreço do produto: \n"), data);

                 if(produto.estaVencido(new Data(20, 10, 2023)) == true){
                    System.out.println("\nPRODUTO VENCIDO");
                }

                else{
                    System.out.println("\nPRODUTO NÃO VENCIDO");
                }
            }

            else if(quest == 3){
                break;
            }

            else{
                System.out.println("\nOpção inválida\n");
            }


        }
        


    }
}
