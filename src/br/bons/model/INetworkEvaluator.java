package br.bons.model;

public interface INetworkEvaluator<N, I> {
	public I evaluate(N network);
}
