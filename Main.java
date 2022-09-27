public class Main {
    public static void main(String[] args) {
        Janela janelaAzul = new Janela(100.0, 200.5, "Azul");
        Janela janelaVerde = new Janela();
        janelaVerde.setAltura(90.8);
        janelaVerde.setLargura(50.0);
        janelaVerde.setCor("Verde");
        janelaVerde.setEstaAberta(true);

        janelaAzul.fecharJanela();
        janelaAzul.abrirJanela();

        janelaVerde.abrirJanela();
        janelaVerde.fecharJanela();

        janelaAzul.setCor("Amarelo");
        System.out.println("A nova cor é: " + janelaAzul.getCor());

    }
}
