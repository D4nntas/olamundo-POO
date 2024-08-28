public class veiculo {
    public String cor;
    public String modelo;
    public String marca;
    float capacidadeTanque;
    int qtdPorta;
    int velocidade;
    
    public void acelerar(){
        velocidade = velocidade +1; 
    }
    public void freiar(){ 
        velocidade = velocidade +1;    
    }

    public String buzina(){
        return "bibi";
    }
}
