//Nome: Arthur Gabriel Teotonio Stellato RA:2766949
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitura{
	
	
	private static Leitura leiUnic; //1° passo
	
	private Leitura(){} //2° passo
	
	public static Leitura geraLeit(){ //3° passo
	
		if(leiUnic == null){
			leiUnic = new Leitura();
		}
		return leiUnic;
	}
	
	public String entDados(String rotulo) {
        System.out.println(rotulo);

        InputStreamReader tec = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(tec);

        String ret = "";

        try {
            ret = buff.readLine();
        } catch (IOException ioe) {
            System.out.println("ERRO: JVM - RAM");
        }
        return ret;
    }

    public int entInt(String rotulo) {
        int num = 0;
        while (true) {
            String entrada = entDados(rotulo);
            try {
                num = Integer.parseInt(entrada);
                break; // Sai do loop se a conversão for bem-sucedida
            } catch (NumberFormatException nfe) {
                System.out.println("Entrada inválida. Por favor, digite um número Inteiro.");
            }
        }
        return num;
    }

    public float entFloat(String rotulo) {
        float num = 0.0f;
        while (true) {
            String entrada = entDados(rotulo);
            try {
                num = Float.parseFloat(entrada);
                break; // Sai do loop se a conversão for bem-sucedida
            } catch (NumberFormatException nfe) {
                System.out.println("Entrada inválida. Por favor, digite um número Float.");
            }
        }
        return num;
    }
}	