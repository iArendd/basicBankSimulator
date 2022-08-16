public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){

        System.out.println("-----------------------------");

        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo()); 
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());

    }


    
    //---METODOS PERSONALIZADOS------

    public void abrirConta(String t){

        this.setTipo(t);
        this.setStatus(true);

        if(t == "CC"){

            this.setSaldo(50);

        }else{

            if(t == "CP"){

                this.setSaldo(150);

            }

        }

        System.out.println("A conta foi criada com sucesso.");

    }

    public void fecharConta(){

        if(this.getSaldo() > 0){

            System.out.println("A sua conta possuí saldo positivo, retire tudo para autorizar o encerramento da conta.");
        
        }else{

            if(this.getSaldo() < 0){

                System.out.println("A sua conta está em cheque especial, pague o valor devido para autorizar o encerramento da conta.");
            
            }else{

                this.setStatus(false);

                System.out.println("A conta foi encerrada com sucesso.");

            }

        }


    }

    public void depositar(float v){

        if(this.getStatus()){

            this.setSaldo(this.getSaldo() + v);

            System.out.println("Deposito na conta " + this.getNumConta() + " no valor de R$" + v + " realizado com sucesso.");
             
        }else{

            System.out.println("Não foi possível depositar, conta inexistente");
        
        }


    }

    public void sacar(float v){

        if(this.getStatus()){

            if(this.getSaldo() >= v){

                this.setSaldo(this.getSaldo() - v);

                System.out.println("Saque no valor de R$" + v + " na conta " + this.getNumConta() + " do dono(a) "+ this.getDono() + " foi relizado com sucesso.");

            }else{

                System.out.println("Não foi possível realizar o saque, saldo insuficiente.");

            }

        }else{

            System.out.println("Não foi possível realizar o saque, conta inexistente.");

        }


    }

    public void pagarMensal(){

        float v = 0;

        if(this.getTipo() == "CC"){

            v = 12;
             
        }else{

            if(this.getTipo() == "CP"){

                v = 20;

            }else{

                System.out.println("O tipo de conta mencionado não foi identificado.");
            }
        
        }

        if(this.getStatus()){

            if(this.getSaldo() > v){

                this.setSaldo(this.getSaldo() - v);

            }else{

                System.out.println("Não foi possível realizar a cobrança, saldo insuficiente");

            }

        }else{

            System.out.println("Não foi possível realizar a cobrança, conta inexistente");

        }


    }


    //---METODOS ESPECIAIS----------



    public ContaBanco(){

        this.setSaldo(0);
        this.setStatus(false);

    }



    //---GETTER N SETTERS------------

    public int getNumConta() {

        return numConta;

    }


    public void setNumConta(int n) {

        this.numConta = n;

    }


    public String getTipo() {

        return tipo;

    }


    public void setTipo(String t) {

        this.tipo = t;

    }


    public String getDono() {

        return dono;

    }


    public void setDono(String d) {

        this.dono = d;

    }


    public float getSaldo() {

        return saldo;

    }


    public void setSaldo(float sl) {

        this.saldo = sl;

    }


    public boolean getStatus() {

        return status;

    }


    public void setStatus(boolean st) {

        this.status = st;

    }

     



    
}
