package projetoaps;


public class ProjetoAps {

    
    public static void main(String[] args) {
  	 
	Usuario a = new Usuario();
    	a.setNome_completo ("joao");
	a.setMatricula(12345);
	a.setAno(3);
	a.setIdade(16);
	a.setCurso("informática");
    	System.out.println(a.toString());
        
  	Disciplina s = new Disciplina();
	s.setNome("poo");
	s.setProfessor("Danielle");
    	System.out.println(s.toString());
    
        Professor n = new Professor();
    	n.setNome("eric");
	n.setDisciplina("Web");
	n.setCodigo(12);
    	System.out.println(n.toString());
	
  	 
	}
    
}

   
    
