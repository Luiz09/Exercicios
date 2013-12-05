/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy.padroes.ifpb;

/**
 *
 * @author luiz
 */
public class AppTest {

    public static void main(String[] args) {
        RealInternetAcess proxy = new RealInternetAcess();

        Funcionario funcionario1 = new Funcionario("Rodrigo", TipoFuncionario.GERENTE);
        Funcionario funcionario2 = new Funcionario("Luiz", TipoFuncionario.COMUM);
        
        proxy.getConexao(funcionario1);
        proxy.getConexao(funcionario2);

    }
}
