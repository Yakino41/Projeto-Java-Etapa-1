//Nome: Arthur Gabriel Teotonio Stellato RA:2766949
public class PlacaMaeInvException extends Exception {
    public PlacaMaeInvException() {
    }
	
	Leitura l1 = Leitura.geraLeit();
	
	public PlacaMae consPlacaMaeInv(PlacaMae m){
		
		try{
		m.setMarca(l1.entDados("Marca: "));
		}
		
		catch (ProcInvException pie) {
			System.out.println("[ERRO] Marca dE processador Invalida. Marcas Validas -> [INTEL] OU [AMD].");
		}
		
		catch (PlacaVidInvException pvid){
			System.out.println("[ERRO] Marca Invalida. Marcas Validas -> [AMD][INTEL][NVIDIA][MSI][AFOX][GIGABYTE][ASUS][XFX][GALAX][ROG][ZOTAC][MANCER]");
		}
		
		catch (PlacaMaeInvException pmie){
			System.out.println("[ERRO] Marca Invalida. Marcas Validas -> [INTEL][GIGABYTE][ASROCK][BIOSTAR][EVGA][NZXT][COLORFUL][AFOX][FOXCOON][MSI]");
			m = consPlacaMaeInv(m);
		}
		
		return m;
	}
}