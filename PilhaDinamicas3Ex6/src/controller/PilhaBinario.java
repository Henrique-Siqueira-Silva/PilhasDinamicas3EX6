package controller;

import br.edu.fateczl.pilhasINT.PilhasINT;

public class PilhaBinario {

	public PilhaBinario() {
		super();
		
	}

	public void EX01 (int[] vet) {
 		PilhasINT p = new PilhasINT();
 		int tamanho = vet.length;
 		for ( int i = 0; i < tamanho; i ++) {
 			if ( vet[i] >= 0) {
 				p.Push(vet[i]);
 			}else {
 				int dado1 = p.Pop();
 				int dado2 = p.Pop();
 				p.Push(vet[i]);
 				p.Push(dado2 + dado1);
 			}
 		}
 		int size = p.Size();
 		System.out.println("Tamanho ="+size);
 		
 		while (!p.Empy()) {
 			System.out.println(p.top());
 			p.Pop();
 		}
 		
 		
		
	}
}
