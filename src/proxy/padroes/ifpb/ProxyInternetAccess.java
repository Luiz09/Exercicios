/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy.padroes.ifpb;

/**
 *
 * @author luiz
 */
class ProxyInternetAccess implements IInternetAcess {

    private RealInternetAcess conexao;
    private Funcionario funcionario;

    public ProxyInternetAccess(Funcionario funcionario) {
        this.funcionario = funcionario;
        this.conexao = new RealInternetAcess();
    }

    public RealInternetAcess getConexao() {
        return conexao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    @Override
    public void liberarAcesso() {
        if (this.getFuncionario().getTipo() == TipoFuncionario.GERENTE) {
            getConexao().liberarAcesso();
        } else {
            System.out.println("Acesso Restrito");
        }
    }
}
