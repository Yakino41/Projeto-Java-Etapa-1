//Nome: Arthur Gabriel Teotonio Stellato RA:2766949
public class VeloVramException extends Exception{
	
	VeloVramException(){
	}
	
	Leitura l1 = Leitura.geraLeit();
	
	public PlacaDeVideo consVeloVInv(PlacaDeVideo v){
		try {
				v.setVeloVram(l1.entFloat("Velocidade Vram: "));
			} 
			
			catch(VeloVramException vve){
				System.out.println("[ERRO] Velocidade Da Vram Deve ser Maior que 0.");
				v = consVeloVInv(v);
			}
			
			catch (NumberFormatException nfe) {
				System.out.println("[ERRO] Por Favor Digite Um Numero Valido Exemplo: 7000");
			}
			
			return v;
	}
}