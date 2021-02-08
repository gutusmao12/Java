package Turma15;

import java.util.Scanner;

public class Projeto1 {
	public static void main(String[] args) {
		String nome = null;
		int op1, op2, op3, senha, num, i = 0;
		int [] vetor = new int[1];
		    
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite uma senha numérica para o cadasto: ");
		num = ler.nextInt();
		senha = num;
				
		System.out.println("Digite a senha escolhida: ");
		senha = ler.nextInt();
				
		while(senha != num) {
			if(senha != num) {
				System.out.println("Senha inválida! Tente novamente.\n");
				senha = ler.nextInt();
			}
		}
		if(senha == num) {
			System.out.println("Entre com seu nome: ");
			nome = ler.next();
		}
		    System.out.println("Bem vindo, " +nome+ "! Esse é o nosso teste vocacional temático.");
		    int rnd = (int) (1 + Math.random() * 6);
			vetor[i] = rnd;
			System.out.println("Lançando o dado: " +vetor[i]+ "\n");
			if(vetor[i] == 1) {
				System.out.println("Oi, eu sou Hajime Isayama e sou criador de um grande anime");
				System.out.println("Irei te recomendar um dos bons para assistir durante a pandemia");
			}
			if(vetor[i] == 2) {
				System.out.println("Oi, eu sou Akira Toriyama e sou criador de um grande anime");
				System.out.println("Irei te recomendar um dos bons para assistir durante a pandemia");
			}
			if(vetor[i] == 3) {
				System.out.println("Oi, eu sou Eichiro Oda e sou criador de um grande anime");
				System.out.println("Irei te recomendar um dos bons para assistir durante a pandemia");
			}
			if(vetor[i] == 4) {
				System.out.println("Oi, eu sou o Masashi Kishimoto e sou criador de um grande anime");
				System.out.println("Irei te recomendar um dos bons para assistir durante a pandemia");
			}
			if(vetor[i] == 5) {
				System.out.println("Oi, eu sou Hinata Hyuga e sou criadora de um grande anime");
				System.out.println("Irei te recomendar um dos bons para assistir durante a pandemia");
			}
			if(vetor[i] == 6) {
				System.out.println("Oi, eu sou Sakura Haruno e sou criadora de um grande anime");
				System.out.println("Irei te recomendar um dos bons para assistir durante a pandemia");
			}
			System.out.println("Irei te conduzir em uma análise para que você possa descobrir, se divertir e se conhecer um pouco mais");
			
			
		    System.out.println("Agora você responderá algumas perguntas para sabermos qual a melhor indicação para você. Vamos nessa!\n");
		    System.out.println("Primeira pergunta: Qual gênero você mais se identifica?");
		    System.out.println("1- fantasia   2- comédia   3- mistério");
		    op1 = ler.nextInt();
		    System.out.println("Segunda pergunta: O que você mais valoriza?");
		    System.out.println("1- A si próprio   2- Família    3- Amigos"); 
		    op2 = ler.nextInt();
		    System.out.println("Terceira pergunta: Seus amigos te descreveriam como uma pessoa");
		    System.out.println("1- Persuasiva   2- Realista   3- Insistente");
		    op3 = ler.nextInt();
		    	
		    if(op1 == 1){
		    	if(op2 == 1 && op3 == 1){
		    		System.out.println("\nDe acordo com nossos levantamentos você é uma pessoa..... Proativa");
		    		System.out.println("\nO seu anime recomendado é: Naruto!\n");
		    		System.out.println("As conquistas de Naruto são frutos de dedicação e proatividade.");
		    		System.out.println("Naruto sempre era o primeiro a aceitar uma missão, independente do nível da missão.");
		    		System.out.println("\nA profissão indicada é: Gestor Ambiental");
		            System.out.println("O trabalho deste profissional é preservar e recuperar o meio ambiente, ajudar empresas a usarem de forma consciente os recursos naturais");
		            
		      }
		    	if(op2 == 2 && op3 == 1){
		    	  System.out.println("De acordo com nossos levantamentos você é uma pessoa..... Proativa");
		    	  System.out.println("\nO seu anime recomendado é: Naruto!\n");
		    	  System.out.println("As conquistas de Naruto são frutos de dedicação e proatividade.");
		    	  System.out.println("Naruto sempre era o primeiro a aceitar uma missão, independente do nível da missão.");
		    	  System.out.println("\nA profissão indicada é: Gestor Ambiental");
		          System.out.println("O trabalho deste profissional é preservar e recuperar o meio ambiente, ajudar empresas a usarem de forma consciente os recursos naturais");
		          
		      }
		      if(op2 == 3 && op3 == 1){
		    	  System.out.println("De acordo com nossos levantamentos você é uma pessoa..... Proativa");
		    	  System.out.println("\nO seu anime recomendado é: Naruto!\n");
		    	  System.out.println("As conquistas de Naruto são frutos de dedicação e proatividade.");
		    	  System.out.println("Naruto sempre era o primeiro a aceitar uma missão, independente do nível da missão.");
		    	  System.out.println("\nA profissão indicada é: Gestor Ambiental");
		          System.out.println("O trabalho deste profissional é preservar e recuperar o meio ambiente, ajudar empresas a usarem de forma consciente os recursos naturais");
		          
		      }
		      if(op2 == 1 && op3 == 2){
		    	  System.out.println("De acordo com nossos levantamentos você é uma pessoa..... que tem Responsabilidade Pessoal");
		    	  System.out.println("\nO seu anime recomendado é: Naruto!\n");
		    	  System.out.println("As conquistas de Naruto são frutos de dedicação e responsabilidade pessoal.");
		    	  System.out.println("Naruto nunca deixava de assumir a responsabilidade por seus erros ou acertos e dessa forma estava sempre empenhado em crescer e aprender.");
		    	  System.out.println("\nA profissão indicada é: Desenvolvedor de Software");
		          System.out.println("Responsável por construir o mundo digital. Afinal, quanto mais pessoas e empresas utilizam softwares maior é a demanda por profissionais qualificados.");
		        
		      }
		      if(op2 == 2 && op3 == 2){
		    	  System.out.println("De acordo com nossos levantamentos você é uma pessoa..... que tem Responsabilidade Pessoal");
		    	  System.out.println("\nO seu anime recomendado é: Naruto\n!");
		    	  System.out.println("As conquistas de Naruto são frutos de dedicação e responsabilidade pessoal.");
		    	  System.out.println("Naruto nunca deixava de assumir a responsabilidade por seus erros ou acertos e dessa forma estava sempre empenhado em crescer e aprender.");
		    	  System.out.println("\nA profissão indicada é: Desenvolvedor de Software");
		          System.out.println("Responsável por construir o mundo digital. Afinal, quanto mais pessoas e empresas utilizam softwares maior é a demanda por profissionais qualificados.");
		        
		      }
		      if(op2 == 3 && op3 == 2){
		    	  System.out.println("De acordo com nossos levantamentos você é uma pessoa..... que tem Responsabilidade Pessoal");
		    	  System.out.println("\nO seu anime recomendado é: Naruto!\n");
		    	  System.out.println("As conquistas de Naruto são frutos de dedicação e responsabilidade pessoal.");
		    	  System.out.println("Naruto nunca deixava de assumir a responsabilidade por seus erros ou acertos e dessa forma estava sempre empenhado em crescer e aprender.");
		    	  System.out.println("\nA profissão indicada é: Desenvolvedor de Software");
		          System.out.println("Responsável por construir o mundo digital. Afinal, quanto mais pessoas e empresas utilizam softwares maior é a demanda por profissionais qualificados.");
		        
		      }
		      if(op2 == 1 && op3 == 3){
		    	  System.out.println("De acordo com nossos levantamentos você é uma pessoa..... Persistente!");
		    	  System.out.println("\nO seu anime recomendado é: Naruto!\n");
		    	  System.out.println("As conquistas de Naruto são frutos de persistência e dedicação.");
		    	  System.out.println("Aos nossos olhos, a ideia de nunca desistir parece meio utópica, todavia, somos mostrados constantemente que é possível superar nossas fraquezas e seguir em frente.");
		    	  System.out.println("Através de ajuda, trabalho e bastante perseverança, chegar no ponto almejado pode se tornar uma realidade. Mas o mais importante é ter em mente que, assim como Naruto, não devemos deixar nossos sonhos morrerem.");
		    	  System.out.println("\nA profissão indicada é: Conselheiro de compromisso de saúde"); 
		          System.out.println("Trabalha remotamente para oferecer coaching individual e conselhos de bem-estar e saúde para usuários de pulseiras inteligentes.");

		      }
		      if(op2 == 2 && op3 == 3){
		    	  System.out.println("De acordo com nossos levantamentos você é uma pessoa..... Persistente!");
		    	  System.out.println("\nO seu anime recomendado é: Naruto!\n");
		    	  System.out.println("As conquistas de Naruto são frutos de persistência e dedicação.");
		    	  System.out.println("Aos nossos olhos, a ideia de nunca desistir parece meio utópica, todavia, somos mostrados constantemente que é possível superar nossas fraquezas e seguir em frente.");
		    	  System.out.println("Através de ajuda, trabalho e bastante perseverança, chegar no ponto almejado pode se tornar uma realidade. Mas o mais importante é ter em mente que, assim como Naruto, não devemos deixar nossos sonhos morrerem.");
		    	  System.out.println("\nA profissão indicada é: Conselheiro de compromisso de saúde"); 
		          System.out.println("Trabalha remotamente para oferecer coaching individual e conselhos de bem-estar e saúde para usuários de pulseiras inteligentes.");

		      }
		      if(op2 == 3 && op3 == 3){
		    	  System.out.println("De acordo com nossos levantamentos você é uma pessoa..... que gosta de Trabalhar em Equipe!");
		    	  System.out.println("\nO seu anime recomendado é: Naruto!\n");
		    	  System.out.println("As conquistas de Naruto são frutos de trabalho em equipe e dedicação.");
		    	  System.out.println("Trabalhar em equipe as vezes pode parecer difícil, porém quando colocamos diferentes ideias em único objetivo, o resultado é incrível!");
		    	  System.out.println("Através de ajuda, trabalho em equipe e bastante perseverança, chegar no ponto almejado pode se tornar uma realidade. Mas o mais importante é ter em mente que, assim como Naruto, não devemos deixar nossos sonhos morrerem.");
		    	  System.out.println("\nA profissão indicada é: Conselheiro de compromisso de saúde"); 
		          System.out.println("Trabalha remotamente para oferecer coaching individual e conselhos de bem-estar e saúde para usuários de pulseiras inteligentes.");

		      }
		    }
		    if(op1 == 2){//ToraDora
		    	if(op2 == 1 && op3 == 1){
		    		System.out.println("De acordo com nossos levantamentos você é uma pessoa..... que tem Responsabilidade Pessoal!");
		    		System.out.println("\nO seu anime recomendado é: Toradora!\n");
		    		System.out.println("Taiga vem de uma família rica, mas ela resolveu sair de casa e viver por conta própria, devido a questões familiares.");
		    		System.out.println("Ela, por coincidência, está vivendo em um apartamento ao lado da casa de Ryūji.");
		    		System.out.println("Quando Ryūji descobre que Taiga tem uma queda por Yūsaku e Taiga descobre que Ryūji é apaixonado por Minori, Ryūji sugere que eles se ajudem para ambos conquistarem seus objetivos amorosos.");
		    		System.out.println("\nA profissão indicada é: Gestor Ambiental");
		    	    System.out.println("O trabalho deste profissional é preservar e recuperar o meio ambiente, ajudar empresas a usarem de forma consciente os recursos naturais");

		      }
		    	if(op2 == 2 && op3 == 1){
		    		System.out.println("De acordo com nossos levantamentos você é uma pessoa..... que gosta de Trabalhar em Equipe!");
		    		System.out.println("\nO seu anime recomendado é: Toradora!\n");
		    		System.out.println("Taiga vem de uma família rica, mas ela resolveu sair de casa e viver por conta própria, devido a questões familiares.");
		    		System.out.println("Ela, por coincidência, está vivendo em um apartamento ao lado da casa de Ryūji.");
		    		System.out.println("Quando Ryūji descobre que Taiga tem uma queda por Yūsaku e Taiga descobre que Ryūji é apaixonado por Minori, Ryūji sugere que eles se ajudem para ambos conquistarem seus objetivos amorosos.");
		    		System.out.println("\nA profissão indicada é: Gestor Ambiental");
		    	    System.out.println("O trabalho deste profissional é preservar e recuperar o meio ambiente, ajudar empresas a usarem de forma consciente os recursos naturais");

		      }
		    	if(op2 == 3 && op3 == 1){
		    		System.out.println("De acordo com nossos levantamentos você é uma pessoa..... que tem Responsabilidade Pessoal!");
		    		System.out.println("\nO seu anime recomendado é: Toradora!\n");
		    		System.out.println("Taiga vem de uma família rica, mas ela resolveu sair de casa e viver por conta própria, devido a questões familiares.");
		    		System.out.println("Ela, por coincidência, está vivendo em um apartamento ao lado da casa de Ryūji.");
		    		System.out.println("Quando Ryūji descobre que Taiga tem uma queda por Yūsaku e Taiga descobre que Ryūji é apaixonado por Minori, Ryūji sugere que eles se ajudem para ambos conquistarem seus objetivos amorosos.");
		    		System.out.println("\nA profissão indicada é: Gestor Ambiental");
		    	    System.out.println("O trabalho deste profissional é preservar e recuperar o meio ambiente, ajudar empresas a usarem de forma consciente os recursos naturais");

		      }
		    	if(op2 == 1 && op3 == 2){
		    		System.out.println("De acordo com nossos levantamentos você é uma pessoa..... que tem Responsabilidade Pessoal!");
		    		System.out.println("\nO seu anime recomendado é: Toradora!\n");
		    		System.out.println("Taiga vem de uma família rica, mas ela resolveu sair de casa e viver por conta própria, devido a questões familiares.");
		    		System.out.println("Ela, por coincidência, está vivendo em um apartamento ao lado da casa de Ryūji.");
		    		System.out.println("Quando Ryūji descobre que Taiga tem uma queda por Yūsaku e Taiga descobre que Ryūji é apaixonado por Minori, Ryūji sugere que eles se ajudem para ambos conquistarem seus objetivos amorosos.");
		    		System.out.println("\nA profissão indicada é: Desenvolvedor de Software");
		            System.out.println("Responsável por construir o mundo digital. Afinal, quanto mais pessoas e empresas utilizam softwares maior é a demanda por profissionais qualificados.");

		      }
		    	if(op2 == 2 && op3 == 2){
		    		System.out.println("De acordo com nossos levantamentos você é uma pessoa..... que gosta de Trabalhar em Equipe!");
		    		System.out.println("\nO seu anime recomendado é: Toradora!\n");
		    		System.out.println("Taiga vem de uma família rica, mas ela resolveu sair de casa e viver por conta própria, devido a questões familiares.");
		    		System.out.println("Ela, por coincidência, está vivendo em um apartamento ao lado da casa de Ryūji.");
		    		System.out.println("Quando Ryūji descobre que Taiga tem uma queda por Yūsaku e Taiga descobre que Ryūji é apaixonado por Minori, Ryūji sugere que eles se ajudem para ambos conquistarem seus objetivos amorosos.");
		    		System.out.println("\nA profissão indicada é: Desenvolvedor de Software");
		            System.out.println("Responsável por construir o mundo digital. Afinal, quanto mais pessoas e empresas utilizam softwares maior é a demanda por profissionais qualificados.");

		      }
		    	if(op2 == 3 && op3 == 2){
		    		System.out.println("De acordo com nossos levantamentos você é uma pessoa..... que tem Responsabilidade Pessoal!");
		    		System.out.println("\nO seu anime recomendado é: Toradora!\n");
		    		System.out.println("Taiga vem de uma família rica, mas ela resolveu sair de casa e viver por conta própria, devido a questões familiares.");
		    		System.out.println("Ela, por coincidência, está vivendo em um apartamento ao lado da casa de Ryūji.");
		    		System.out.println("Quando Ryūji descobre que Taiga tem uma queda por Yūsaku e Taiga descobre que Ryūji é apaixonado por Minori, Ryūji sugere que eles se ajudem para ambos conquistarem seus objetivos amorosos.");
		    		System.out.println("\nA profissão indicada é: Desenvolvedor de Software");
		            System.out.println("Responsável por construir o mundo digital. Afinal, quanto mais pessoas e empresas utilizam softwares maior é a demanda por profissionais qualificados.");

		      }
		    	if(op2 == 1 && op3 == 3){
		    		System.out.println("De acordo com nossos levantamentos você é uma pessoa..... que tem Responsabilidade Pessoal!");
		    		System.out.println("\nO seu anime recomendado é: Toradora!\n");
		    		System.out.println("Taiga vem de uma família rica, mas ela resolveu sair de casa e viver por conta própria, devido a questões familiares.");
		    		System.out.println("Ela, por coincidência, está vivendo em um apartamento ao lado da casa de Ryūji.");
		    		System.out.println("Quando Ryūji descobre que Taiga tem uma queda por Yūsaku e Taiga descobre que Ryūji é apaixonado por Minori, Ryūji sugere que eles se ajudem para ambos conquistarem seus objetivos amorosos.");
		    		System.out.println("\nA profissão indicada é: Conselheiro de compromisso de saúde");
		    	    System.out.println("Trabalha remotamente para oferecer coaching individual e conselhos de bem-estar e saúde para usuários de pulseiras inteligentes.");

		      }
		    	if(op2 == 2 && op3 == 3){
		    		System.out.println("De acordo com nossos levantamentos você é uma pessoa..... Persistente");
		    		System.out.println("\nO seu anime recomendado é: Toradora!\n");
		    		System.out.println("Taiga vem de uma família rica, mas ela resolveu sair de casa e viver por conta própria, devido a questões familiares.");
		    		System.out.println("Ela, por coincidência, está vivendo em um apartamento ao lado da casa de Ryūji.");
		    		System.out.println("Quando Ryūji descobre que Taiga tem uma queda por Yūsaku e Taiga descobre que Ryūji é apaixonado por Minori, Ryūji sugere que eles se ajudem para ambos conquistarem seus objetivos amorosos.");
		    		System.out.println("\nA profissão indicada é: Conselheiro de compromisso de saúde");
		    		System.out.println("Trabalha remotamente para oferecer coaching individual e conselhos de bem-estar e saúde para usuários de pulseiras inteligentes.");

		      }
		    	if(op2 == 3 && op3 == 3){
		    		System.out.println("De acordo com nossos levantamentos você é uma pessoa..... Persistente!");
		    		System.out.println("\nO seu anime recomendado é: Toradora!\n");
		    		System.out.println("Taiga vem de uma família rica, mas ela resolveu sair de casa e viver por conta própria, devido a questões familiares.");
		    		System.out.println("Ela, por coincidência, está vivendo em um apartamento ao lado da casa de Ryūji.");
		    		System.out.println("Quando Ryūji descobre que Taiga tem uma queda por Yūsaku e Taiga descobre que Ryūji é apaixonado por Minori, Ryūji sugere que eles se ajudem para ambos conquistarem seus objetivos amorosos.");
		    		System.out.println("\nA profissão indicada é: Conselheiro de compromisso de saúde");
		    	    System.out.println("Trabalha remotamente para oferecer coaching individual e conselhos de bem-estar e saúde para usuários de pulseiras inteligentes.");

		      }
		    }
		    if(op1<=3 && op2<=3 && op3<=3) {
		    if(op1 == 3){//Death note
		    	if(op2 == 1 && op3 == 1){
		    		System.out.println("De acordo com nossos levantamentos você é uma pessoa..... com alto nível de Atençaõ para Detalhes!");
		    		System.out.println("\nO seu anime recomendado é: Death Note!\n");
		    		System.out.println("Light poderia constantemente prever todos os cenários possíveis que poderiam acontecer e planejar uma solução com antecedência, mesmo nas situações mais improvisadas.");
		    		System.out.println("\nA profissão indicada é: Gestor Ambiental");
		            System.out.println("O trabalho deste profissional é preservar e recuperar o meio ambiente, ajudar empresas a usarem de forma consciente os recursos naturais, tratar os resíduos gerados, entre outros.");

		    	}
		    	if(op2 == 2 && op3 == 1){
		    		System.out.println("De acordo com nossos levantamentos você é uma pessoa..... com alto nível de Atençaõ para Detalhes!");
		    		System.out.println("\nO seu anime recomendado é: Death Note!\n");
		    		System.out.println("Light poderia constantemente prever todos os cenários possíveis que poderiam acontecer e planejar uma solução com antecedência, mesmo nas situações mais improvisadas.");
		    		System.out.println("\nA profissão indicada é: Gestor Ambiental");
		            System.out.println("O trabalho deste profissional é preservar e recuperar o meio ambiente, ajudar empresas a usarem de forma consciente os recursos naturais, tratar os resíduos gerados, entre outros.");

		    	}
		    	if(op2 == 3 && op3 == 1){
		    		System.out.println("De acordo com nossos levantamentos você é uma pessoa..... com alto nível de Atençaõ para Detalhes!");
		    		System.out.println("\nO seu anime recomendado é: Death Note!\n");
		    		System.out.println("Light poderia constantemente prever todos os cenários possíveis que poderiam acontecer e planejar uma solução com antecedência, mesmo nas situações mais improvisadas.");
		    		System.out.println("\nA profissão indicada é: Gestor Ambiental");
		            System.out.println("O trabalho deste profissional é preservar e recuperar o meio ambiente, ajudar empresas a usarem de forma consciente os recursos naturais, tratar os resíduos gerados, entre outros.");

		    	}
		    	if(op2 == 1 && op3 == 2){
		    		System.out.println("De acordo com nossos levantamentos você é uma pessoa..... com alto nível de Atençaõ para Detalhes!");
		    		System.out.println("\nO seu anime recomendado é: Death Note!\n");
		    		System.out.println("Light poderia constantemente prever todos os cenários possíveis que poderiam acontecer e planejar uma solução com antecedência, mesmo nas situações mais improvisadas.");
		    		System.out.println("\nA profissão indicada é: Desenvolvedor de Software");
		    	    System.out.println("Responsável por construir o mundo digital. Afinal, quanto mais pessoas e empresas utilizam softwares maior é a demanda por profissionais qualificados.");

		    	}
		    	if(op2 == 2 && op3 == 2){
		    		System.out.println("De acordo com nossos levantamentos você é uma pessoa..... Proativa");
		    		System.out.println("\nO seu anime recomendado é: Death Note!\n");
		    		System.out.println("Light poderia constantemente prever todos os cenários possíveis que poderiam acontecer e planejar uma solução com antecedência, mesmo nas situações mais improvisadas.");
		    		System.out.println("\nA profissão indicada é: Desenvolvedor de Software");
		    	    System.out.println("Responsável por construir o mundo digital. Afinal, quanto mais pessoas e empresas utilizam softwares maior é a demanda por profissionais qualificados.");

		    	}
		    	if(op2 == 3 && op3 == 2){
		    		System.out.println("De acordo com nossos levantamentos você é uma pessoa..... Proativa");
		    		System.out.println("\nO seu anime recomendado é: Death Note!\n");
		    		System.out.println("Light poderia constantemente prever todos os cenários possíveis que poderiam acontecer e planejar uma solução com antecedência, mesmo nas situações mais improvisadas.");
		    		System.out.println("\nA profissão indicada é: Desenvolvedor de Software");
		    	    System.out.println("Responsável por construir o mundo digital. Afinal, quanto mais pessoas e empresas utilizam softwares maior é a demanda por profissionais qualificados.");

		    	}
		    	if(op2 == 1 && op3 == 3){
		    		System.out.println("De acordo com nossos levantamentos você é uma pessoa..... Persistente");
		    		System.out.println("\nO seu anime recomendado é: Death Note!\n");
		    		System.out.println("Light sempre persistia naquilo que acreditava ser o melhor para si, nunca desistindo.");
		    		System.out.println("\nA profissão indicada é: Conselheiro de compromisso de saúde");
		            System.out.println("Trabalha remotamente para oferecer coaching individual e conselhos de bem-estar e saúde para usuários de pulseiras inteligentes.");

		    	}
		    	if(op2 == 2 && op3 == 3){
		    		System.out.println("De acordo com nossos levantamentos você é uma pessoa..... Persistente");
		    		System.out.println("\nO seu anime recomendado é: Death Note!\n");
		    		System.out.println("Light sempre persistia naquilo que acreditava ser o melhor para si, nunca desistindo.");
		    		System.out.println("\nA profissão indicada é: Conselheiro de compromisso de saúde");
		            System.out.println("Trabalha remotamente para oferecer coaching individual e conselhos de bem-estar e saúde para usuários de pulseiras inteligentes.");

		    	}
		    	if(op2 == 3 && op3 == 3){
		    		System.out.println("De acordo com nossos levantamentos você é uma pessoa..... Persistente");
		    		System.out.println("\nO seu anime recomendado é: Death Note!\n");
		    		System.out.println("Light sempre persistia naquilo que acreditava ser o melhor para si, nunca desistindo.");
		    		System.out.println("\nA profissão indicada é: Conselheiro de compromisso de saúde");
		            System.out.println("Trabalha remotamente para oferecer coaching individual e conselhos de bem-estar e saúde para usuários de pulseiras inteligentes.");

		    	}
		    }
		    }
		    else {
		    	System.out.println("Opção Inválida!");
		    }
	}	
}
