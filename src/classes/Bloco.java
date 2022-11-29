package classes;

import java.util.ArrayList;
import java.util.List;

//bloco (o composto)
public class Bloco extends ElementoQuestionario {
	
	private List<ElementoQuestionario> _elementos = new ArrayList<ElementoQuestionario>();
 
    public Bloco(String descricao) {
    	super(descricao);
    }
    
    @Override
    public void Exibir() {
        System.out.println("Bloco " + this.descricao);
        for (ElementoQuestionario elementoQuestionario : _elementos) {
        	elementoQuestionario.Exibir();
		}
    }
 
    public void adicionar(ElementoQuestionario elemento) {
        _elementos.add(elemento);
    }
 
    public void remover(ElementoQuestionario elemento) {
        _elementos.remove(elemento);
    }
}
