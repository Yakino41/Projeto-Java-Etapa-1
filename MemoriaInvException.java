//Nome: Arthur Gabriel Teotonio Stellato RA:2766949
public class MemoriaInvException extends Exception{
	MemoriaInvException(){
	}
	
	Leitura l1 = Leitura.geraLeit();
	
	public PlacaDeVideo consMemInv(PlacaDeVideo v){
		
		try {
				v.setMemoria(l1.entInt("GBs Memoria: "));
			} 
			catch (MemoriaInvException mie){
				System.out.println("Quantidade de memoria deve ser maior que 0");
				v = consMemInv(v);
			}
			
			catch (NumberFormatException nfe) {
				System.out.println("[ERRO] Por favor digite um numero inteiro.");
			}
			
		return v;
	}
}