package classes;

// classe base (o componente)
public abstract class ElementoQuestionario {
	protected String descricao;
	
	
    public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	protected ElementoQuestionario(String descricao) {
		this.setDescricao(descricao);
    }
    public abstract void Exibir();
}
