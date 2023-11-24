package TreinoSG;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Principal {
public static void main(String []args) throws IOException {
	   Alunos[] al = new Alunos[30];
	   Metodos m = new Metodos();
	   int opc=0;
	   
	   while(opc != 9) {
		   
		   opc = Integer.parseInt(JOptionPane.showInputDialog("escolha: \n 1 - Cadastrar Alunos \n 2 - Escolher Curso \n"
		   		+ " 3 - gravar Alunos \n 9 - Fim"));
		   
		   switch(opc) {
		   case 1: al = m.CadastraAlunos(al);
		           break;
		   case 2: m.Curso();
		           break;
		   case 3: m.GravarAlunos(al);
		           break;
		   case 9: JOptionPane.showMessageDialog(null, "Finaliza Programa");
		           break;
		   default: JOptionPane.showMessageDialog(null, "Opção Inválida");
		   }
	   }
   }
}
