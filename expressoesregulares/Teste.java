package teoria.expressoesregulares;

public class Teste {

	public static void main(String[] args) {
		
		String cpf = "113.390.664-66";
		String cell = "3295-3898";
		
		Expressao1 exp1 = new Expressao1(cpf);
		Expressao2 exp2 = new Expressao2(cell);
		
		if(exp1.validarExpressao() == true){
			System.out.println("Válido!");
		}else {
			System.out.println("Não valido!");
		}

	}

}
