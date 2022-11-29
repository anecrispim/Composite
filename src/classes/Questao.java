package classes;

//questão (a folha)
public class Questao extends ElementoQuestionario {
	
	public Questao(String descricao) {
		super(descricao);
	}
	
	@Override
    public void Exibir() {
        System.out.println("Questão " + this.descricao);
    }

}
