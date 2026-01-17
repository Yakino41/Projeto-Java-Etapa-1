//Nome: Arthur Gabriel Teotonio Stellato RA:2766949
public class TipoMenInvException extends Exception {
	
    public TipoMenInvException() {
    }
	
	Leitura l1 = Leitura.geraLeit();
	
	public PlacaDeVideo consTipoMenInv(PlacaDeVideo v){
		
		try{
		v.setTipoMemoria(l1.entDados("Tipo Da Memoria: "));
		}
		
		catch (TipoMenInvException tmie){
			System.out.println("[ERRO] Memoria errada. Tipos de Memoria -> [GDDR4][GDDR5][GDDR5X][GDDR6][GDDR6X][GDDR7]");
			v = consTipoMenInv(v);
		}
		
		return v;
	}
	
}