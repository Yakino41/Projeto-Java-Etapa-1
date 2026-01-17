//Nome: Arthur Gabriel Teotonio Stellato RA:2766949
public class ProcInvException extends Exception {
		public ProcInvException() {
    }
	Leitura l1 = Leitura.geraLeit();
	public Processador consProcInv(Processador p){
		
		try{
		p.setMarca(l1.entDados("Marca: "));
		}
		
		catch (ProcInvException pie) {
			System.out.println("[ERRO] Marca De processador Invalida. Marcas Validas -> [INTEL] OU [AMD].");
			p = consProcInv(p);
		}
		
		catch (PlacaVidInvException pvid){
			System.out.println("[ERRO] Marca Invalida. Marcas Validas -> [AMD][INTEL][NVIDIA][MSI][AFOX][GIGABYTE][ASUS][XFX][GALAX][ROG][ZOTAC][MANCER][MSI]");
		}
		
		catch (PlacaMaeInvException pmie){
			System.out.println("[ERRO] Marca Invalida. Marcas Validas -> [INTEL][GIGABYTE][ASROCK][BIOSTAR][EVGA][NZXT][COLORFUL][AFOX][FOXCOON]");
		}
		
		return p;
	}
}