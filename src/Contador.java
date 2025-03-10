import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class Contador {
    public static void main(String[] args) {
        // Criação do objeto Scanner para leitura de entrada do usuário
        Scanner terminal = new Scanner(System.in);

        // Solicita ao usuário o primeiro número
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();

        // Solicita ao usuário o segundo número
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        try {
            // Chama o método contar passando os parâmetros informados
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Captura e trata a exceção se os parâmetros forem inválidos
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Fecha o Scanner para evitar vazamento de recursos
        terminal.close();
    }

    /**
     * Método responsável por realizar a contagem e imprimir os números na tela.
     * 
     * @param parametroUm   Primeiro número (deve ser menor que o segundo)
     * @param parametroDois Segundo número (deve ser maior que o primeiro)
     * @throws ParametrosInvalidosException Caso parametroUm seja maior que parametroDois
     */
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verifica se o primeiro parâmetro é maior que o segundo
        if (parametroUm > parametroDois) {
            // Lança a exceção personalizada caso os parâmetros sejam inválidos
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Calcula a quantidade de iterações com base na diferença dos números
        int contagem = parametroDois - parametroUm;

        // Loop for para imprimir a contagem na tela
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
