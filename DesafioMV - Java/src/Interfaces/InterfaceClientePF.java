/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Class.ClientePF;
import java.util.ArrayList;

/**
 *
 * @author Pichau
 */
public interface InterfaceClientePF {
    void cadastrarClientePF  (ClientePF clientepf) throws Exception;
    void editarClientePF (ClientePF clientepf) throws Exception;
    void excluirClientePF (ClientePF clientepf) throws Exception;
    ArrayList<ClientePF> listarClientePF (ClientePF clientePF) throws Exception;
}
