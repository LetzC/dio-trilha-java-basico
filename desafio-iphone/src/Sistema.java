public class Sistema {
  public static void main(String[] args) {
    Iphone iphone = new Iphone();

    iphone.ligar();
    iphone.atender();
    iphone.iniciarCorreioVoz();

    iphone.exibirPagina();
    iphone.adicionarNovaAba();
    iphone.atualizarPagina();

    iphone.tocar();
    iphone.pausar();
    iphone.selecionarMusica();
  }
}
