package teoria.expressoesregulares;

public class Expressao2 implements ExpressoesRegulares{
	
	private final String regex = "[(0-9)][(0-9)][(0-9)][(0-9)]-[(0-9)][(0-9)][(0-9)][(0-9)]";
	private String entrada;
	
	public Expressao2(String entrada){
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
