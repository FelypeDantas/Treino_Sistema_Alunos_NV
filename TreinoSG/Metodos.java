package TreinoSG;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.io.BufferedReader;
import javax.swing.JOptionPane;

public class Metodos {
	
 Alunos[] al = new Alunos[30];

public Alunos[] CadastraAlunos(Alunos[] al) throws IOException {
	int i;
	String fileName = "Alunos.txt";
	BufferedWriter gravar = new BufferedWriter(new FileWriter(fileName));
	
	Random gerador = new Random();
	
	for(i=0; i<30; i++) {
		 al[i] = new Alunos();
	   }
	
	for(i = 0; i<30; i++) {
		al[i].nomeAluno = JOptionPane.showInputDialog("Informe o Nome do Aluno: ");
		gravar.write(al[i].nomeAluno);
		gravar.newLine();
		al[i].sobrenomeAluno = JOptionPane.showInputDialog("Informe o sobrenome do Aluno: ");
		gravar.write(al[i].sobrenomeAluno);
		gravar.newLine();
		al[i].CodigoAluno = gerador.nextInt(999);
		gravar.write(Integer.toString(al[i].CodigoAluno));
		gravar.newLine();
	}
	System.out.println("Gravação concluida");
	gravar.close();
	return al;
}

public void Curso() {
	int opc=0;
	
  while(opc != 9) {
	  
	  opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha: \n 1 - Análise de Sistemas \n 2 - Gestão Empresarial"
	  		+ " \n 3 - Polimeros \n 4 - Desenvolvimento de Multiplataforma \n 9 - Finaliza"));
	switch(opc) {
	case 1: JOptionPane.showMessageDialog(null, "Análise de Sistemas");
	        Periodo();
	        break;
	case 2: JOptionPane.showMessageDialog(null, "Gestão Empresarial");
	        Periodo();
	        break;
	case 3: JOptionPane.showMessageDialog(null, "Polimeros");
	        Periodo();
	        break;
	case 4: JOptionPane.showMessageDialog(null, "Desenvolvimento de Multiplataforma");
	        Periodo();
	        break;
	case 9: JOptionPane.showMessageDialog(null, "Finaliza");
	        break;
	default: JOptionPane.showMessageDialog(null, "Opção inválida");
	}
  }
}

public void Periodo() {
	int opc = 0;
	
	while(opc != 9) {
		switch(opc){
		case 1: JOptionPane.showMessageDialog(null, "Manhã");
		        break;
		case 2: JOptionPane.showMessageDialog(null, "Tarde");
                break;
		case 3: JOptionPane.showMessageDialog(null, "Noite");
                break;
		}
	}
	
}

public void GravarAlunos(Alunos[] al) throws IOException {
	String fileName = "Alunos.txt";
	BufferedReader ler = new BufferedReader(new FileReader(fileName));
	int i;
	
	for(i=0; i<30; i++) {
		al[i] = new Alunos();
	}
	
	for(i=0; i<30; i++) {
		al[i].nomeAluno = ler.readLine();
		al[i].sobrenomeAluno = ler.readLine();
		al[i].CodigoAluno = Integer.parseInt(ler.readLine());
		
	}
	for(i=0; i<30; i++) {
	    System.out.println("O Aluno: " +al[i].nomeAluno + " "+al[i].sobrenomeAluno+ " Dono do RA: " +al[i].CodigoAluno);
	}
	ler.close();
}
}
