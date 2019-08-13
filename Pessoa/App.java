package pessoa;

public class App {
	public static void main(String[] args) {
		
	Pessoa Guilherme = new Pessoa ("Guilherme");
	Fisica CPF = new Fisica ("07659626914");
	Juridica CNPJ = new Juridica ("16724083000100");
	
	System.out.println(Guilherme.getNome());
	System.out.println(CPF.getCpf());
	System.out.println(CNPJ.getCnpj());

	}
}
