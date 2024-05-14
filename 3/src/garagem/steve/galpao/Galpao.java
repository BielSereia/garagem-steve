/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garagem.steve.galpao;

import garagem.steve.veiculos.Veiculo;

/**
 *
 * @author 8065632
 */
public class Galpao {
    private final int tamanhoGalpao = 10;
    private int quantidadeVeiculos = 0;
    private Veiculo[] veiculos = new Veiculo[tamanhoGalpao];
    
    public Galpao() {
    }
    
    public void adicionarVeiculo(Veiculo veiculo) {
        if (quantidadeVeiculos < tamanhoGalpao) {
            this.veiculos[quantidadeVeiculos++] = veiculo;
        } else {
            System.out.println("Nao e possivel adicionar mais veiculos no galpao pois o mesmo ja esta cheio.");
        }
    }
    
    public String imprimirRelacaoVeiculos() {
        String relacao = "";
        
        for (Veiculo veiculo : veiculos) {
            if (veiculo != null) {
                relacao += veiculo.obterDescricaoVeiculo() + "\n";
            }
        }
        
        return relacao;
    }
    
}
