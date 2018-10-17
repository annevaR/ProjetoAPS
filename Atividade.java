package projetoaps;

import java.util.ArrayList;

public class Atividade {
    private String nome;
    private String tag;
    private  String disciplina;
    private boolean cadastrada;
    private boolean atrasada;
    private boolean concluida;
    private ArrayList<Deadline> deadline;
    
   
    public void submeterAtividade(){
        if (getCadastrada() && !getAtrasada() && !getConcluida() ){
            System.out.println("\n" +"Atividade submetida com sucesso!" +"\n");
        } 
    }
    
    public void verificarStatus(){
        if (getAtrasada()){
            System.out.println("\n" +"Conclua já a sua atividade, ela está atrasada!" + "\n" );
        } else { System.out.println("\n" +"Continue fazendo melhorias na sua atividade ou a conclua ;)" + "\n" );
        }
        if (getConcluida()){
            System.out.println("\n"  +"Atividade concluída com sucesso!"+ "\n" );
        } else { System.out.println("\n" +"Ops... a sua atividade pode estar atrasada!" + "\n" );
        }
    }
    public Atividade(){
        this.nome = "-----";
        this.tag = "-no tag-";
        this.disciplina = "null";
        this.cadastrada = false;
        this.atrasada = false;
        this.concluida = false;
        
    }
    

    public Atividade(String nome, String tag, String disciplina, boolean cadastrada, boolean atrasada, boolean concluida) {
        this.nome = nome;
        this.tag = tag;
        this.disciplina = disciplina;
        this.cadastrada = cadastrada;
        this.atrasada = atrasada;
        this.concluida = concluida;
        this.deadline = new ArrayList<Deadline>();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    public boolean getCadastrada(){
        return this.cadastrada;
    }
    
    public void setCadastrada(boolean cadastrada){
        this.cadastrada = cadastrada;
    }

    public boolean getAtrasada() {
        return this.atrasada;
    }

    public void setAtrasada(boolean atrasada) {
        this.atrasada = atrasada;
    }

    public boolean getConcluida() {
        return this.concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
    
    
    public ArrayList<Deadline> getDeadline() {
        return this.deadline;
    }

    public void setDeadline(ArrayList<Deadline> deadline) {
        this.deadline = deadline;
    }

    public void  addDeadline(Deadline d){
        this.deadline.add(d);
    }
  
    public void removeDeadline(int l){
        this.deadline.remove(l);
       
    }

    @Override
    public String toString() {
        return "Atividade{" + "nome=" + nome + ", tag=" + tag + ", disciplina=" + disciplina + ", cadastrada=" + cadastrada + ", atrasada=" + atrasada + ", concluida=" + concluida + ", deadline=" + deadline + '}';
    }

    
   
    
    
    
    
    
    
    
}
