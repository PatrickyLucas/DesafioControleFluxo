// Classe de exceção personalizada para tratar erros de parâmetros inválidos
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem); // Passa a mensagem para a superclasse Exception
    }
}