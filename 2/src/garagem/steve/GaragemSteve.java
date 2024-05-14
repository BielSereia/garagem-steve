/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garagem.steve;

import garagem.steve.galpao.Galpao;
import garagem.steve.veiculos.Caminhao;
import garagem.steve.veiculos.Carro;
import garagem.steve.veiculos.Helicoptero;
import garagem.steve.veiculos.Iate;

/**
 *
 * @author 8065632
 */
public class GaragemSteve {
    public static void main(String[] args) {
        Iate iate1 = new Iate("Iate bom");
        Iate iate2 = new Iate("Iate mais ou menos");
        
        iate1.setCapitao("Sr. Steve Harris");
        iate2.setCapitao("Sr. Steve Harris");
        
        Helicoptero helicoptero = new Helicoptero("Helicoptero de Passeio", "HP");
        
        helicoptero.setPiloto(("Sr. Steve Harris"));
        
        Carro carro1 = new Carro(500, "McLaren P1", "BRA2E19");
        Carro carro2 = new Carro(100, "FUSCA", "BRA2E55");
        
        carro1.setMotorista("Sr. Steve Harris");
        carro2.setMotorista("Sr. Steve Harris");

        
        Caminhao caminhao = new Caminhao(1000, "Scania R500", "PRO1G0R");
        caminhao.setMotorista("Sr. Steve Harris");

        Galpao galpao = new Galpao();
        
        galpao.adicionarVeiculo(iate1);
        galpao.adicionarVeiculo(iate2);
        galpao.adicionarVeiculo(helicoptero);
        galpao.adicionarVeiculo(carro1);
        galpao.adicionarVeiculo(carro2);
        galpao.adicionarVeiculo(caminhao);
        
        System.out.println(galpao.imprimirRelacaoVeiculos());
    }
}
