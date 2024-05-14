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
public class Caminhao extends VeiculoTerrestre implements Veiculo {
    private double capacidadeCarga;
    
    
    public Caminhao(double capacidadeCarga, String modelo, String placa) {
        super(modelo, placa);
        this.capacidadeCarga = capacidadeCarga;
    }
    
    public double getCapacidadeCarga() {
        return this.capacidadeCarga;
    }
    
    @Override
    public String obterDescricaoVeiculo() {
        return "Modelo do caminhao: " + this.modelo + ". Placa do caminhao: " + this.placa + ". Motorista do caminhao: " + this.motorista + ". Capacidade do caminhao: " + this.capacidadeCarga;
    }
}
