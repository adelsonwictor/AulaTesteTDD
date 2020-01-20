package br.edu.ifal.modelo;

import java.util.ArrayList;
import java.util.List;

public class Leilao {
    private Produto produto;
    private List<Cliente> clientes;
    private List<Lance> lances;
    private double lanceMinimo;

    public Leilao(Produto produto, double lanceMinimo){
        this.produto = produto;
        this.clientes = new ArrayList<>();
        this.lances = new ArrayList<>();
        this.lanceMinimo = lanceMinimo;
    }

    
    public void addLance(Lance lance){
        this.lances.add(lance);
    }

    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public Produto getProduto() {
        return produto;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Lance> getLances() {
        return lances;
    }

    public double getLanceMinimo() {
        return lanceMinimo;
    }

    
}