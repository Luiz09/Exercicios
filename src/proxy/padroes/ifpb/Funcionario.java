/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy.padroes.ifpb;

/**
 *
 * @author luiz
 */
public class Funcionario {

    private String nome;
    private TipoFuncionario tipo;

    public Funcionario(String nome, TipoFuncionario tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public TipoFuncionario getTipo() {
        return tipo;
    }

    public void setTipo(TipoFuncionario tipo) {
        this.tipo = tipo;
    }
}
