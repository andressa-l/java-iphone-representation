public class Main {
    public static void main(String[] args) {
        iPhoneReal iPhone = new iPhoneReal();

        // Demonstrar as funcionalidades
        iPhone.tocar();
        iPhone.selecionarMusica("Canção X");
        iPhone.pausar();

        iPhone.ligar("123-456-7890");
        iPhone.atender();

        iPhone.exibirPagina("www.example.com");
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
    }
}