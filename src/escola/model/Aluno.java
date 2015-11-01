package escola.model;

public class Aluno extends Usuario {
	private Turma turma;
	private String nomeMae;
	private String nomePai;
	private String contatoMae;
	private String contatoPai;
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getContatoMae() {
		return contatoMae;
	}
	public void setContatoMae(String contatoMae) {
		this.contatoMae = contatoMae;
	}
	public String getContatoPai() {
		return contatoPai;
	}
	public void setContatoPai(String contatoPai) {
		this.contatoPai = contatoPai;
	}
	
	
	
	

}
