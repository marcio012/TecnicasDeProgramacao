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
		
		Funcionario func = new Funcionario();
		Gerente gerente = new Gerente();
		
		int inicio = 0;

		menu();
		inicio = sc.nextInt();

		System.out.println();

		while (inicio != 0) {
			
			
			sc.nextLine();

//			System.out.println("Qual a função do Funcionário: 1-Funcionario / 2-Gerente: ");
//			int funcao = sc.nextInt();

			switch (inicio) {

			case 1:
				

//				Funcionario
				
				System.out.println("Nome Funcionário: ");
				func.setNome(sc.nextLine());

				System.out.println("Data de Admisão? ");
				System.out.println("Dia: ");
				int dia = sc.nextInt();
				System.out.println("Mes: ");
				int mes = sc.nextInt();
				System.out.println("Ano: ");
				int ano = sc.nextInt();
				func.setDataAdmisao(ano, mes, dia);

				System.out.println("Salário Inicial? R$");
				func.setSalario(sc.nextBigDecimal());

				System.out.println("Bonus de salário? ");
				func.setBonus(sc.nextBigDecimal());

				func.aumentaSalario(func.getBonus());
				func.addFuncionario(func);
				System.out.println(func.toString());

				break;

			case 2:
//				Gerente
				

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

				
			case 3: 
				
				System.out.println("Relatorio: ");
				func.listarFuncionarios();
				
				break;
				
			default:
				System.out.println("Informe uma cargo valido.");
				break;
			}

			System.out.println("=======================================================");
			menu();
			inicio = sc.nextInt();
			sc.nextLine();

		}

		System.out.println("Obrigado por usar o sistema de RH da Tabajara Empreendimentos");

		sc.close();
		gsc.close();

	}
	
	public static void menu() {
		System.out.println("Bem vindo ao sistema de RH da Tabajara Empreendimentos:");
		System.out.println("=======================================================");
		System.out.println("Digete a opção desejavel: ");
		System.out.println("1 - Funcionario: ");
		System.out.println("2 - Gerente: ");
		System.out.println("3 - Relatório: ");
		System.out.println("0 - Sair: ");
	}
}
