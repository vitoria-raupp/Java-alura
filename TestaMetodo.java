package byteBank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(40);
		
		System.out.println(conta.saldo);
		conta.saca(130);
		
		System.out.println(conta.saldo);
		}
}
