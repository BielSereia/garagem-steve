/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garagem.steve.usuario;

import garagem.steve.galpao.Galpao;
import garagem.steve.veiculos.Caminhao;
import garagem.steve.veiculos.Carro;
import garagem.steve.veiculos.Helicoptero;
import garagem.steve.veiculos.Iate;
import java.util.Scanner;

/**
 *
 * @author 8065632
 */
public class Aplicacao {
    private Galpao galpao = new Galpao();
    
    public void menu() {
        char opcao;
        
        do {
            System.out.println("Sistema da Garagem de Steve");
            System.out.println("0. Sair");
            System.out.println("1. Imprimir relacao de veiculos");
            System.out.println("2. Adicionar caminhao");
            System.out.println("3. Adicionar carro");
            System.out.println("4. Adicionar Helicoptero");
            System.out.println("5. Adicionar Iate");
            
            opcao = this.lerValor("Digite uma opcao do menu").charAt(0);
            
            switch (opcao) {
                case '1':
                    System.out.println(this.galpao.imprimirRelacaoVeiculos());;
                    break;
                case '2':
                    double capacidadeCaminhao = Double.parseDouble(this.lerValor("Qual a capacidade de carga do caminhao?"));
                    String modeloCaminhao = this.lerValor("Qual o modelo do caminhao?");
                    String placaCaminhao = this.lerValor("Qual a placa do caminhao?");
                    this.cadastrarCaminhao(capacidadeCaminhao, modeloCaminhao, placaCaminhao);
                    break;
                case '3':
                    double potenciaCarro = Double.parseDouble(this.lerValor("Qual a potencia do carro?"));
                    String modeloCarro = this.lerValor("Qual o modelo do carro?");
                    String placaCarro = this.lerValor("Qual a placa do carro?");
                    this.cadastrarCarro(potenciaCarro, modeloCarro, placaCarro);
                    break;
                case '4':
                    String modeloHelicoptero = this.lerValor("Qual o modelo do helicoptero?");
                    String siglaHelicoptero = this.lerValor("Qual a sigla do helicoptero?");
                    this.cadastrarHelicoptero(modeloHelicoptero, siglaHelicoptero);
                    break;
                case '5':
                    String nomeIate = this.lerValor("Qual o nome do iate?");
                    this.cadastrarIate(nomeIate);
                    break;
            }
        } while (opcao != '0');
    }
    
    private String lerValor(String rotulo) {
        System.out.println(rotulo + ": ");
        
        Scanner scanner = new Scanner(System.in);
        
        return scanner.nextLine();
    }
    
    private void cadastrarCaminhao(double capacidade, String modelo, String placa) {
        Caminhao caminhao = new Caminhao(0, modelo, placa);
        
        this.galpao.adicionarVeiculo(caminhao);
    }
    
    private void cadastrarCarro(double potencia, String modelo, String placa) {
        Carro carro = new Carro(0, modelo, placa);
        
        this.galpao.adicionarVeiculo(carro);
    }
    
    private void cadastrarHelicoptero(String modelo, String sigla) {
        Helicoptero helicoptero = new Helicoptero(modelo, sigla);
        
        this.galpao.adicionarVeiculo(helicoptero);
    }
    
    private void cadastrarIate(String nome) {
        Iate iate = new Iate(nome);
        
        this.galpao.adicionarVeiculo(iate);
    }
}
