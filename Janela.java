import jdk.swing.interop.SwingInterOpUtils;

public class Janela {

    private String cor;
    private Double altura;
    private Double largura;
    private Boolean estaAberta;

    public Janela(){
        this.altura = 0.0;
        this.largura = 0.0;
        this.cor = null;
        this.estaAberta = false;
    }
    public Janela(Double altura, Double largura, String cor){
        this.altura = altura;
        this.largura = largura;
        this.cor = cor;
        this.estaAberta = false;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Boolean getEstaAberta() {
        return estaAberta;
    }

    public void setEstaAberta(Boolean estaAberta) {
        this.estaAberta = estaAberta;
    }

    public void abrirJanela(){
        if(this.estaAberta) {
            System.out.println("A janela " + this.cor + " já está aberta");
        }else{
            this.estaAberta=true;
            System.out.println("A janela " + this.cor + " foi aberta");
        }
    }

    public void fecharJanela(){
        if(!this.estaAberta) {
            System.out.println("A janela " + this.cor + " já está fechada");
        }else {
            this.estaAberta = false;
            System.out.println("A janela " + this.cor + " foi fechada");
        }
    }

}
