package Exercicio.data0808.Entidades;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class Gerente extends Funcionario {
	
	public Gerente() {
		
	}

	public void aumentaSalario(BigDecimal percentual) {
		LocalDate dataAtual = LocalDate.now();
		int bonus = dataAtual.compareTo(getDataAdmisao());
		percentual = percentual.add(new BigDecimal(bonus));
		super.aumentaSalario(percentual);  
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	@Override
	public void getSpliceDataAdmisao() {
		Scanner c = new Scanner(System.in);
		System.out.println("");
		System.out.println("Dia da Admisão: ");
		int dia = c.nextInt();
		System.out.println("Mes da Admisão: ");
		int mes = c.nextInt();
		System.out.println("Ano da Admisão: ");
		int ano = c.nextInt();
		setDataAdmisao(ano,mes,dia);
		
	}
	
	
}
