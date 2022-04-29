package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//informações do funcionario
		
		//tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		//tipos numéricos reais
		float salario = 11_455.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipo booleano
		boolean estaDeFerias = false;// ou true - em Java sempre e false ou true
		
		//tipo caractere
		char status = 'A'; //ativo
		
		//char status = 'A'
		//char status = '1'
		// char status = '!'
		//char status = 'AT' não pode ter duas letras e tipo char so aceita uma unica letra 
		//char status = '/u0010' pode ser usado pois representa um numero na tabela unicode
		
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//numeros de viagem
		System.out.println(numerosDeVoos / 2);
		
		//pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + "ganha ->" + salario);
		
		System.out.println("ferias?" + estaDeFerias );
		
		System.out.println("status:" + status);
		
		
		//Obs:advertência nas linhas 8,9,10,11,14,15,18,21 e devido ter criado a variavel mas não a ter usado,depois de utilizar a advertência sumiu 
		
	}

}
