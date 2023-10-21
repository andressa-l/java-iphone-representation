public class iPhone {
    public interface MusicPlayerService {
        void tocar();
        void pausar();
        void selecionarMusica(String musica);
    }

    public interface PhoneService {
        void ligar(String numero);
        void atender();
        void iniciarCorreioVoz();
    }

    public interface BrowserService {
        void exibirPagina(String url);
        void adicionarNovaAba();
        void atualizarPagina();
    }
}
