//Nome: Arthur Gabriel Teotonio Stellato RA:2766949
public class AnoInvException extends Exception {
	
    public AnoInvException() {
    }
	
	Leitura l1 = Leitura.geraLeit();
	
	public Processador consAnoInv(Processador p){
		
	try {
        p.setAno(Integer.parseInt(l1.entDados("Ano: ")));
		}
		
		catch(AnoInvException aie){
			System.out.println("Produto Muito Velho, Só Comercializamos Produtos A Partir De 2015");
			p = consAnoInv(p);
		}
		
		catch (NumberFormatException nfe){
			System.out.println("[ERRO] Por Favor digite um numero inteiro exemplo: 2015");
		}
		
		return p;
	}
	
	public PlacaDeVideo consAnoInv(PlacaDeVideo v){
		
	try {
        v.setAno(Integer.parseInt(l1.entDados("Ano: ")));
		}catch(AnoInvException aie){
			System.out.println("Produto Muito Velho, Só Comercializamos Produtos A Partir De 2015");
			v = consAnoInv(v);
		}
		
		catch (NumberFormatException nfe){
			System.out.println("[ERRO] Por Favor digite um numero inteiro exemplo: 2015");
		}
		
		return v;
	}
	
	public PlacaMae consAnoInv(PlacaMae m){
		
	try {
        m.setAno(Integer.parseInt(l1.entDados("Ano: ")));
		}
		
		catch(AnoInvException aie){
			m = consAnoInv(m);
			System.out.println("Produto Muito Velho, Só Comercializamos Produtos A Partir De 2015");
		}
		
		catch (NumberFormatException nfe){
			System.out.println("[ERRO] Por Favor digite um numero inteiro exemplo: 2015");
		}
		
		return m;
	}
}