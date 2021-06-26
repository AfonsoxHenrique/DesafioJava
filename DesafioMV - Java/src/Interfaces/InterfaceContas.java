/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Class.Contas;
import java.util.ArrayList;

/**
 *
 * @author Pichau
 */
public interface InterfaceContas {
    void cadastrarConta  (Contas contas) throws Exception;
    void cadastrarContaPJ (Contas contas) throws Exception;
    void editarConta (Contas contas) throws Exception;
    void editarContaPJ (Contas contas) throws Exception;
    void excluirConta (Contas contas) throws Exception;
    ArrayList<Contas> listarConta (Contas contas) throws Exception;
    ArrayList<Contas> listarContasPF (Contas contas) throws Exception;
}
