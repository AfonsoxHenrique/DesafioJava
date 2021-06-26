/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Class.ClientePJ;
import java.util.ArrayList;

/**
 *
 * @author Pichau
 */
public interface InterfaceClientePJ {
    void cadastrarClientePJ  (ClientePJ clientepj) throws Exception;
    void editarClientePJ (ClientePJ clientepj) throws Exception;
    void excluirClientePJ (ClientePJ clientepj) throws Exception;
    ArrayList<ClientePJ> listarClientePJ (ClientePJ clientePj) throws Exception;
}
