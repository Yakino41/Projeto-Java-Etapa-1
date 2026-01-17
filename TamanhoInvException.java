//Nome: Arthur Gabriel Teotonio Stellato RA:2766949
public class TamanhoInvException extends Exception {
	
		public TamanhoInvException() {
    }
	
	Leitura l1 = Leitura.geraLeit();
	
	public PlacaMae consTamanhoInv(PlacaMae m){
		
		try{
			m.setTamanho(l1.entDados("Tamanho Da Placa Mãe EX: EATX][ATX][MICRO-ATX][MINI-ATX]"));
		}
		
		catch (TamanhoInvException tie){
			System.out.println("Tamanho Invalido Tente Novamente: [EATX][ATX][MICRO-ATX][MINI-ATX]");
			m = consTamanhoInv(m);
		}
		
		return m;
	}
}