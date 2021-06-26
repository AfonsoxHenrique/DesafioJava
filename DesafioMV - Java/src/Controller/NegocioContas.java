/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Class.Contas;

import Data.DadosContas;
import Interfaces.InterfaceContas;
import java.util.ArrayList;

/**
 *
 * @author Pichau
 */
public class NegocioContas implements InterfaceContas{

    @Override
    public void cadastrarConta(Contas contas) throws Exception {
        if (contas.getNumeroConta() <= 0) {
            throw new Exception("Digite o número da conta");
        }
        if (contas.getCpfDonoConta().length() < 11 || contas.getCpfDonoConta().length() > 11) {
            throw new Exception("O CPF deve conter 11 digitos!");
        }
        if (contas.getNomeDonoConta().length() > 100) {
            throw new Exception("O nome pode conter somente até 100 caracteres!");
        }
        if (contas.getNomeDonoConta().trim().equals("")) {
            throw new Exception("Digite o nome do cliente!");
        }
        if (contas.getMovimentacao() <=0) {
            throw new Exception("Digite o valor da movimentação");
        }
        if (contas.getCnpjDonoConta().equals("")) {
            throw new Exception("Digite o CNPJ do cliente");
        }
        if (contas.getRazaoSocialDonoConta().equals("")) {
            throw new Exception("Digite a razão social do cliente");
        }

        DadosContas dadosContas = new DadosContas();
        dadosContas.cadastrarConta(contas);
    }

    @Override
    public void editarConta(Contas contas) throws Exception {
        if (contas.getNumeroConta() <= 0) {
            throw new Exception("Digite o número da conta");
        }
        if (contas.getCpfDonoConta().length() < 11 || contas.getCpfDonoConta().length() > 11) {
            throw new Exception("O CPF deve conter 11 digitos!");
        }
        if (contas.getNomeDonoConta().length() > 100) {
            throw new Exception("O nome pode conter somente até 100 caracteres!");
        }
        if (contas.getNomeDonoConta().trim().equals("")) {
            throw new Exception("Digite o nome do cliente!");
        }
        if (contas.getMovimentacao() <=0) {
            throw new Exception("Digite o valor da movimentação");
        }
        if (contas.getCnpjDonoConta().equals("")) {
            throw new Exception("Digite o CNPJ do cliente");
        }
        if (contas.getRazaoSocialDonoConta().equals("")) {
            throw new Exception("Digite a razão social do cliente");
        }
        DadosContas dadosContas = new DadosContas();
        dadosContas.editarConta(contas);
    }
    

    @Override
    public void excluirConta(Contas contas) throws Exception {
        if (contas.getNumeroConta() <= 0) {
            throw new Exception("Digite o número da conta");
        }
        if (contas.getCpfDonoConta().length() < 11 || contas.getCpfDonoConta().length() > 11) {
            throw new Exception("O CPF deve conter 11 digitos!");
        }
        if (contas.getNomeDonoConta().length() > 100) {
            throw new Exception("O nome pode conter somente até 100 caracteres!");
        }
        if (contas.getNomeDonoConta().trim().equals("")) {
            throw new Exception("Digite o nome do cliente!");
        }
        if (contas.getMovimentacao() <=0) {
            throw new Exception("Digite o valor da movimentação");
        }
        if (contas.getCnpjDonoConta().equals("")) {
            throw new Exception("Digite o CNPJ do cliente");
        }
        if (contas.getRazaoSocialDonoConta().equals("")) {
            throw new Exception("Digite a razão social do cliente");
        }
        DadosContas dadosContas = new DadosContas();
        dadosContas.excluirConta(contas);
    }

    @Override
    public ArrayList<Contas> listarConta(Contas contas) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Contas> listarContasPF(Contas contas) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cadastrarContaPJ(Contas contas) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editarContaPJ(Contas contas) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
