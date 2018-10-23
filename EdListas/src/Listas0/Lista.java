
package Listas0;

/**
 *
 * @author iurimega13
 */
public class Lista {
    
    private ElementoLista primeiro;
    private ElementoLista ultimo;
    private int total;
    
    public int TotalElementos(){
        
        return this.total;
    }
    
    public void adicionar(Materia nova){
        ElementoLista elementoNovo = new ElementoLista(nova);
        if (total == 0) {
            this.primeiro = elementoNovo;
            this.ultimo = elementoNovo;
        }else{
            ElementoLista temporario = this.ultimo;
            this.ultimo = elementoNovo;
            temporario.definirProximo(elementoNovo);
        }
        this.total++;
    }
    
    public void remover(Materia materia){
        
    }
    
    public void  removerUltima(){
        
    }
    
    public String imprimirLista(){
        StringBuilder builder = new StringBuilder("Lista");
        
        builder.append(this.primeiro + ",");
        ElementoLista atual = this.primeiro.irParaProximo();
        for (int i = 1; i < TotalElementos(); i++) {
            builder.append(atual).append(",");
            atual = atual.irParaProximo();
        }
        return builder.toString();
    }
    
    public void alterar(Materia antiga, Materia nova){
        
    }
        
            
}
