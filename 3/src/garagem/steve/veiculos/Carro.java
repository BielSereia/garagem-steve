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
public class Carro extends VeiculoTerrestre implements Veiculo {
    private double potencia;
    
    public Carro(double potencia, String modelo, String placa) {
        super(modelo, placa);
        this.potencia = potencia;
        this.setMotorista("Sr. Steve Harris");
    }
    
    public double getPotencia() {
        return this.potencia;
    }

    @Override
    public String obterDescricaoVeiculo() {
        return "Modelo do carro: " + this.modelo + ". Placa do carro: " + this.placa + ". Motorsta do carro: " + this.motorista + ". Potencia do carro: " + this.potencia;
    }
    
}
