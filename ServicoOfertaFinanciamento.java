/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2.servicos;

import problema2.Operacao;

/**
 *
 * @author giuliog
 */
public class ServicoOfertaFinanciamento extends Servico{

    @Override
    protected String getMensagem(Operacao operacao) {
        return "Oferta financiamento:" + operacao.toString();
    }
    
}
