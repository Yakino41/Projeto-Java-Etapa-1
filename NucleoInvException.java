//Nome: Arthur Gabriel Teotonio Stellato RA:2766949
public class NucleoInvException extends Exception{
	
	NucleoInvException(){
	}
	
	Leitura l1 = Leitura.geraLeit();
	
	public Processador consNuInv(Processador p){
		
	try {
		p.setNucleo(l1.entInt("Núcleos: "));
		} 
		
		catch(NucleoInvException nie){
			System.out.println("Por Favor Digite um numero positivo.");
			p = consNuInv(p);
		}
		
		catch (NumberFormatException nfe) {
			System.out.println("[ERRO]Por Favor Digite Numeros Inteiros.\n");
		}
	return p;
	}

}