/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Class.ClientePJ;
import Data.DadosClientePJ;
import Interfaces.InterfaceClientePJ;
import java.util.ArrayList;

/**
 *
 * @author Pichau
 */
public class NegocioClientePJ implements InterfaceClientePJ{

    @Override
    public void cadastrarClientePJ(ClientePJ clientepj) throws Exception {
        if (clientepj.getCnpj().equals("")) {
            throw new Exception("Digite o CNPJ do cliente!");
        }
        if (clientepj.getCnpj().length() < 14 || clientepj.getCnpj().length() > 14) {
            throw new Exception("O CNPJ deve conter 14 digitos!");
        }
        if (clientepj.getRazaoSocial().length() > 100) {
            throw new Exception("A razão soical pode conter somente até 100 caracteres!");
        }
        if (clientepj.getRazaoSocial().trim().equals("")) {
            throw new Exception("Digite a Razão Social do cliente");
        }
        if (clientepj.getEndereco_PJ().equals("")) {
            throw new Exception("Digite o endereço");
        }
        if (clientepj.getBairro_PJ().equals("")) {
            throw new Exception("Digite o bairro");
        }
        if (clientepj.getTelefone_PJ().equals("(  )     -    ")) {
            throw new Exception("Digite o telefone completo");
        }
        if (clientepj.getEstado_PJ().equals(""))
        {
            throw new Exception("Digite o estado");
        }
        if(clientepj.getNomeEmpresa().equals(""))
        {
            throw new Exception("Digite o nome da empresa");
        }
        if(clientepj.getCidade_PJ().equals(""))
        {
            throw new Exception("Digite a cidade");
        }
        DadosClientePJ dadosClientepj = new DadosClientePJ();
        dadosClientepj.cadastrarClientePJ(clientepj);
    }

    @Override
    public void editarClientePJ(ClientePJ clientepj) throws Exception {
        if (clientepj.getCnpj().equals("")) {
            throw new Exception("Digite o CNPJ do cliente!");
        }
        if (clientepj.getCnpj().length() < 14) {
            throw new Exception("O CNPJ deve conter 14 digitos!");
        }
        if (clientepj.getRazaoSocial().length() > 100) {
            throw new Exception("A razão soical pode conter somente até 100 caracteres!");
        }
        if (clientepj.getRazaoSocial().trim().equals("")) {
            throw new Exception("Digite a Razão Social do cliente");
        }
        if (clientepj.getEndereco_PJ().equals("")) {
            throw new Exception("Digite o endereço");
        }
        if (clientepj.getBairro_PJ().equals("")) {
            throw new Exception("Digite o bairro");
        }
        if (clientepj.getTelefone_PJ().equals("(  )     -    ")) {
            throw new Exception("Digite o telefone completo");
        }
        if (clientepj.getEstado_PJ().equals(""))
        {
            throw new Exception("Digite o estado");
        }
        if(clientepj.getNomeEmpresa().equals(""))
        {
            throw new Exception("Digite o nome da empresa");
        }
        if(clientepj.getCidade_PJ().equals(""))
        {
            throw new Exception("Digite a cidade");
        }
        DadosClientePJ dadosClientepj = new DadosClientePJ();
        dadosClientepj.editarClientePJ(clientepj);
    }

    @Override
    public void excluirClientePJ(ClientePJ clientepj) throws Exception {
        if (clientepj.getCnpj().equals("")) {
            throw new Exception("Digite o CNPJ do cliente!");
        }
        if (clientepj.getCnpj().length() < 14 || clientepj.getCnpj().length() > 14) {
            throw new Exception("O CNPJ deve conter 11 digitos!");
        }
        if (clientepj.getRazaoSocial().length() > 100) {
            throw new Exception("A razão soical pode conter somente até 100 caracteres!");
        }
        if (clientepj.getRazaoSocial().trim().equals("")) {
            throw new Exception("Digite a Razão Social do cliente");
        }
        if (clientepj.getEndereco_PJ().equals("")) {
            throw new Exception("Digite o endereço");
        }
        if (clientepj.getBairro_PJ().equals("")) {
            throw new Exception("Digite o bairro");
        }
        if (clientepj.getTelefone_PJ().equals("(  )     -    ")) {
            throw new Exception("Digite o telefone completo");
        }
        if (clientepj.getEstado_PJ().equals(""))
        {
            throw new Exception("Digite o estado");
        }
        if(clientepj.getNomeEmpresa().equals(""))
        {
            throw new Exception("Digite o nome da empresa");
        }
        if(clientepj.getCidade_PJ().equals(""))
        {
            throw new Exception("Digite a cidade");
        }
        DadosClientePJ dadosClientepj = new DadosClientePJ();
        dadosClientepj.excluirClientePJ(clientepj);
    }

    @Override
    public ArrayList<ClientePJ> listarClientePJ(ClientePJ clientePj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
