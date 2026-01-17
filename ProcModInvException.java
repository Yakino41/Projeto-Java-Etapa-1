//Nome: Arthur Gabriel Teotonio Stellato RA:2766949
public class ProcModInvException extends Exception {
	
		public ProcModInvException(String Mensagem) {
			super(Mensagem);
    }
	
	Leitura l1 = Leitura.geraLeit();
	
	public Processador consProcModInv(Processador p){
		
		try{
			p.setModelo(l1.entDados("Modelo: "));
		}
		
		catch(ProcModInvException pmie){
			System.out.println(pmie.getMessage());
			p = consProcModInv(p);
		}
		
		return p;
	}
}