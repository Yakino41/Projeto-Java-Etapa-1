//Nome: Arthur Gabriel Teotonio Stellato RA:2766949
public class PrecoInvException extends Exception {
    public PrecoInvException() {
    }
	
	Leitura l1 = Leitura.geraLeit();
	
	public Processador consPrecoInv(Processador p){
		
		try{
        p.setPreco(Float.parseFloat(l1.entDados("Preço: ")));
		}
		
		catch (PrecoInvException pie){
			System.out.println("[ERRO] Preço não pode ser igual a 0 ou negativo.");
			p = consPrecoInv(p);
		}
		
		catch (NumberFormatException nfe){
			System.out.println("[ERRO] Por Favor Insira um digito Exemplo: 1900");
		}
		
		return p;
	}
	
	public PlacaDeVideo consPrecoInv(PlacaDeVideo v){
		
		try{
            v.setPreco(Float.parseFloat(l1.entDados("Preço: ")));
		}
		
		catch (PrecoInvException pie){
			System.out.println("[ERRO] Preço não pode ser igual a 0 ou negativo.");
			v = consPrecoInv(v);
		}
		
		catch (NumberFormatException nfe){
			System.out.println("[ERRO] Por Favor Insira um digito Exemplo: 1900");
		}
		
		return v;
	}
	
	public PlacaMae consPrecoInv(PlacaMae m){
		
		try{
            m.setPreco(Float.parseFloat(l1.entDados("Preço: ")));
		}
		
		catch (PrecoInvException pie){
			System.out.println("[ERRO] Preço não pode ser igual a 0 ou negativo.");
			m = consPrecoInv(m);
		}
		
		catch (NumberFormatException nfe){
			System.out.println("[ERRO] Por Favor Insira um digito Exemplo: 1900");
		}
		
		return m;
	}
}