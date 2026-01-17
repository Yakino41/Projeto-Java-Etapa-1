//Nome: Arthur Gabriel Teotonio Stellato RA:2766949
public class SocketCompInvException extends Exception {
	
	public SocketCompInvException(String Mensagem){
		super(Mensagem);
	}
	
	Leitura l1 = Leitura.geraLeit();
	
	public Processador consSocketCompInv(Processador p){
		
		try{
            p.setSocketCompativel(l1.entDados("Socket: "));
        }
		
		catch(SocketCompInvException scie) {
			System.out.println(scie.getMessage());
			p = consSocketCompInv(p);
        }
		
		return p;
	}
}