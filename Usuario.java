package projetoaps;

public class Usuario {
    private String nome_completo;
    private int matricula;
    private int idade;
    private String senha;
    private String curso;
    private int ano;
 
    
    @Override
    public String toString() {
        return "Usuario{" + "nome_completo= " + this.nome_completo + ", matricula= " + this.matricula + ", idade= " + this.idade + ", curso= " + this.curso + ", ano= " + this.ano + '}';
    }


    public Usuario(){
    	this.nome_completo= null;
    	this.matricula = 123;
    	this.idade = 00;
    	this.senha = null;
    	this.ano = 2000;
    	this.curso = null;
    
    }
    public Usuario (String nome, int matri, int idade, String senha, int ano, String curso){
    	this.nome_completo= nome;
    	this.matricula = matri;
    	this.idade = idade;
    	this.senha = senha;
    	this.ano = ano;
    	this.curso = curso;
    }

    public String getNome_completo() {
    	return this.nome_completo;
    }

    public void setNome_completo(String nome_completo) {
    	this.nome_completo = nome_completo;
    }

    public int getMatricula() {
    	return this.matricula;
    }

    public void setMatricula(int matricula) {
    	this.matricula = matricula;
    }

    public int getIdade() {
    	return this.idade;
    }

    public void setIdade(int idade) {
    	this.idade = idade;
    }

    public String getSenha() {
    	return this.senha;
    }

    public void setSenha(String senha) {
    	this.senha = senha;
    }

    public String getCurso() {
    	return this.curso;
    }

    public void setCurso(String curso) {
    	this.curso = curso;
    }

    public int getAno() {
    	return this.ano;
    }

    public void setAno(int ano) {
    	this.ano = ano;
    }
}

