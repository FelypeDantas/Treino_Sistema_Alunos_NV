package TreinoSG;

public class Alunos {
  String nomeAluno;
  String sobrenomeAluno;
  int CodigoAluno;
  
  Alunos(){
	  this("","",0);
  }
  
  public Alunos(String nome, String sobrenome, int RA) {
	  nomeAluno = nome;
	  sobrenomeAluno = sobrenome;
	  CodigoAluno = RA;
  }
}
