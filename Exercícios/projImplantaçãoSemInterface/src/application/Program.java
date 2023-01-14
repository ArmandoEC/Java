package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Cliente;
import model.entities.Implantador;
import model.entities.Projeto;
import model.services.CalcularComissao;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com os dados do projeto");
		System.out.print("Nome do cliente: ");
		String nomeCliente = sc.nextLine();
		System.out.print("Nome do implantador: ");
		String nomeImplantador = sc.nextLine();
		System.out.print("Percentual de comissão do implantador: ");
		Double percComissao = sc.nextDouble();
		System.out.print("Horas adicionais: ");
		Double horasAdicionais = sc.nextDouble();
		System.out.print("Valor por hora: ");
		Double valorHora = sc.nextDouble();
		System.out.print("Valor inicial do projeto: ");
		Double valorProjeto = sc.nextDouble();
		
		Projeto projeto = new Projeto(valorProjeto, horasAdicionais, valorHora, new Cliente(nomeCliente), new Implantador(nomeImplantador, percComissao));
		CalcularComissao calcularComissao = new CalcularComissao();
		
		System.out.println("Projeto: ");
		System.out.println("Cliente: "+projeto.getCliente().getNome());
		System.out.println("Implantador: "+projeto.getImplantador().getNome());
		System.out.println("Valor do Projeto: "+projeto.getValorProjeto());
		System.out.println("Horas Adicionais: "+projeto.getHorasAdicionais());
		System.out.println("Valor final da comissão: "+calcularComissao.processarComissao(projeto));
		
		
		
		sc.close();

	}

}
