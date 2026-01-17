//Nome: Arthur Gabriel Teotonio Stellato RA:2766949
public class PlacaMae extends Produto implements Garantia{

    private int numMemoria;
	private String gerMemRam;
	private float pciCompativel;
	private String tamanho;
	private String dataGarantia;
	
	
    // Construtor default
    public PlacaMae() {
		numMemoria = 0;
		pciCompativel = 0;
		tamanho = "";
		dataGarantia = "";
    }

    // Construtor sobrecarregado
    public PlacaMae(int numMemoria, float pciCompativel, String tamanho, String dataGarantia) {
        this.numMemoria = numMemoria;
		this.pciCompativel = pciCompativel;
		this.tamanho = tamanho;
		this.dataGarantia = dataGarantia;
    }
	
	// Sobreescrito
	public void sobDados(){
		System.out.println("sobDados: Classe Filha PlacaMae");
	}
	
    // Getters
    public int getNumMemoria() {
        return numMemoria;
    }
	
	public String getGerMemRam(){
		return gerMemRam;
	}
	
	public float getPciCompativel() {
        return pciCompativel;
    }
	
	public String getTamanho() {
        return tamanho;
    }
	
	public String getDataGarantia() {
	    return dataGarantia;
	}
	
    // Setters
    public void setNumMemoria(int numMemoria) throws NumMemoriaException {
		if (numMemoria <= 0){
			throw new NumMemoriaException();
		}
        this.numMemoria = numMemoria;
    }
	
	public void setGerMemRam(String gerMemRam) throws GerMemRamException {
		if(!gerMemRam.equalsIgnoreCase("DDR3") &&
		!gerMemRam.equalsIgnoreCase("DDR4") && 
		!gerMemRam.equalsIgnoreCase("DDR5")){
			throw new GerMemRamException();
		}
		this.gerMemRam = gerMemRam;
		
	}

	public void setPciCompativel(float pciCompativel) throws PciCompInvException{
		if(pciCompativel != 3.0f && pciCompativel != 4.0f && pciCompativel != 5.0f){
			throw new PciCompInvException();
		}
        this.pciCompativel = pciCompativel;
    }
	
	public void setTamanho(String tamanho) throws TamanhoInvException {
		if(!tamanho.equalsIgnoreCase("EATX") && !tamanho.equalsIgnoreCase("ATX") 
				&& !tamanho.equalsIgnoreCase("MICRO-ATX") 
				&& !tamanho.equalsIgnoreCase("MINI-ATX")){
				throw new TamanhoInvException();
			}
        this.tamanho = tamanho.toUpperCase();
    }
	
	public void setDataGarantia(String dataGarantia) {
	    this.dataGarantia = dataGarantia.toUpperCase();
	}
	
}
