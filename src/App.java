public class App {
    public static void main(String[] args) throws Exception {
    veiculo v_gol = new veiculo();
    v_gol.capacidadeTanque=40;
    System.out.println(v_gol.capacidadeTanque);    
    v_gol.velocidade=20;
    v_gol.acelerar();
    v_gol.acelerar();
    v_gol.acelerar();
    v_gol.acelerar();
    System.out.println(v_gol.velocidade);
    System.out.println(v_gol.buzina());    
    }

    

}
