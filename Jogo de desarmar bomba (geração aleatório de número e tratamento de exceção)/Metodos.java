import java.util.Random;

import javax.swing.JOptionPane;

public class Metodos
	{private int Fio;
	 private int FinalGame;
	 private int GameOver;
	 private int Mostra;
	 private int Parte;
	 private int NivelSeguinte;
	 private int NivelB;
	 private int Bonus;
	
	public void Cortar(int Opcao)
		{int aux = 1;
		 String Final;
		 
		 if(Opcao <= 6)
		 	{Random aleatorioA = new Random();
		 	Fio = aleatorioA.nextInt(12) + 1;
		 		System.out.println(" " + " =======================");
		 		System.out.println(" " + " || Número gerado: " + Fio + " ||");

	    
		 	try
		 		{if(Fio % 2 > 0)
	     			{NivelSeguinte++;
	     			 System.out.println(" " + " || ----------------- ||");
	     			 System.out.println(" " + " || Fio certo!        ||");
	     			 System.out.println(" " + " =======================");
	     			 /*System.out.println(" " + "impar"); impar o correto teste*/ 
	     			}
			
		 		else if(Fio % 2 == 0)
	     				{if(aux % 0 == 1)
	     				{}
	     			}
		 		}catch(Exception e)
	    				{GameOver++;
	    				 System.out.println(" " + " || ----------------- ||");
	    				 System.out.println(" " + " || Cabum! XD         ||");
	    				 System.out.println(" " + " =======================");
	    				 /*System.out.println(" " + "par"); par o errado teste*/
	    				}
		 	
		 	if(NivelSeguinte == 1)
	     		{System.out.println("\n\n " + " ==================================");
	     		 System.out.println(" " + " || Faça a sua jogada novamente! ||");
	     		 System.out.println(" " + " ==================================");
	    	 
	     		 Final = JOptionPane.showInputDialog("\n\t Última rodada! \n1) Azul \n2) Amarelo \n3) Verde \n4)Preto \n5)Vermelho \n6) Roxo");
	     		 NivelB = Integer.parseInt(Final);
	    	 
	     		 Parte++;
	    	 
	     		 Random aleatorioB = new Random();
	     		 Fio = aleatorioB.nextInt(12) + 1;
	     		 	System.out.println(" " + " =======================");
	     		 	System.out.println(" " + " || Número gerado: " + Fio + " ||");
	    	 
	     		 try
	     		 	{if(Fio % 2 > 0)
	     		 		{FinalGame++;
	     		 		 Mostra++;
	     		 		 System.out.println(" " + " || ----------------- ||");
	     		 		 System.out.println(" " + " || Fio certo!        ||");
	     		 		 System.out.println(" " + " =======================");
	     		 		 /*System.out.println("impar"); impar o correto*/ 
	     		 		}
				
	     		 	else if(Fio % 2 == 0)
	     		 		{if(aux % 0 == 1)
	     		 			{}
	     		 		}
	     		 	}catch(Exception e)
		    		     {GameOver++;
		    		     System.out.println(" " + " || ----------------- ||");
		    		     System.out.println(" " + " || Cabum! XD         ||");
		    		     System.out.println(" " + " =======================");
		    		     /*System.out.println("par"); par o errado*/
		    		     }
	     		}
		 	}
		}
	
	public void Informa(int Opcao)
		{System.out.println("\n " + " =======================");
		 System.out.println(" " + " ||   Primeiro Fio!   ||");
		 System.out.println(" " + " =======================");
		
		 System.out.println(" " + " ===========================");
		
	     if(Opcao == 1)
	    	System.out.println(" " + " || Fio cortado: Azul     ||");
	     
	     if(Opcao == 2)
	     	System.out.println(" " + " || Fio cortado: Amarelo  ||");
	     
	     if(Opcao == 3)
	     	System.out.println(" " + " || Fio cortado: Verde    ||");
	     
	     if(Opcao == 4)
	     	System.out.println(" " + " || Fio cortado: Preto    ||");
	     
	     if(Opcao == 5)
	     	System.out.println(" " + " || Fio cortado: Vermelho ||");
	     
	     if(Opcao == 6)
	     	System.out.println(" " + " || Fio cortado: Roxo     ||");
	     
	     System.out.println(" " + " ===========================");
	     
	     try
			{if(Mostra % 0 == 1)
	     		{}
			}catch(Exception e2)
	     		{if(NivelSeguinte == 1)
	     			{if(Parte == 1)
			 			{System.out.println("\n " + " ========================");
			 			 System.out.println(" " + " ||    Segundo Fio!    ||");
			 			 System.out.println(" " + " ========================");
			 			}
				
	     			System.out.println(" " + " ===========================");
			
	     			if(NivelB == 1)
	     				System.out.println(" " + " || Fio cortado: Azul     ||");
		     
	     			if(NivelB == 2)
	     				System.out.println(" " + " || Fio cortado: Amarelo  ||");
		     
	     			if(NivelB == 3)
	     				System.out.println(" " + " || Fio cortado: Verde    ||");
		     
	     			if(NivelB == 4)
	     				System.out.println(" " + " || Fio cortado: Preto    ||");
		     
	     			if(NivelB == 5)
	     				System.out.println(" " + " || Fio cortado: Vermelho ||");
		     
	     			if(NivelB == 6)
	     				System.out.println(" " + " || Fio cortado: Roxo     ||");
		     
	     			if(NivelB == 10)
	     				Bonus++;
	     			
	     			System.out.println(" " + " ===========================");
	     			}
	     		}
	     
	     if(FinalGame == 1)
	    	 {System.out.println("\n\n\n " + "      ==================");
	    	  System.out.println(" " + "      || Você venceu! ||");
	    	  System.out.println(" " + "      ==================");
	    	 }
	     
	     if(GameOver == 1)
    	 {System.out.println("\n\n\n " + "      ==================");
    	  System.out.println(" " + "      || Você Perdeu! ||");
    	  System.out.println(" " + "      ==================");
    	 }
	     
	     if(Bonus == 1)
	     	{System.out.println("\n\n " + "      |_(¨`·.·´¨)_____I___|");
	    	 System.out.println(" " + "      |__`·.(¨`·.·´¨)Love_|");
	    	 System.out.println(" " + "      |______`·.¸.·´_You__|");
	     	}     
	     
	     System.out.println("\n\n " + " ===============================================");
	     System.out.println(" " + " ||                                           ||");
	     System.out.println(" " + " ||      Sistemas de Informação (UNIFEBE)     ||");
	     System.out.println(" " + " ||                                           ||");
	     System.out.println(" " + " ||               (Programação I)             ||");
	     System.out.println(" " + " ||                                           ||");
   	     System.out.println(" " + " ||            (Os Desenvolvedores)           ||");
   	     System.out.println(" " + " ||                                           ||");
   	     System.out.println(" " + " ||              Henrique da Cruz             ||");
   	     System.out.println(" " + " ||                                           ||");
   	     System.out.println(" " + " ||                                           ||");
   	     System.out.println(" " + " ||               Data 25/06/2022             ||");
   	     System.out.println(" " + " ||                                           ||");
   	     System.out.println(" " + " ===============================================");
	     
		}
	}
