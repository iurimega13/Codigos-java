package Listas0;

/**
 *
 * @author iurimega13
 */
public class ElementoLista {

    private Materia materia;
    private ElementoLista proximo;

    public ElementoLista irParaProximo() {
        return this.proximo;
    }

    public void definirProximo(ElementoLista elemento) {
        this.proximo = elemento;
    }
    
    public ElementoLista(Materia materia){
        this.materia = materia;
        this.proximo = null;
    }
}
