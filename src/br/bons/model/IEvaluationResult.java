package br.bons.model;

public interface IEvaluationResult<T, V> {
	public T getType();
	
	public V getValue(); 
}
