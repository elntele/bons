package br.bons.core;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Classe utilit�ria para otimizar as combina��es que possibilitam o
 * aparecimento de FWM.
 * 
 * @author Danilo Ara�jo
 * @since 29/04/2011
 */
public class FWMUtil {
	public static FWMUtil instance;

	private int wMax;

	private static HashMap<Integer, Set<FWMCombination>> combinations = new HashMap<Integer, Set<FWMCombination>>();

	private FWMUtil() {
		wMax = 40;
	}

	public static FWMUtil getInstance() {
		return getInstance(40);
	}

	public static FWMUtil getInstance(int wMax) {
		if (instance == null){
			instance = new FWMUtil();
		}
		if (combinations.isEmpty() || wMax != instance.wMax) {
			combinations.clear();
			Set<FWMCombination> listaAux = new HashSet<FWMCombination>();
			for (int usarLambda_par = 0; usarLambda_par < wMax; usarLambda_par++) {
				listaAux = new HashSet<FWMCombination>();
				for (int i = 0; i < wMax; i++) {
					for (int j = 0; j < wMax; j++) {
						for (int k = 0; k < wMax; k++) {
							if ((i + j - k == usarLambda_par) && (i != k) && (j != k)) {
								listaAux.add(new FWMCombination(i, j, k));
							}
						}
					}
				}
				combinations.put(usarLambda_par, listaAux);
			}
		}
		return instance;
	}

	/**
	 * Retorna o mapa de combina��es de condi��o de FWM
	 * 
	 * @return HashMap com as combina��es
	 */
	public HashMap<Integer, Set<FWMCombination>> getCombinations() {
		return combinations;
	}

	/**
	 * Retorna o mapa de combina��es de condi��o de FWM
	 * 
	 * @return HashMap com as combina��es
	 */
	public Set<FWMCombination> getCombinations(int lambda) {
		return combinations.get(Integer.valueOf(lambda));
	}

	/**
	 * M�todo acessor para obter o valor do atributo wMax.
	 * 
	 * @return Retorna o atributo wMax.
	 */
	public int getwMax() {
		return wMax;
	}
}
