/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author Pichau
 */
public class Contas {
    private String nomeDonoConta;
    private int numeroConta;
    private String cpfDonoConta;
    private String cnpjDonoConta;
    private String razaoSocialDonoConta;
    private ClientePJ clientepj;
    private ClientePF clientepf;

    public String getCnpjDonoConta() {
        return cnpjDonoConta;
    }

    public void setCnpjDonoConta(String cnpjDonoConta) {
        this.cnpjDonoConta = cnpjDonoConta;
    }

    public String getRazaoSocialDonoConta() {
        return razaoSocialDonoConta;
    }

    public void setRazaoSocialDonoConta(String razaoSocialDonoConta) {
        this.razaoSocialDonoConta = razaoSocialDonoConta;
    }
    private double movimentacao;
    
    public ClientePJ getClientepj() {
        return clientepj;
    }

    public void setClientepj(ClientePJ clientepj) {
        this.clientepj = clientepj;
    }

    public ClientePF getClientepf() {
        return clientepf;
    }

    public void setClientepf(ClientePF clientepf) {
        this.clientepf = clientepf;
    }

    public double getMovimentacao() {
        return movimentacao;
    }

    public void setMovimentacao(double movimentacao) {
        this.movimentacao = movimentacao;
    }

    public String getNomeDonoConta() {
        return nomeDonoConta;
    }

    public void setNomeDonoConta(String nomeDonoConta) {
        this.nomeDonoConta = nomeDonoConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getCpfDonoConta() {
        return cpfDonoConta;
    }

    public void setCpfDonoConta(String cpfDonoConta) {
        this.cpfDonoConta = cpfDonoConta;
    }
    
    
}
