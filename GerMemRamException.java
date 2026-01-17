//Nome: Arthur Gabriel Teotonio Stellato RA:2766949
public class GerMemRamException extends Exception{
	
	GerMemRamException(){
	}
	
	Leitura l1 = Leitura.geraLeit();
	
	public PlacaMae consGerMemRamInv(PlacaMae m){
	try{
		m.setGerMemRam(l1.entDados("Geração Do Canal de Ram: "));
		}
			
		catch(GerMemRamException gmre){
			System.out.println("[ERRO] A Geração da Memoria Ram Compativeis São [DDR3][DDR4][DDR5] Tente Novamente.");
			m = consGerMemRamInv(m);
		}
	
		return m;
	}
}