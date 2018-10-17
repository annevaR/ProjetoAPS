package projetoaps;


public class Professor {
    private String Nome;
    private String Disciplina;
    private int codigo;

    @Override
    public String toString() {
    	return "Professor{" + "Nome= " + this.Nome + ", Disciplina= " + this.Disciplina + ", codigo= " + this.codigo + '}';
    }
    
    
    public Professor(){
    	this.Nome = null;
    	this.Disciplina = null;
    	this.codigo = 0;
    }

    public Professor(String nome, String disc, int cod){
    	this.Nome = nome;
    	this.Disciplina = disc;
    	this.codigo = cod;
    }

    public String getNome() {
    	return Nome;
    }

    public void setNome(String Nome) {
    	this.Nome = Nome;
    }

    public String getDisciplina() {
        return this.Disciplina;
    }

    public void setDisciplina(String Disciplina) {
    	this.Disciplina = Disciplina;
    }

    public int getCodigo() {
    	return this.codigo;
    }

    public void setCodigo(int codigo) {
    	this.codigo = codigo;
    }
      
}
