//Nome: Arthur Gabriel Teotonio Stellato RA:2766949
public class NumMemoriaException extends Exception{
	
	NumMemoriaException(){
	}
	
	Leitura l1 = Leitura.geraLeit();
	
	public PlacaMae consNumMemInv(PlacaMae m){
	try {
			m.setNumMemoria(l1.entInt("Quantos canais de memoria"));
		}
			
		catch(NumMemoriaException nme){
			System.out.println("[ERRO] A quantidade de canais tem que ser maior que 0");
			m = consNumMemInv(m);
		}
			
		catch(NumberFormatException nfe){
			System.out.println("[ERRO] Por favor digite um numero inteiro.");
		}
		
		return m;
	}
}