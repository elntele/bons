/*
 * *****************************************************************************
 * Copyright (c) 2005
 * Propriedade do Laborat�rio de P&D da Unicap-Itautec
 * Todos os direitos reservados, com base nas leis brasileiras de 
 * copyright
 * Este software � confidencial e de propriedade intelectual do
 * Laborat�rio de P&D da Unicap-Itautec
 * ****************************************************************************
 * Projeto: SIAC - Sistema Itautec de Automa��o Comercial
 * Arquivo: FWMCombination.java
 * ****************************************************************************
 * Hist�rico de revis�es
 * CR		Nome				Data		Descri��o
 * ****************************************************************************
 * 064813-P	Danilo Ara�jo		29/04/2011		Vers�o inicial
 * ****************************************************************************
 */
package br.bons.core;


/**
 * Estrutura para encapsular 3 comprimentos de onda para avalia��o de FWM.
 * 
 * @author Danilo Ara�jo
 * @since 29/04/2011
 */
public class FWMCombination {
	protected int i;

	protected int j;

	protected int k;

	public FWMCombination() {
	}

	public FWMCombination(int i, int j, int k) {
		super();
		this.i = i;
		this.j = j;
		this.k = k;
	}

	/**
	 * M�todo acessor para obter o valor do atributo i.
	 *
	 * @return Retorna o atributo i.
	 */
	public int getI() {
		return i;
	}

	/**
	 * M�todo acessor para modificar o valor do atributo i.
	 *
	 * @param i O valor de i para setar.
	 */
	public void setI(int i) {
		this.i = i;
	}

	/**
	 * M�todo acessor para obter o valor do atributo j.
	 *
	 * @return Retorna o atributo j.
	 */
	public int getJ() {
		return j;
	}

	/**
	 * M�todo acessor para modificar o valor do atributo j.
	 *
	 * @param j O valor de j para setar.
	 */
	public void setJ(int j) {
		this.j = j;
	}

	/**
	 * M�todo acessor para obter o valor do atributo k.
	 *
	 * @return Retorna o atributo k.
	 */
	public int getK() {
		return k;
	}

	/**
	 * M�todo acessor para modificar o valor do atributo k.
	 *
	 * @param k O valor de k para setar.
	 */
	public void setK(int k) {
		this.k = k;
	}

}
