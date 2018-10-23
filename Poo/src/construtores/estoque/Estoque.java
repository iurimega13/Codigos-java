package construtores.estoque;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iurimega13
 */
public class Estoque {
    private String nome;
    private int QteAtual;
    private int QteMinima;
    
    public Estoque(String nome,int QteAtual,int QteMinima){
        this.nome = nome;
        this.QteAtual = QteAtual;
        this.QteMinima = QteMinima;
    }
    public Estoque(){
        
    }
    
    public void repor(int qtd){
        QteAtual += qtd;
    }
    
    public void darBaixa(int qte){
        QteAtual -= qte;
    }
    
    public void mudarNome(String nome){
        this.nome = nome;
    }
    
    public void mudaQteAtual(int QteAtual){
        if (QteAtual < 0){
            this.QteAtual = 0;
        }else{
            this.QteAtual = QteAtual;
        }
    }
    
    public void mudaQteMinima(int QteMinima){
        if (QteMinima < 0){
            this.QteMinima = 0;
        }else{
            this.QteMinima = QteMinima;
        }
    }
    
    
}
