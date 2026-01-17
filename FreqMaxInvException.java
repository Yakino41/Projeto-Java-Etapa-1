//Nome: Arthur Gabriel Teotonio Stellato RA:2766949
public class FreqMaxInvException extends Exception {
	
    public FreqMaxInvException(String Mensagem) {
		super(Mensagem);
    }
	
	Leitura l1 = Leitura.geraLeit();
	
	public Processador consFreqMInv(Processador p){
		
	try {
		p.setFreqMax(l1.entFloat("Frequência Max (GHz)[Exemplo (6.1)]: "));
		} 
		
		catch(FreqMaxInvException fmie){
			System.out.println(fmie.getMessage());
			p = consFreqMInv(p);
		}
		
		catch (NumberFormatException nfe){
			System.out.println("[ERRO] Por Favor digite um numero Decimal.");
		}
		
		return p;
	}
}	