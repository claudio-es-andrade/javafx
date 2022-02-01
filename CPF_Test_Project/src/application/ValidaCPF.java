package application;

public class ValidaCPF {
	private int[] digitos;

	public ValidaCPF(int[] digitos) {
		super();
		this.digitos = digitos;
		
	}
	
	
		public int[] getDigitos() {
			return digitos;
		}

		public void setDigitos(int[] digitos) {
			this.digitos = digitos;
		}
	// Verifica igualdade dos números
	public boolean ConfirmaIgualdadeDigitos () {
		
		boolean confirma = false;
		
		
		if (digitos[0] == digitos[1] && digitos[0] == digitos[2] &&
				digitos[0] == digitos[3] && digitos[0] == digitos[4] &&
				digitos[0] == digitos[5] && digitos[0] == digitos[6] &&
				digitos[0] == digitos[7] && digitos[0] == digitos[8] &&
				digitos[0] == digitos[9] && digitos[0] == digitos[10]) 	{
				
				confirma = true;
				//System.out.println("Valores iguais dos digitos. CPF Inválido.");
		}
		else {
			confirma = false;
		}
	
		return confirma;
	}
	//Verifica o Estado de Origem
	public String verificaEstadoOrigem() {
		int[] copiaEstadoOrigem = this.digitos;
		
		String oriundo = new String();
		String estado = new String();
		String origem = new String();
		
		oriundo = " \n O CPF é oriundo do(s) Estado(s): \n ";
//		for (int pos = 0; pos < 11; pos++) {
//			System.out.println("CPF:" + digitos[pos] );
//			System.out.println("Digitos Cópia: "+ copiaEstadoOrigem[pos]);
//		}
		//System.out.println("digitos[8]: " + digitos[8]);
		//System.out.println("Digitos Cópia[8]: "+ copiaEstadoOrigem[8]);
		if(copiaEstadoOrigem[8] == 1) {
			
			estado = "DF-GO-MS-MT-TO";
			origem = oriundo + estado;
			
			
		}
		else if (copiaEstadoOrigem[8] == 2){
			
			estado = "AC-AM-AP-PA-RO-RR";
			origem = oriundo + estado;
			
			
		}
		else if (copiaEstadoOrigem[8] == 3){
			
			estado = "CE-MA-PI";
			origem = oriundo + estado;
			
			
		}
		else if (copiaEstadoOrigem[8] == 4){
			
			estado = "AL-PB-PE-RN";
			origem = oriundo + estado;
			
			
		}
		else if (copiaEstadoOrigem[8] == 5){
			
			estado = "BA-SE";
			origem = oriundo + estado;
			
			
		}
		else if (copiaEstadoOrigem[8] == 6){
			
			estado = "MG";
			origem = oriundo + estado;
			
			
		}
		else if (copiaEstadoOrigem[8] == 7){
			
			estado = "ES-RJ";
			origem = oriundo + estado;
			
			
		}
        else if (copiaEstadoOrigem[8] == 8){
			
			estado = "SP";
			origem = oriundo + estado;
			
			
		}
        else if (copiaEstadoOrigem[8] == 9){
			
			estado = "PR-SC";
			origem = oriundo + estado;
			
			
		}
        else if (copiaEstadoOrigem[8] == 0){
			
			estado = "RS";
			origem = oriundo + estado;
			
			
		}
		return origem;
	}
	
	
	// Por último por causa dos cálculos 	
	public String calculaComparaDigitosVerificadores() {
		int[] copia_01 = this.digitos;
		int[] copia_02 = this.digitos;
		String ConfirmaDG_01    = new String();
		String ConfirmaDG_02    = new String();
		String ConfirmacaoFinal = new String();
		int soma_01  = 0;
		int multiplicador_01 = 1;
		int resto_01 = 1;
		int primeiroDigitoVerificador;
		int soma_02 = 0;
		int multiplicador_02 = 1;
		int resto_02 = 1;
		int segundoDigitoVerificador;
		
		// Verificandoo se os valores estão corretos
//		for (int pos = 0; pos < 11; pos++) {
//			System.out.println("CPF no Cálculo:" + digitos[pos] );
//			System.out.println("Digitos Cópia Cálculo_01: "+ copia_01[pos]);
//			System.out.println("Digitos Cópia Cálculo_02: "+ copia_02[pos]);
//		}
		
		// Calculando o Primeiro Digito Verificador
		for (int pos = 0; pos < digitos.length ; pos++) {
			if (pos != 9 && pos != 10) {
				copia_01[pos] *= multiplicador_01;
				multiplicador_01 += 1;
				soma_01 += copia_01[pos];
			}
			resto_01 = soma_01 % 11;
		}
		primeiroDigitoVerificador = resto_01;
		if(primeiroDigitoVerificador == digitos[9]) {
			ConfirmaDG_01 = "\n Valor do Primeiro Digito Verificador Confirmado";
			//System.out.println(ConfirmaDG_01);
		}else {
			ConfirmaDG_01 = "\n Valor do Primeiro Digito Verificador NÃO Confirmado";
			//System.out.println(ConfirmaDG_01);
		}

		// Calculando o Segundo Digito Verificador
		for (int pos = 0; pos < digitos.length ; pos++) {
			if (pos != 0 && pos != 10) {
				copia_02[pos] *= multiplicador_02;
				multiplicador_02 += 1;
				soma_02 += copia_02[pos];
			}
			resto_02 = soma_02 % 11;
		}
		segundoDigitoVerificador = resto_02;
		if(segundoDigitoVerificador == digitos[10]) {
			ConfirmaDG_02 = "\n Valor do Segundo Digito Verificador Confirmado";
			//System.out.println(ConfirmaDG_02);
		}else {
			ConfirmaDG_02 = "\n Valor do Segundo Digito Verificador NÃO Confirmado";
			//System.out.println(ConfirmaDG_02);
		}
		
		ConfirmacaoFinal = ConfirmaDG_01 + ConfirmaDG_02;
		return ConfirmacaoFinal; 
	}
	
}
