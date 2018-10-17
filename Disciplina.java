package projetoaps;

public class Disciplina {
    private String Nome;
    private String Professor;
    
    public Disciplina(){
    	this.Nome = null;
    	this.Professor = null;
    }
    
    public Disciplina(String nome, String prof){
    	this.Nome = nome;
    	this.Professor = prof;
    }

    public String getNome() {
    	return this.Nome;
    }

    public void setNome(String Nome) {
    	this.Nome = Nome;
    }

    public String getProfessor() {
    	return this.Professor;
    }

    public void setProfessor(String Professor) {
    	this.Professor = Professor;
     }
    

    @Override
    public String toString() {
        return "Disciplina{" + "Nome= " + this.Nome + ", Professor= " + this.Professor + "}";
    }
             
    
    
}


