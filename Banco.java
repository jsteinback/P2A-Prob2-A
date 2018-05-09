
package problema2;

import java.util.ArrayList;


public class Banco {
    ArrayList<Cliente> clientes = new ArrayList<>();
    
    public void adicionarCliente(Cliente c){
        clientes.add(c);
    }
    public void removerCliente(Cliente c){
        clientes.remove(c);
    }
    
}
