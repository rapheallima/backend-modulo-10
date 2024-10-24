package Tarefa;

import java.util.Scanner;

public class Média {
	
	private double matematica;
	
	private double portugues;
	
	private double geografia;
	
	private double ciencias;
	
	
	public Média(double matematica, double portugues, double geografia, double ciencias) {
		super();
		this.matematica = matematica;
		this.portugues = portugues;
		this.geografia = geografia;
		this.ciencias = ciencias;
	}
	

	public double getMatematica() {
		return matematica;
	}



	public void setMatematica(double matematica) {
		this.matematica = matematica;
	}



	public double getPortugues() {
		return portugues;
	}



	public void setPortugues(double portugues) {
		this.portugues = portugues;
	}



	public double getGeografia() {
		return geografia;
	}



	public void setGeografia(double geografia) {
		this.geografia = geografia;
	}



	public double getCiencias() {
		return ciencias;
	}



	public void setCiencias(double ciencias) {
		this.ciencias = ciencias;
	}



	public double calculaMedia() {
		return (matematica + portugues + geografia + ciencias) / 4;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double matematica = -1;
		double portugues = -1;
		double geografia = -1;
		double ciencias = -1;
		
		while (matematica < 0 || matematica > 10) {			
			System.out.println("Digite a nota do aluno em Matemática");
			 matematica = s.nextDouble();
		}
		
		while (portugues < 0 || portugues > 10) {	
		System.out.println("Digite a nota do aluno em Português");
		portugues = s.nextDouble();
		}
		
		while (geografia < 0 || geografia > 10) {	
		System.out.println("Digite a nota do aluno em Geografia");
		 geografia = s.nextDouble();
		}
		
		 while (ciencias < 0 || ciencias > 10) {	
		System.out.println("Digite a nota do aluno em Ciências");
		 ciencias = s.nextDouble();
		 }
		 
		  Média media = new Média(matematica, portugues, geografia, ciencias);
		  
		  System.out.println("Suas notas: ");
		  System.out.println();
		  System.out.println("Matemática: " + matematica);
		  System.out.println("Português: " + portugues);
		  System.out.println("Geografia: " + geografia);
		  System.out.println("Ciências: " + ciencias);
		  System.out.println();
		  System.out.println("Sua média é: " + media.calculaMedia());
		  System.out.println();
		  
		  if (media.calculaMedia() >= 7 && media.calculaMedia() <= 10) {
			  System.out.println("Parabéns! você foi aprovado");
		  } else if (media.calculaMedia() >= 5) {
			  System.out.println("Você esta de recuperação");
		  } else {
			  System.out.println("Você foi reprovado!");
		  }

	}

}
