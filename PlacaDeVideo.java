//Nome: Arthur Gabriel Teotonio Stellato RA:2766949
public class PlacaDeVideo extends Produto implements Garantia{

    private int memoria; // Em GB
	private float veloVram;
    private String tipoMemoria;
	private float numPci;
	private String saidaVideo;
	private String dataGarantia;
	private Dimensao dime;

    // Construtor default
    public PlacaDeVideo() {
        memoria = 0;
		veloVram = 0;
        tipoMemoria = "";
		numPci = 0;
		saidaVideo = "";
		dataGarantia = "";
		dime = new Dimensao();
    }

    // Construtor sobrecarregado
    public PlacaDeVideo(int memoria, float veloVram, String tipoMemoria, float numPci, String saidaVideo, String dataGarantia, Dimensao Dime) {
        this.memoria = memoria;
		this.veloVram = veloVram;
        this.tipoMemoria = tipoMemoria;
		this.numPci = numPci;
		this.saidaVideo = saidaVideo;
		this.dataGarantia = dataGarantia;
		this.dime = dime;
    }
	
	//Sobreescrita
	public void sobDados(){
		System.out.println("sobDados: Classe Filha PlacaDeVideo");
	}
	
    // Getters
    public int getMemoria() {
        return memoria;
    }
	
	public float getVeloVram(){
		return veloVram;
	}

    public String getTipoMemoria() {
        return tipoMemoria;
    }
	
	public float getNumPci() {
        return numPci;
    }
	
	public String getSaidaVideo() {
        return saidaVideo;
    }

	public String getDataGarantia() {
	        return dataGarantia;
	}
	
	public Dimensao getDime(){
		return dime;
	}
	
    // Setters
    public void setMemoria(int memoria) throws MemoriaInvException{
		if(memoria <= 0){
			throw new MemoriaInvException();
		}
        this.memoria = memoria;
    }
	
	public void setVeloVram(float veloVram) throws VeloVramException {
		if(veloVram <= 0){
			throw new VeloVramException();
		}
		this.veloVram = veloVram;
	}

    public void setTipoMemoria(String tipoMemoria) throws TipoMenInvException {
		if(!tipoMemoria.equalsIgnoreCase("GDDR4") && 
		!tipoMemoria.equalsIgnoreCase("GDDR5") && 
		!tipoMemoria.equalsIgnoreCase("GDDR5X") &&
		!tipoMemoria.equalsIgnoreCase("GDDR6") && 
		!tipoMemoria.equalsIgnoreCase("GDDR6X") && 
		!tipoMemoria.equalsIgnoreCase("GDDR7")) {
			throw new TipoMenInvException();
		}else{
        this.tipoMemoria = tipoMemoria.toUpperCase();
		}
    }
	
	public void setNumPci(float numPci) throws NumPciException {
		if (numPci != 3.0f && numPci != 4.0f && numPci != 5.0f) {
			throw new NumPciException();
		}
		this.numPci = numPci;
	}

	
	 public void setSaidaVideo(String saidaVideo) {
        this.saidaVideo = saidaVideo.toUpperCase();
    }
	
	public void setDataGarantia(String dataGarantia) {
	    this.dataGarantia = dataGarantia.toUpperCase();
	}
	
	public void setDime(Dimensao dime){
			this.dime = dime;		
	}
}
