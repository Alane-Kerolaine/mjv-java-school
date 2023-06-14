public class ContaCorrente {
    private Double saldo;
    private Integer numero;
    private Integer agencia;
    private boolean ativa;

    void sacar(Double valor){
        if(saldo > valor){
         saldo -= valor;
        }
    }
    
    void transferir(ContaCorrente contaDestino, Double valor){
        if(saldo > valor){
            saldo -= valor;
            contaDestino.saldo += valor;
        }
    }

    boolean cancelar(){
        return ativa = false;
    }

//    <List> Objeto consultarExtrato(){
//        return null;
//    }

    public Double consultarSaldoAtual(){
        return saldo;
    }



}
