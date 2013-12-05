/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy.padroes.ifpb;

/**
 *
 * @author luiz
 */
public class RealInternetAcess implements IInternetAcess {

    private IInternetAcess conexao;
    private Funcionario funcionario;

    public RealInternetAcess() {
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }
    
     public void getConexao(Funcionario funcionario){
		this.conexao = new ProxyInternetAccess(funcionario);
		this.conexao.liberarAcesso();
     }

    @Override
    public void liberarAcesso() {
        System.out.println("Acesso Liberado");
    }
     
 
}
