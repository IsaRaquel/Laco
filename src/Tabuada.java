import java.util.Iterator;

import javax.swing.JOptionPane;

public class Tabuada {
	
	public static void main(String[] args) {
		//Variaveis de descrição dos JOptionPane (as janelinhas)
		String descricao1 = "Escolha uma operação";
		String descricao2 = "O numero da tabuada";
		
		//Recebe o valor do 1° JOptionPane e coloca na variavel operacao
		String operacao = JOptionPane.showInputDialog(descricao1);
		//Recebe o valor do 1° JOptionPane e coloca na variavel operacao
		String valorTabuada = JOptionPane.showInputDialog(descricao2); 
		//Variavel com o texto exibido no ultimo JOptionPane (as janelinhas)
		String texto="Tabuada do "+valorTabuada+"\n\n";
		
		//Variavel utilizada nos laços
		int i=0;
		
		//Verificando se é um soma
		if(operacao.equals("+")) {
			//transformando o valor em inteiro
			int valor=Integer.parseInt(valorTabuada);
			/*****************************************************
			 * estrutura de repetição, basicamente o codigo dentro
			 * do for ira se repetir enquanto o i for menor que 11
			 * (o i++ soma 1 ao valor de i cada vez se repete a execução)
			 * **********************************************************/
			for (i = 0; i < 11; i++) {			
				//soma o i a variavel valor, mas isso se repete enquanto i for menor que 11
				int resultado=valor+i;
				//Concatena o resultado com a string texto pra ser exibido
				texto=texto+valor+" + "+i+" = "+resultado+"\n";			
				
			}			
			//Exibe o resultado da tabuada
			JOptionPane.showMessageDialog(null, texto);
		}
		
		//Verificando se é um subtração
		else if(operacao.equals("-")) {
			//transformando o valor em inteiro
			int valor=Integer.parseInt(valorTabuada);
			
			/*****************************************************
			 * estrutura de repetição, basicamente o codigo dentro
			 * do for ira se repetir enquanto o i for menor que 11
			 * (o i++ soma 1 ao valor de i cada vez se repete a execução)
			 * **********************************************************/
			
			for (i = 0; i < 11; i++) {
				//subtrai o i a variavel valor, mas isso se repete enquanto i for menor que 11
				int resultado=valor-i;
				//Concatena o resultado com a string texto pra ser exibido
				texto=texto+valor+" - "+i+" = "+resultado+"\n";					
			}			
			//Exibe o resultado da tabuada
			JOptionPane.showMessageDialog(null, texto);
		}
		//Verificando se é um multiplicação
		else if(operacao.equals("*")) {
			//transformando o valor em inteiro
			int valor=Integer.parseInt(valorTabuada);
			
			/*****************************************************
			 * estrutura de repetição, basicamente o codigo dentro
			 * do while ira se repetir enquanto a afimação for 
			 * verdadeira (i menor que 11)			 
			 * **********************************************************/
			
			while(i<11) {
				//multiplica o i a variavel valor, mas isso se repete enquanto i for menor que 11
				int resultado=valor*i;
				//Concatena o resultado com a string texto pra ser exibido
				texto=texto+valor+" x "+i+" = "+resultado+"\n";	
				
				/**********************************************
				 * Soma 1 ao valor de i toda vez que se repete
				 * ate i ser igual a 11, pois assim o codigo
				 * não fica repetindo infinitamente
				 ***********************************************/
				i++;
			}	
						
			//Exibe o resultado da tabuada
			JOptionPane.showMessageDialog(null, texto);
		}
		//Verificando se é um divisão
		else if(operacao.equals("/")) {
			//transformando o valor em double (fração)
			double valor=Double.parseDouble(valorTabuada);
			
			/*******************************************************
			 * Igual ao while só que executa pelo menos uma vez,
			 * pois primeiro executa o que ira se repetir 
			 * e depois verifica
			 ********************************************************/
		
			do {
				//dividi o i a variavel valor, mas isso se repete enquanto i for menor que 11
				double resultado=valor/i;
				//Concatena o resultado com a string texto pra ser exibido
				texto=texto+valor+" x "+i+" = "+resultado+"\n";	
				
				/**********************************************
				 * Soma 1 ao valor de i toda vez que se repete
				 * ate i ser igual a 11, pois assim o codigo
				 * não fica repetindo infinitamente
				 ***********************************************/
				i++;
			}/*****************************************************
			 * estrutura de repetição, basicamente o codigo dentro
			 * do while ira se repetir enquanto a afimação for 
			 * verdadeira (i menor que 11)			 
			 * **********************************************************/
			
			while(i<11);
						
			//Exibe o resultado da tabuada
			JOptionPane.showMessageDialog(null, texto);
		}
		
	}

}
