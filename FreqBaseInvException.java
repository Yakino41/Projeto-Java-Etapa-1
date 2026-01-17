//Nome: Arthur Gabriel Teotonio Stellato RA:2766949
public class FreqBaseInvException extends Exception {
	
    public FreqBaseInvException() {
    }
	
	Leitura l1 = Leitura.geraLeit();
	
	public Processador consFreqBInv(Processador p){
		
	try {
		p.setFreqBase(l1.entFloat("Frequência Base (GHz)[Exemplo (5.1)]: "));
		} 
		
		catch(FreqBaseInvException fbie){
			System.out.println("[ERRO] Por Favor Digite Numeros Como (5.1).\n");
			p = consFreqBInv(p);
		}
		
		catch (NumberFormatException nfe){
			System.out.println("[ERRO] Por Favor digite um numero Decimal");
		}
		
		return p;
	}
}	