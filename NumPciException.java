//Nome: Arthur Gabriel Teotonio Stellato RA:2766949
public class NumPciException extends Exception{
	NumPciException(){
	}
	
	Leitura l1 = Leitura.geraLeit();
	
	public PlacaDeVideo consNumPciInv(PlacaDeVideo v){
		
		try {
				v.setNumPci(l1.entFloat("Versão PCI: "));
			}
			
			catch(NumPciException npe){
				System.out.println("[ERRO] Versão do PCI deve ser maior que 0.");
				v = consNumPciInv(v);
			}
			
			catch (NumberFormatException nfe) {
				System.out.println("[ERRO]Por Favor Digite um numero Fatorial Exemplo: 5.0");
			}
			
		return v;
	}
}