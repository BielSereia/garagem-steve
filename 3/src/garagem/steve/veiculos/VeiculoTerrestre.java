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
public class VeiculoTerrestre {
    protected String modelo;
    protected String placa;
    protected String motorista;

    public VeiculoTerrestre(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }
    
    public void setMotorista(String nome) {
        this.motorista = nome;
    } 
    
    public String getPlaca() {
        return this.placa;
    }  
}
