//Nome: Arthur Gabriel Teotonio Stellato RA:2766949
public class PlacaVidInvException extends Exception {
    public PlacaVidInvException() {
    }
	
	Leitura l1 = Leitura.geraLeit();
	
	public PlacaDeVideo consPlacaVidInv(PlacaDeVideo v){
		
		try{
		v.setMarca(l1.entDados("Marca: "));
		}
		
		catch (PlacaVidInvException pvid){
			System.out.println("[ERRO] Marca Invalida. Marcas Validas -> [AMD][INTEL][NVIDIA][MSI][AFOX][GIGABYTE][ASUS][XFX][GALAX][ROG][ZOTAC][MANCER]");
			v = consPlacaVidInv(v);
		}
		
		catch (ProcInvException pie) {
			System.out.println("[ERRO] Marca dE processador Invalida. Marcas Validas -> [INTEL] OU [AMD].");
		}
		
		catch (PlacaMaeInvException pmie){
			System.out.println("[ERRO] Marca Invalida. Marcas Validas -> [INTEL][GIGABYTE][ASROCK][BIOSTAR][EVGA][NZXT][COLORFUL][AFOX][FOXCOON]");
		}
		
		return v;
	}
}