package Exercicio;

import java.util.Locale;
import java.util.Scanner;

import Exercicio.data0808.Funcionario;
import Exercicio.data0808.Gerente;

public class AppExercicio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Scanner gsc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		Gerente gerente = new Gerente();

		int inicio = 0;

		System.out.println("Bem vindo ao sistema de RH da Tabajara Empreendimentos:");
		System.out.println("=======================================================");

		System.out.println("Deseja cadastrar um Funcionario? 1-sim/0-não");
		inicio = sc.nextInt();

		while (inicio != 0) {

			sc.nextLine();
			
			System.out.println("Qual a função do Funcionário: 1-Funcionario / 2-Gerente: ");
			int funcao = sc.nextInt();
			
			switch (funcao) {
			
			case 1:
				sc.nextLine();
				
//				Funcionario
				System.out.println("Nome Funcionário: ");
				funcionario.setNome(sc.nextLine());

				System.out.println("Data de Admisão? ");
				System.out.println("Dia: ");
				int dia = sc.nextInt();
				System.out.println("Mes: ");
				int mes = sc.nextInt();
				System.out.println("Ano: ");
				int ano = sc.nextInt();
				funcionario.setDataAdmisao(ano, mes, dia);

				System.out.println("Salário Inicial? R$");
				funcionario.setSalario(sc.nextBigDecimal());

				System.out.println("Bonus de salário? ");
				funcionario.setBonus(sc.nextBigDecimal());
				
				funcionario.aumentaSalario(funcionario.getBonus());
				System.out.println(funcionario.toString());
				
				break;

			case 2:
//				Gerente
				sc.nextLine();
				
				System.out.println("Nome Gerente: ");
				gerente.setNome(gsc.nextLine());
				System.out.println("Data da Admisão? ");
				System.out.println("Dia: ");
				dia = gsc.nextInt();
				System.out.println("Mes: ");
				mes = gsc.nextInt();
				System.out.println("Ano: ");
				ano = gsc.nextInt();

				gerente.setDataAdmisao(ano, mes, dia);

				System.out.println("Salário Inicial? R$");
				gerente.setSalario(gsc.nextBigDecimal());

				System.out.println("Bonus de salário? ");
				gerente.setBonus(gsc.nextBigDecimal());
				
				gerente.aumentaSalario(gerente.getBonus());
				System.out.println(gerente.toString());
				
				break;
				
			default:
				System.out.println("Informe uma cargo valido.");
				break;
			}
			
			System.out.println("=======================================================");
			System.out.println("Deseja cadastrar um Funcionario? 1-sim/0-não");
			inicio = sc.nextInt();

		}

		System.out.println("Obrigado por usar o sistema de RH da Tabajara Empreendimentos");
		
		sc.close();
		gsc.close();
		
	}

}