/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Class.ClientePF;
import Data.DadosClientePF;
import Interfaces.InterfaceClientePF;
import java.util.ArrayList;

/**
 *
 * @author Pichau
 */
public class NegocioClientePF implements InterfaceClientePF {

    @Override
    public void cadastrarClientePF(ClientePF clientepf) throws Exception {
        if (clientepf.getCpf().equals("")) {
            throw new Exception("Digite o CPF do cliente!");
        }
        if (clientepf.getCpf().length() < 11 || clientepf.getCpf().length() > 11) {
            throw new Exception("O CPF deve conter 11 digitos!");
        }
        if (clientepf.getNome().length() > 100) {
            throw new Exception("O nome pode conter somente até 100 caracteres!");
        }
        if (clientepf.getNome().trim().equals("")) {
            throw new Exception("Digite o nome do cliente!");
        }
        if (clientepf.getEndereco_PF().equals("")) {
            throw new Exception("Digite o endereço");
        }
        if (clientepf.getBairro_PF().equals("")) {
            throw new Exception("Digite o bairro");
        }
        if (clientepf.getTelefone_PF().equals("(  )     -    ")) {
            throw new Exception("Digite o telefone completo");
        }
        if(clientepf.getEstado_PF().equals(""))
        {
            throw new Exception ("Digite o estado");
        }
        if(clientepf.getCidade_PF().equals(""))
        {
            throw new Exception("Digite a cidade");
        }

        DadosClientePF dadosClientePF = new DadosClientePF();
        dadosClientePF.cadastrarClientePF(clientepf);
    }

    @Override
    public void editarClientePF(ClientePF clientepf) throws Exception {
        if (clientepf.getCpf().length() < 11) {
            throw new Exception("O CPF deve conter 11 digitos!");
        }
        if (clientepf.getNome().length() > 100) {
            throw new Exception("O nome pode conter até 100 caracteres");
        }
        if (clientepf.getNome().trim().equals("")) {
            throw new Exception("Digite o nome do cliente!");
        }
        if (clientepf.getEndereco_PF().equals("")) {
            throw new Exception("Digite o endereço");
        }
        if (clientepf.getBairro_PF().equals("")) {
            throw new Exception("Digite o bairro");
        }
        if (clientepf.getTelefone_PF().equals("(  )     -    ")) {
            throw new Exception("Digite o telefone completo");
        }
        if(clientepf.getEstado_PF().equals(""))
        {
            throw new Exception ("Digite o estado");
        }
        if(clientepf.getCidade_PF().equals(""))
        {
            throw new Exception("Digite a cidade");
        }
        DadosClientePF dadosClientePF = new DadosClientePF();
        dadosClientePF.editarClientePF(clientepf);
    }

    @Override
    public void excluirClientePF(ClientePF clientepf) throws Exception {
        if (clientepf.getCpf().length() < 11) {
            throw new Exception("O CPF deve conter 14 digitos!");
        }
        DadosClientePF dadosClientePF = new DadosClientePF();
        dadosClientePF.excluirClientePF(clientepf);
    }

    @Override
    public ArrayList<ClientePF> listarClientePF(ClientePF clientePF) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
