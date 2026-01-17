//Nome: Arthur Gabriel Teotonio Stellato RA:2766949
public class ThreadsInvException extends Exception{
	
	ThreadsInvException(String Mensagem){
		super(Mensagem);
	}
	
	Leitura l1 = Leitura.geraLeit();
	
	public Processador consThInv(Processador p){
		
	try {
		p.setThreads(l1.entInt("Threads: "));
		} 
		
		catch(ThreadsInvException tie){
			System.out.println(tie.getMessage());
			p = consThInv(p);
		}
		
		catch (NumberFormatException nfe) {
			System.out.println("[ERRO]Por Favor Digite Numeros Inteiros.\n");
		}
		
	return p;
	
	}

}