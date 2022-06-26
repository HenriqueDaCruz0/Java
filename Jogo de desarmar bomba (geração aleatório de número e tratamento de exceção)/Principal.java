import javax.swing.JOptionPane;

public class Principal
	{public static void main(String[] args)
		{int Opcao = 0;
		 String EscolherFio;
			
		 Metodos Fios;
		 Fios = new Metodos();
		
		 System.out.println("\n " + " ========================");
		 System.out.println(" " + " || Faça a sua jogada! ||");
		 System.out.println(" " + " ========================");
		 
		 EscolherFio = JOptionPane.showInputDialog("\n GAME DESARMAR BOMBA" + "\n\n\t Escolha o fio certo! \n1) Azul \n2) Amarelo \n3) Verde \n4)Preto \n5)Vermelho \n6) Roxo");
		 Opcao = Integer.parseInt(EscolherFio);
			Fios.Cortar(Opcao);
			Fios.Informa(Opcao);
		}
	}
