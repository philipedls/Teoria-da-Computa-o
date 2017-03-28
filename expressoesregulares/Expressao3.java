package teoria.expressoesregulares;

public class Expressao3 implements ExpressoesRegulares{

	private final String regex = "[(A-Z)][(A-Z)][(A-Z)]-[(0-9)][(0-9)][(0-9)][(0-9)]";
	private String entrada;
	
	public Expressao3(String entrada){
		this.entrada= entrada;
	}
	
	public String getEntrada(){
		return entrada;
	}

	@Override
	public boolean validarExpressao() {
		return getEntrada().matches(regex);
	}

}
