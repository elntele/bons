package br.bons.runner;

import br.bons.core.OpticalNetworkProblem;

public class Main {
	public static void main(String[] args) {
		int load = 80;
		//String gml = "benchmarks/0,004-3.200,3_generated.gml";
		
		String gml = "C:/Users/jorge/workspace/bons/src/br/bons/benchmarks/nsfnet.gml";
		if (args.length == 2) {
			load = Integer.parseInt(args[0]);
			gml = args[1];
		}
		OpticalNetworkProblem problem = new OpticalNetworkProblem(load, gml);
		Integer[] vars = problem.getDefaultSolution();
		Double[] objectives = problem.evaluate(vars);
		System.out.println("Sumário da rede \"" + gml + "\" para a carga de " + load + " erlangs:");
		System.out.println();
		System.out.printf("Probabilidade de bloqueio = %.6f\n", objectives[0]);
		System.out.printf("Custo de implantação = %.2f u.m.\n", objectives[1]);
		System.out.printf("Gasto energético = %.2f Watts\n", objectives[2]);
		System.out.printf("Conectividade algébrica = %.2f\n", objectives[3]);
		//System.out.printf("Conectividade natural = %.2f\n", objectives[4]);
	}
}
