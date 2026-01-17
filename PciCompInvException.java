//Nome: Arthur Gabriel Teotonio Stellato RA:2766949
public class PciCompInvException extends Exception{

	PciCompInvException(){
		
	}
	
	Leitura l1 = Leitura.geraLeit();
	
	public PlacaMae consPciCompInv(PlacaMae m){
	try{
		m.setPciCompativel(l1.entFloat("Qual A Versão do slot pci: "));
		}
			
		catch(PciCompInvException cpe){
			System.out.println("[ERRO] Versão do PCI Compativel deve [3.0] [4.0] [5.0]");
			m = consPciCompInv(m);
		}
			
		catch (NumberFormatException nfe) {
			System.out.println("[ERRO]Por Favor Digite um numero Fatorial Exemplo: 5.0");
		}
		
	return m;
	}
}