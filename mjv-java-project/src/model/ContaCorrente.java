package model;

public class ContaCorrente {
    private Double saldo = 1000.99;
    private Integer numero;
    private Integer agencia;
    private boolean ativa;

    void depositar(Double valor){
        saldo += valor;
    }

    public void sacar(Double valor){
        if(saldo > valor){
         saldo -= valor;
        }
    }
    
    public void transferir(ContaCorrente contaDestino, Double valor){
        if(saldo > valor){
            saldo -= valor;
            contaDestino.saldo += valor;
        }
    }

    public boolean cancelar(){
        return ativa = false;
    }

//    <List> Objeto consultarExtrato(){
//        return null;
//    }

    public Double consultarSaldoAtual(){
        return saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
}
