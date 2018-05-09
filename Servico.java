/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2.servicos;

import problema2.Operacao;
import problema2.UiMain;

/**
 *
 * @author giuliog
 */
public abstract class Servico {

    public void update(Operacao operacao) {
        if (operacao.getConta().getCliente().isNoificaWhatsApp()) {
            problema2.Problema2.tela.atualizaNotificacao("WhatsApp:" + getMensagem(operacao) + "\n");
        }
        if (operacao.getConta().getCliente().isNoificaSMS()) {
            problema2.Problema2.tela.atualizaNotificacao("SMS:" + getMensagem(operacao) + "\n");
        }
        if (operacao.getConta().getCliente().isNoificaJMS()) {
            problema2.Problema2.tela.atualizaNotificacao("JMS:" + getMensagem(operacao) + "\n");
        }
    }

    protected abstract String getMensagem(Operacao operacao);

}
