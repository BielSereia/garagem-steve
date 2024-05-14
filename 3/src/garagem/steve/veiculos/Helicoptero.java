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
public class Helicoptero implements Veiculo {
    private String modelo;
    private String sigla;
    private String piloto;

    public Helicoptero(String modelo, String sigla) {
        this.modelo = modelo;
        this.sigla = sigla;
        this.setPiloto("Sr. Steve Harris");
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }
    
    public String detalhar() {
        return "Modelo do helicoptero: " + this.modelo + ". Sigla do helicoptero: " + this.sigla + ". Piloto do helicoptero: " + this.piloto;
    }

    @Override
    public String obterDescricaoVeiculo() {
        return "Modelo do helicoptero: " + this.modelo + ". Sigla do helicoptero: " + this.sigla + ". Piloto do helicoptero: " + this.piloto;
    }
}
