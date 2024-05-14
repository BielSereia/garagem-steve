/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garagem.steve.veiculos;

/**
 *
 * @author 8065632
 */
public class Iate implements Veiculo {
    private String nome;
    private String capitao;

    public Iate(String nome) {
        this.nome = nome;
        this.setCapitao("Sr. Steve Harris");
    }

    public void setCapitao(String capitao) {
        this.capitao = capitao;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String obterDescricaoVeiculo() {
        return "Nome do iate: " + this.nome + ". Capitao do Iate: " + this.capitao;
    }
    
    
}
