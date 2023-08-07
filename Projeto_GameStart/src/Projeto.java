import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Projeto {
    public static void main(String[] args) throws FileNotFoundException {

        // Leitura do ficheiro
        File file = new File("File/GameStart.csv");
        List<List<String>> vendas = readCSV(file);

        // Instanciar o Scanner
        Scanner scanner = new Scanner(System.in);

        // Pergunta ao utilizador o tipo de login (ADMIN ou CLIENTE)
        System.out.println("Bem-vindo à GameStart!");
        System.out.print("Digite o tipo de utilizador (ADMIN ou CLIENTE): ");
        String userType = scanner.nextLine().toUpperCase();

        // Se o login for ADMIN, solicita a password
        if (userType.equals("ADMIN")) {
            System.out.print("Digite a password: ");
            String password = scanner.nextLine();

            // Verificação da password (NERDS4EVER)
            if (password.equals("NERDS4EVER")) {
                adminMenu(vendas, scanner);
            } else {
                System.out.println("Password incorreta. Acesso negado.");
            }
        } else if (userType.equals("CLIENTE")) {
            clienteMenu(vendas, scanner);
        } else {
            System.out.println("Tipo de utilizador inválido. Saindo do programa.");
        }
    }

    // Função para ler o CSV e retornar uma matriz bidimensional com os dados (ajuda bibliográfica do Programiz)
    public static List<List<String>> readCSV(File file) {
        List<List<String>> vendas = new ArrayList<>();

        try {
            Scanner scannerFile = new Scanner(file);

            // Condição para ignorar a primeira linha (cabeçalho do CSV)
            if (scannerFile.hasNextLine()) {
                scannerFile.nextLine();
            }

            // Ciclo para ler cada linha do CSV e dividir os campos usando ";"
            while (scannerFile.hasNextLine()) {
                String linha = scannerFile.nextLine();
                String[] campos = linha.split(";");

                // Condição para verificar o tamanho do index
                if (campos.length == 9) {
                    List<String> venda = new ArrayList<>();

                    // Ciclo para adicionar cada campo da linha à lista de vendas
                    for (String campo : campos) {
                        venda.add(campo);
                    }

                    vendas.add(venda);
                }
            }

            scannerFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return vendas;
    }

    // Função para imprimir o conteúdo
    private static void printConteudo(List<List<String>> vendas) {
        System.out.println("\n------- Conteúdo do ficheiro CSV -------");
        for (List<String> venda : vendas) {
            System.out.println(venda);
        }
    }

    // Função para imprimir a quantidade de vendas e o valor total
    private static void printTotalVendasValor(List<List<String>> vendas) {
        int totalVendas = vendas.size();
        double valorTotal = 0;
        for (List<String> venda : vendas) {
            double valor = Double.parseDouble(venda.get(8));
            valorTotal += valor;
        }
        System.out.println("\nTotal de vendas: " + totalVendas);
        System.out.println("Valor total: " + valorTotal);
    }

    // Função para calcular o total de lucro
    private static void printTotalLucro(List<List<String>> vendas) {
        double totalLucro = 0;
        for (List<String> venda : vendas) {
            double valor = Double.parseDouble(venda.get(8));
            double lucro = valor * 0.1; // 10% de lucro
            totalLucro += lucro;
        }
        System.out.println("\nTotal de lucro: " + totalLucro);
    }

    // Função para retirar informações de um cliente pelo idCliente
    private static void printInfoCliente(List<List<String>> vendas, Scanner scanner) {
        System.out.print("\nDigite o idCliente: ");
        String idCliente = scanner.next();

        boolean clienteEncontrado = false;
        for (List<String> venda : vendas) {
            if (venda.get(1).equals(idCliente)) {
                clienteEncontrado = true;
                String nomeCliente = venda.get(2);
                String contacto = venda.get(3);
                String email = venda.get(4);

                System.out.println("\nInformações do cliente:");
                System.out.println("Nome: " + nomeCliente);
                System.out.println("Contacto: " + contacto);
                System.out.println("Email: " + email);
            }
        }

        if (!clienteEncontrado) {
            System.out.println("Cliente com id " + idCliente + " não encontrado.");
        }
    }

    // Função para definir o jogo mais caro e listar os clientes que o compraram
    private static void printJogoMaisCaro(List<List<String>> vendas) {
        String jogoMaisCaro = "";
        double precoMaisCaro = 0;
        List<String> clientesQueCompraram = new ArrayList<>();

        for (List<String> venda : vendas) {
            double valor = Double.parseDouble(venda.get(8));
            if (valor > precoMaisCaro) {
                precoMaisCaro = valor;
                jogoMaisCaro = venda.get(7);
                clientesQueCompraram.clear();
                clientesQueCompraram.add(venda.get(2));
            } else if (valor == precoMaisCaro) {
                clientesQueCompraram.add(venda.get(2));
            }
        }

        System.out.println("\nJogo mais caro: " + jogoMaisCaro);
        System.out.println("Preço: " + precoMaisCaro);
        System.out.println("Clientes que compraram: " + clientesQueCompraram);
    }

    // Função para exibir o menu do ADMIN
    private static void adminMenu(List<List<String>> vendas, Scanner scanner) {

        while (true) {
            // Exibir as opções do menu
            System.out.println("\n----- MENU ADMIN -----");
            System.out.println("1. Imprimir conteúdo do ficheiro");
            System.out.println("2. Imprimir número de vendas e valor total");
            System.out.println("3. Calcular o total de lucro");
            System.out.println("4. Consultar informações de um cliente pelo id");
            System.out.println("5. Imprimir o jogo mais caro e os clientes que o compraram");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            // Estrutura de Seleção para executar a opção escolhida
            switch (option) {
                case 1:
                    printConteudo(vendas);
                    break;
                case 2:
                    printTotalVendasValor(vendas);
                    break;
                case 3:
                    printTotalLucro(vendas);
                    break;
                case 4:
                    printInfoCliente(vendas, scanner);
                    break;
                case 5:
                    printJogoMaisCaro(vendas);
                    break;
                case 0:
                    System.out.println("Saindo do menu ADMIN. Obrigado e boas ferias Formador Vitor!");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    // Função para imprimir todos os títulos de jogos (sem duplicados)
    private static void printTitulosJogos(List<List<String>> vendas) {
        Set<String> titulosJogos = new HashSet<>();
        for (List<String> venda : vendas) {
            titulosJogos.add(venda.get(7));
        }
        System.out.println("\n------- Títulos de jogos (sem duplicados) -------");
        for (String titulo : titulosJogos) {
            System.out.println(titulo);
        }
    }

    // Função para imprimir categorias e jogos por editora
    private static void consultarCategoriasPorEditora(List<List<String>> vendas, Scanner scanner) {
        System.out.print("\nDigite o nome da editora: ");
        String editora = scanner.next();

        Map<String, List<String>> categoriasJogosPorEditora = new HashMap<>();
        for (List<String> venda : vendas) {
            if (venda.get(5).equalsIgnoreCase(editora)) {
                String categoria = venda.get(6);
                String jogo = venda.get(7);
                List<String> jogos = categoriasJogosPorEditora.getOrDefault(categoria, new ArrayList<>());
                jogos.add(jogo);
                categoriasJogosPorEditora.put(categoria, jogos);
            }
        }

        System.out.println("\n------- Categorias e Jogos da Editora " + editora + " -------");
        for (Map.Entry<String, List<String>> entry : categoriasJogosPorEditora.entrySet()) {
            String categoria = entry.getKey();
            List<String> jogos = entry.getValue();
            System.out.println("Categoria: " + categoria);
            System.out.println("Jogos: " + jogos);
        }
    }

    // Função para exibir o menu do CLIENTE
    private static void clienteMenu(List<List<String>> vendas, Scanner scanner) {

        while (true) {
            // Exibir as opções do menu
            System.out.println("\n----- MENU CLIENTE -----");
            System.out.println("1. Imprimir todos os títulos de jogos (sem duplicados)");
            System.out.println("2. Consultar categorias e jogos por editora");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            // Estrutura de Seleção para executar a opção escolhida
            switch (option) {
                case 1:
                    printTitulosJogos(vendas);
                    break;
                case 2:
                    consultarCategoriasPorEditora(vendas, scanner);
                    break;
                case 0:
                    System.out.println("Saindo do menu CLIENTE. Obrigado e boas ferias Formador Vitor!");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}