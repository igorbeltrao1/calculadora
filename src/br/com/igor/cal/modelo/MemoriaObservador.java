package br.com.igor.cal.modelo;

@FunctionalInterface
public interface MemoriaObservador  {
	
	public void valorAlterado (String novoValor);

}
