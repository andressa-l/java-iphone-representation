public class iPhoneReal implements iPhone.MusicPlayerService, iPhone.PhoneService, iPhone.BrowserService {
    // Implementação dos métodos das interfaces
    public void tocar() {
        System.out.println("Tocando música");
        // Implementação para tocar música
    }

    public void pausar() {
        System.out.println("Pausando música");
        // Implementação para pausar música
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
        // Implementação para selecionar música
    }

    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
        // Implementação para fazer uma ligação
    }

    public void atender() {
        System.out.println("Atendendo chamada");
        // Implementação para atender uma chamada
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
        // Implementação para iniciar o correio de voz
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
        // Implementação para exibir uma página na Internet
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
        // Implementação para adicionar uma nova aba
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
        // Implementação para atualizar a página
    }
}