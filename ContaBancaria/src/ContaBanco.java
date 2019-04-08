public class ContaBanco {
    public static class Conta{

        public int numConta;
        protected String tipo;
        private String dono;
        private float saldo;
        private boolean status;

        public void estadoAtual(){
            System.out.println("----------------------------------");
            System.out.println("Conta: "+this.getNumConta());
            System.out.println("Conta: "+this.getTipo());
            System.out.println("Conta: "+this.getDono());
            System.out.println("Conta: "+this.getSaldo());
            System.out.println("Conta: "+this.getStatus());
        }

        public void abrirConta(String t){
            this.setTipo(t);
            this.setStatus(true);
            if (t == "CC"){
                this.setSaldo(50);
            } else if (t == "CP") {
                this.setSaldo(150);
            }
            System.out.println("Conta aberta com sucesso!");
        }

        public void fecharConta(){
            if (this.getSaldo() > 0){
                System.out.println("A conta não pode ser fechada pq ainda tem dinheiro!");
            } else if (this.getSaldo() < 0){
                System.out.println("A conta não pode ser fechada pq tem um débito...");
            } else {
                setStatus(false);
                System.out.println("A conta foi fechada com sucesso!");
            }
        }

        public void depositar(float v){
            if (this.getStatus()){
                this.setSaldo(this.getSaldo() + v);
                System.out.println("Deposito realizado na conta de "+this.getDono());
            } else {
                System.out.println("Impossível depositar em uma conta fechada!");
            }
        }

        public void sacar(float v){
            if (this.getStatus()) {
                if (this.getSaldo() >= v) {
                    this.setSaldo(this.getSaldo() - v);
                    System.out.println("Saque realizado na conta de " + this.getDono());
                } else {
                    System.out.println("Saldo insuficiente para saque...");
                }
            }else {
                System.out.println("Impossível sacar de uma conta fechada!");
            }
        }

        public void pagarMensal(){
            int v = 0;
            if (this.getTipo() == "CC"){
                v = 12;
            }else if (this.getTipo() == "CP"){
                v = 20;
            }
            if (this.getStatus()){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidae paga com sucesso por "+this.getDono());
            } else{
                System.out.println("Impossível pagar uma conta fechada!");
            }
        }

        //Método construtor
//        public Conta(int numConta, String tipo, String dono, float saldo, boolean status) {
//            this.numConta = numConta;
//            this.tipo = tipo;
//            this.dono = dono;
//            this.saldo = saldo;
//            this.status = status;
//        }

        //Métodos especiais (Getters e Setters)
        public int getNumConta() {
            return numConta;
        }

        public void setNumConta(int numConta) {
            this.numConta = numConta;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getDono() {
            return dono;
        }

        public void setDono(String dono) {
            this.dono = dono;
        }

        public float getSaldo() {
            return saldo;
        }

        public void setSaldo(float saldo) {
            this.saldo = saldo;
        }

        public boolean getStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }
    }

    public static void main(String[] args){
        Conta p1 = new Conta();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.estadoAtual();

        Conta p2 = new Conta();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        //p2.abrirConta("CP");
        p2.estadoAtual();

    }
}
