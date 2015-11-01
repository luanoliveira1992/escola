package escola.model;

import java.util.List;

public class Professor extends Usuario {
	private List<Turma> turmas;
	private List<Materia> materias;
	private String telefone;
	public List<Turma> getTurmas() {
		return turmas;
	}
	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}
	public List<Materia> getMaterias() {
		return materias;
	}
	public void setMaterias(List<Materia> materia) {
		this.materias = materia;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}
