/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EncapsulamentoQ2;

/**
 *
 * @author iurimega13
 */
public class Elevador {
    private int andarAtual; 
    private int totalDeAndares;
    private int Capacidade;
    private int quantPessoas;

    public Elevador(int andarAtual, int totalDeAndares, int Capacidade, int quantPessoas) {
        this.andarAtual = andarAtual;
        this.totalDeAndares = totalDeAndares;
        this.Capacidade = Capacidade;
        this.quantPessoas = quantPessoas;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public void setTotalDeAndares(int totalDeAndares) {
        this.totalDeAndares = totalDeAndares;
    }

    public void setCapacidade(int Capacidade) {
        this.Capacidade = Capacidade;
    }

    public void setQuantPessoas(int quantPessoas) {
        this.quantPessoas = quantPessoas;
    }
    
    public int getAndarAtual() {
        return andarAtual;
    }

    public int getTotalDeAndares() {
        return totalDeAndares;
    }

    public int getCapacidade() {
        return Capacidade;
    }

    public int getQuantPessoas() {
        return quantPessoas;
    }

    @Override
    public String toString() {
        return "Elevador{" + "andarAtual=" + andarAtual + ", totalDeAndares=" + totalDeAndares + ", Capacidade=" + Capacidade + ", quantPessoas=" + quantPessoas + '}';
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + this.andarAtual;
        hash = 61 * hash + this.totalDeAndares;
        hash = 61 * hash + this.Capacidade;
        hash = 61 * hash + this.quantPessoas;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Elevador other = (Elevador) obj;
        if (this.andarAtual != other.andarAtual) {
            return false;
        }
        if (this.totalDeAndares != other.totalDeAndares) {
            return false;
        }
        if (this.Capacidade != other.Capacidade) {
            return false;
        }
        if (this.quantPessoas != other.quantPessoas) {
            return false;
        }
        return true;
    }
    
    
}
