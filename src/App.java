public class App {


    public static void main(String[] args){

        ContaBanco p1 = new ContaBanco();

        p1.setNumConta(1111);
        p1.setDono("Matheus");
        p1.abrirConta("CC");

        p1.depositar(300);
        
        p1.estadoAtual();

        //--------------------------------

        ContaBanco p2 = new ContaBanco();

        p2.setNumConta(1112);
        p2.setDono("Creusa");
        p2.abrirConta("CP");

        p2.depositar(500);
        p2.sacar(250);

        p2.estadoAtual();
        

        
    }


}
