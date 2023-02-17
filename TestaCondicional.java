package sintaxe.variaveis.e.fluxo;

public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais (if) ");
		
		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2 ;
		
		/*if (idade >= 18) {
			System.out.println("Voce tem mais de 18 anos");
		} else {
			if(quantidadePessoas >= 2) {
				System.out.println("Voce nao tem 18 ano, mas esta acompanhado");
			}else {
				System.out.println("voce e menor de idade");
			}
		}
	}*/
	
	
	if (idade >= 18 || quantidadePessoas >= 2 ) {
		System.out.println("Seja bem vindo");
	} else {
			System.out.println("infelizmente vc nao pode entrar");
	}
	
	System.out.println(acompanhado);
	if (idade >= 18 && acompanhado ) {
		System.out.println("Seja bem vindo");
	} else {
			System.out.println("infelizmente vc nao pode entrar");
	}
}
}