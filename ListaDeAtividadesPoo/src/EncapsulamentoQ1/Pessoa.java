package EncapsulamentoQ1;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author iurimega13
 */
public class Pessoa {
    private String nome;
    private Date dataNascimento;
    private double altura;

    public Pessoa(String nome, Date dataNascimento, double altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", dataNascimento=" + dataNascimento + ", altura=" + altura + '}';
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nome);
        hash = 53 * hash + Objects.hashCode(this.dataNascimento);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.altura) ^ (Double.doubleToLongBits(this.altura) >>> 32));
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
        final Pessoa other = (Pessoa) obj;
        if (Double.doubleToLongBits(this.altura) != Double.doubleToLongBits(other.altura)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.dataNascimento, other.dataNascimento)) {
            return false;
        }
        return true;
    }
    

    public String getNome() {
        return nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public double getAltura() {
        return altura;
    }
    
    
}
