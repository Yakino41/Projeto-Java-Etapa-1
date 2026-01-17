//Nome: Arthur Gabriel Teotonio Stellato RA:2766949
import java.util.ArrayList;
import java.util.List;
public class BDEstoque{
	
	private Leitura l1 = Leitura.geraLeit();
	private List<Produto> BDestoque = new ArrayList<>();

	public void cadastrarProcessador() {
		boolean cadastrarMais = true;
		while (cadastrarMais) {
			Processador p = new Processador();
			System.out.println("\n--- Cadastro de Processador ---");

			//Entrada De Dados Da Marca
			try {
				p.setMarca(l1.entDados("Marca: "));
			} 
			
			catch (ProcInvException pie) {
				System.out.println("[ERRO] Marca De processador Invalida. Marcas Validas -> [INTEL] OU [AMD].");
				p = pie.consProcInv(p);
			} 
			
			catch (PlacaVidInvException pvid) {
				System.out.println("[ERRO] Marca Invalida. Marcas Validas -> [AMD][INTEL][NVIDIA][MSI][AFOX][GIGABYTE][ASUS][XFX][GALAX][ROG][ZOTAC][MANCER]");
			} 
			
			catch (PlacaMaeInvException pmie) {
				System.out.println("[ERRO] Marca Invalida. Marcas Validas -> [INTEL][GIGABYTE][ASROCK][BIOSTAR][EVGA][NZXT][COLORFUL][AFOX][FOXCOON]");
			}

			//Entrada De Dados Do Ano
			try {
				p.setAno(l1.entInt("Ano: "));
			} 
			
			catch (AnoInvException aie) {
				System.out.println("[ERRO]Produto Muito Velho, Só Comercializamos Produtos A Partir De 2015");
				p = aie.consAnoInv(p);
			} 
			
			catch (NumberFormatException nfe) {
				System.out.println("[ERRO] Por Favor digite um numero inteiro EX: 2015");
			}

			//Entrada De Dados Do Preço
			try {
				p.setPreco(l1.entFloat("Preço: "));
			} 
			
			catch (PrecoInvException pie) {
				System.out.println("[ERRO] Preço não pode ser igual a 0 ou negativo.");
				p = pie.consPrecoInv(p);
			} 
			
			catch (NumberFormatException nfe) {
				System.out.println("Entrada inválida. Por favor, digite um número Float.");
			}

			//Entrada De Dados Do Modelo
			try {
				p.setModelo(l1.entDados("Modelo: "));
			} 
			
			catch (ProcModInvException pmie) {
				System.out.println(pmie.getMessage());
				p = pmie.consProcModInv(p);
			}

			//Entrada De Dados Do Socket
			try {
				p.setSocketCompativel(l1.entDados("Socket: "));
			} 
			
			catch (SocketCompInvException scie) {
				System.out.println(scie.getMessage());
				p = scie.consSocketCompInv(p);
			}

			//Entrada De Dados Dos Numeros De Núcleos
			try {
				p.setNucleo(l1.entInt("Núcleos: "));
			}
			
			catch(NucleoInvException nie){
				System.out.println("Por Favor Digite um numero positivo.");
				p = nie.consNuInv(p);
			}
			
			catch (NumberFormatException nfe) {
				System.out.println("Entrada inválida. Por favor, digite um número Inteiro.");
			}

			//Entrada De Dados Dos Numeros De Threads
			try {
				p.setThreads(l1.entInt("Threads: "));
			}
			
			catch(ThreadsInvException tie){
				System.out.println(tie.getMessage());
				p = tie.consThInv(p);
			}
			
			catch (NumberFormatException nfe) {
				System.out.println("Entrada inválida. Por favor, digite um número Inteiro.");
			}

			//Entrada De Dados Da FrequenciaBase
			try {
				p.setFreqBase(l1.entFloat("Frequência Base (GHz)[Exemplo (5.1)]: "));
			}
			
			catch(FreqBaseInvException fbie){
				System.out.println("[ERRO] Por Favor Digite Numeros Como (5.1).\n");
				p = fbie.consFreqBInv(p);
				
			}
			
			catch (NumberFormatException nfe) {
				System.out.println("Entrada inválida. Por favor, digite um número Float.");
			}

			//Entrada De Dados Da FrequenciaMaxima
			try {
				p.setFreqMax(l1.entFloat("Frequência Máxima (GHz)[Exemplo (6.2)]: "));
			} 
			
			catch(FreqMaxInvException fmie){
				System.out.println(fmie.getMessage());
				p = fmie.consFreqMInv(p);
			}
			
			catch (NumberFormatException nfe){
				System.out.println("Entrada inválida. Por favor, digite um número Float.");
			}

			//Entrada De Dados Da Garantia
			p.setDataGarantia(l1.entDados("Duração Da Garantia: "));
			BDestoque.add(p);
			System.out.println("Processador cadastrado com sucesso!");

			String resp = l1.entDados("Deseja Continuar Cadastrando Processadores? <s/n>");
			if (resp.equalsIgnoreCase("n")) {
				cadastrarMais = false;
			}
		}
	}

	public void cadastrarPlacaDeVideo() {
		boolean cadastrarMais = true;
		while (cadastrarMais) {
			PlacaDeVideo v = new PlacaDeVideo();
			System.out.println("\n--- Cadastro de Placa De Video ---");

			//Entrada Da Marca
			try {
				v.setMarca(l1.entDados("Marca: "));
			} 
			
			catch (PlacaVidInvException pvid) {
				System.out.println("[ERRO] Marca Invalida. Marcas Validas -> [AMD][INTEL][NVIDIA][MSI][AFOX][GIGABYTE][ASUS][XFX][GALAX][ROG][ZOTAC][MANCER]");
				v = pvid.consPlacaVidInv(v);
			} 
			
			catch (ProcInvException pie) {
				System.out.println("[ERRO] Marca De processador Invalida. Marcas Validas -> [INTEL] OU [AMD].");
			} 
			
			catch (PlacaMaeInvException pmie) {
				System.out.println("[ERRO] Marca Invalida. Marcas Validas -> [INTEL][GIGABYTE][ASROCK][BIOSTAR][EVGA][NZXT][COLORFUL][AFOX][FOXCOON]");
			}

			//Entrada De Ano
			try {
				v.setAno(l1.entInt("Ano: "));
			} 
			
			catch (AnoInvException aie) {
				System.out.println("Produto Muito Velho, Só Comercializamos Produtos A Partir De 2015");
				v = aie.consAnoInv(v);
			} 
			
			catch (NumberFormatException nfe) {
				System.out.println("Entrada inválida. Por favor, digite um número Inteiro.");
			}

			//Entrada De Preço
			try {
				v.setPreco(l1.entFloat("Preço: "));
			} 
			
			catch (PrecoInvException pie) {
				System.out.println("[ERRO] Preço não pode ser igual a 0 ou negativo.");
				v = pie.consPrecoInv(v);
			} 
			
			catch (NumberFormatException nfe) {
				System.out.println("Entrada inválida. Por favor, digite um número Float.");
			}

			//Entrada De Modelo
			try {
				v.setModelo(l1.entDados("Modelo: "));
			} 
			
			catch (ProcModInvException pmie) {
				System.out.println("Modelo Deve Ser RYZEN OU INTEL");
			}

			//Entrada Da Quantidade De Memoria
			try {
				v.setMemoria(l1.entInt("GBs Memoria: "));
			} 
			
			catch (MemoriaInvException mie){
				System.out.println("Quantidade de memoria deve ser maior que 0");
				v = mie.consMemInv(v);
			}
			
			catch (NumberFormatException nfe) {
				System.out.println("Entrada inválida. Por favor, digite um número Inteiro.");
			}
			
			//Entrada Do Tipo Da Vram
			try {
				v.setTipoMemoria(l1.entDados("Tipo Da Memoria: "));
			} 
			
			catch (TipoMenInvException tmie) {
				System.out.println("[ERRO] Memoria errada. Tipos de Memoria -> [GDDR4][GDDR5][GDDR5X][GDDR6][GDDR6X][GDDR7]");
				v = tmie.consTipoMenInv(v);
			}

			//Entrada Da Velocidade De Vram
			try {
				v.setVeloVram(l1.entFloat("Velocidade Vram: "));
			}
			
			catch(VeloVramException vve){
				System.out.println("[ERRO] Velocidade Da Vram Deve ser Maior que 0.");
				v = vve.consVeloVInv(v);
			}
			
			catch (NumberFormatException nfe) {
				System.out.println("Entrada inválida. Por favor, digite um número Float.");
			}

			//Entrada Da Versão Do Pci
			try {
				v.setNumPci(l1.entFloat("Versão PCI: "));
			}
			
			catch(NumPciException npe){
				System.out.println("[ERRO] Versão do PCI deve ser [3.0][4.0][5.0]");
				v = npe.consNumPciInv(v);
			}
			
			catch (NumberFormatException nfe) {
				System.out.println("Entrada inválida. Por favor, digite um número Float.");
			}

			//Entrada Das Entradas De Video
			v.setSaidaVideo(l1.entDados("Saidas De Video Exemplo[2 HDMI 2.1/2 DISPLAY PORT 1.0]: "));

			//Entrada Do Comprimento Da GPU
			try {
				v.getDime().setComprimento(l1.entFloat("Comprimento: ")); //Reflexividade
			} 
			
			catch (NumberFormatException nfe) {
				System.out.println("Entrada inválida. Por favor, digite um número Float.");
			}

			//Entrada Da Largura Da GPU
			try {
				v.getDime().setLargura(l1.entFloat("Largura: ")); //Reflexividade
			} 
			
			catch (NumberFormatException nfe) {
				System.out.println("Entrada inválida. Por favor, digite um número Float.");
			}

			//Entrada Da Espessura Da GPU
			try {
				v.getDime().setEspessura(l1.entFloat("Espessura: ")); //Reflexividade
			} 
			
			catch (NumberFormatException nfe) {
				System.out.println("Entrada inválida. Por favor, digite um número Float.");
			}

			//Entrada De Dados Da Garantia
			v.setDataGarantia(l1.entDados("Duração Garantia: "));
			BDestoque.add(v);
			System.out.println("Placa de Vídeo cadastrada com sucesso!");

			String resp = l1.entDados("Deseja Continuar Cadastrando Placas de Vídeo? <s/n>");
			if (resp.equalsIgnoreCase("n")) {
				cadastrarMais = false;
			}
		}
	}

	public void cadastrarPlacaMae() {
		boolean cadastrarMais = true;
		while (cadastrarMais) {
			PlacaMae m = new PlacaMae();
			System.out.println("\n--- Cadastro da Placa-Mãe ---");

			//Entrada Da Marca
			try {
				m.setMarca(l1.entDados("Marca: "));
			}
			
			catch (ProcInvException pie) {
				System.out.println("[ERRO] Marca De processador Invalida. Marcas Validas -> [INTEL] OU [AMD].");
			}
			
			catch (PlacaVidInvException pvid) {
				System.out.println("[ERRO] Marca Invalida. Marcas Validas -> [AMD][INTEL][NVIDIA][MSI][AFOX][GIGABYTE][ASUS][XFX][GALAX][ROG][ZOTAC][MANCER]");
			}
			
			catch (PlacaMaeInvException pmie) {
				System.out.println("[ERRO] Marca Invalida. Marcas Validas -> [INTEL][GIGABYTE][ASROCK][BIOSTAR][EVGA][NZXT][COLORFUL][AFOX][FOXCOON][MSI]");
				m = pmie.consPlacaMaeInv(m);
			}

			//Entrada De Dados Do Ano
			try {
				m.setAno(l1.entInt("Ano: "));
			}
			
			catch (AnoInvException aie) {
				System.out.println("Produto Muito Velho, Só Comercializamos Produtos A Partir De 2015");
				m = aie.consAnoInv(m);
			}
			
			catch (NumberFormatException nfe) {
				System.out.println("Entrada inválida. Por favor, digite um número Inteiro.");
			}

			//Entrada De Dados Do Preço
			try {
				m.setPreco(l1.entFloat("Preço: "));
			}
			
			catch (PrecoInvException pie) {
				System.out.println("[ERRO] Preço não pode ser igual a 0 ou negativo.");
				m = pie.consPrecoInv(m);
			}
			
			catch (NumberFormatException nfe) {
				System.out.println("Entrada inválida. Por favor, digite um número Float.");
			}

			//Entrada De Dados Do Modelo
			try {
				m.setModelo(l1.entDados("Modelo: "));
			}
			
			catch (ProcModInvException pmie) {
				System.out.println("Modelo Deve Ser RYZEN OU INTEL");
			}
			
			//Entrada De Dados Canais De Memoria
			try {
				m.setNumMemoria(l1.entInt("Quantos canais de memoria"));
			}
			
			catch(NumMemoriaException nme){
				System.out.println("[ERRO] A quantidade de canais tem que ser maior que 0");
				m = nme.consNumMemInv(m);
			}
			
			catch(NumberFormatException nfe){
				System.out.println("Entrada inválida. Por favor, digite um número Inteiro.");
			}
			
			//Entrada De Dados GeraçãoMemoriaRam
			try{
			m.setGerMemRam(l1.entDados("Geração Do Canal de Ram: "));
			}
			
			catch(GerMemRamException gmre){
			System.out.println("[ERRO] A Geração da Memoria Ram Compativeis São [DDR3][DDR4][DDR5] Tente Novamente.");
			m = gmre.consGerMemRamInv(m);
			}
			
			//Entrada De DadosVersãoSlotPci
			try{
			m.setPciCompativel(l1.entFloat("Qual A Versão do slot pci: "));
			}
			
			catch(PciCompInvException cpe){
			System.out.println("[ERRO] Versão do PCI Compativel deve [3.0] [4.0] [5.0]");
			m = cpe.consPciCompInv(m);
			}
			
			catch (NumberFormatException nfe) {
			System.out.println("Entrada inválida. Por favor, digite um número Float.");
			}
			
			//Entrada De Dados Tamanho
			try {
				m.setTamanho(l1.entDados("Tamanho Da Placa Mãe EX: EATX][ATX][MICRO-ATX][MINI-ATX]"));
			}
			
			catch (TamanhoInvException tie) {
				System.out.println("[ERRO] Tamanho inválido. Tamanhos Válidos -> [ATX][MICRO-ATX][MINI-ITX][E-ATX]");
				m = tie.consTamanhoInv(m);
			}

			//Entrada De Dados Da Garantia
			m.setDataGarantia(l1.entDados("Duração Garantia: "));
			BDestoque.add(m);
			System.out.println("Placa Mãe cadastrada com sucesso!");

			String resp = l1.entDados("Deseja Continuar Cadastrando Placas Mãe? <s/n>");
			if (resp.equalsIgnoreCase("n")) {
				cadastrarMais = false;
			}
		}
	}

	public void listarProduto() {
		System.out.println("\n--- Lista de Produtos ---");
		if (BDestoque.isEmpty()) {
			System.out.println("Nenhum produto cadastrado.");
		} else {
				for (int i = 0; i < BDestoque.size(); i++) {
					Produto p = BDestoque.get(i);
					System.out.println("\n--- Produto " + i + " ---");
					System.out.println("Marca: " + p.getMarca());
					System.out.println("Modelo: " + p.getModelo());
					System.out.println("Ano: " + p.getAno());
					System.out.println("Preço: R$ " + p.getPreco());
					System.out.println("Garantia: " + p.getDataGarantia());

					if (p instanceof Processador) {
						Processador proc = (Processador) p;
						System.out.println("Tipo: Processador");
						System.out.println("Socket Compatível: " + proc.getSocketCompativel());
						System.out.println("Núcleos: " + proc.getNucleo());
						System.out.println("Threads: " + proc.getThreads());
						System.out.println("Frequência Base: " + proc.getFreqBase() + " GHz");
						System.out.println("Frequência Máxima: " + proc.getFreqMax() + " GHz");
					} else if (p instanceof PlacaDeVideo) {
						PlacaDeVideo video = (PlacaDeVideo) p;
						System.out.println("Tipo: Placa de Vídeo");
						System.out.println("Memória: " + video.getMemoria() + " GB");
						System.out.println("Velocidade VRAM: " + video.getVeloVram());
						System.out.println("Tipo de Memória: " + video.getTipoMemoria());
						System.out.println("Versão PCI: " + video.getNumPci());
						System.out.println("Saídas de Vídeo: " + video.getSaidaVideo());
						System.out.println("Dimensões (CxLxE): " + video.getDime().getComprimento() + "x" + video.getDime().getLargura() + "x" + video.getDime().getEspessura() + " cm"); //Reflexividade
					} else if (p instanceof PlacaMae) {
						PlacaMae mae = (PlacaMae) p;
						System.out.println("Tipo: Placa Mãe");
						System.out.println("Número de Slots de Memória: " + mae.getNumMemoria());
						System.out.println("Geração do Slot Memoria Ram: " + mae.getGerMemRam());
						System.out.println("PCI Compatível: " + mae.getPciCompativel());
						System.out.println("Tamanho: " + mae.getTamanho());
					}
				}
		}
	}

	public void removerProduto() {
		System.out.println("\n--- Remover Produto ---");
		if (BDestoque.isEmpty()) {
			System.out.println("Nenhum produto para remover.");
		} else {
			for (int i = 0; i < BDestoque.size(); i++) {
				System.out.println("Indice: " + i + " - " + BDestoque.get(i).getModelo() + " (" + BDestoque.get(i).getMarca() + ")");
			}
			try {
				int indiceRemover = (l1.entInt("Digite o índice do produto a ser removido: "));
				if (indiceRemover >= 0 && indiceRemover < BDestoque.size()) {
					Produto produtoRemovido = BDestoque.remove(indiceRemover);
					System.out.println("Produto " + produtoRemovido.getModelo() + " removido com sucesso.");
				} else {
					System.out.println("[ERRO] Índice inválido.");
				}
			} 
			
			catch (NumberFormatException e) {
				System.out.println("[ERRO] Entrada inválida. Digite um número inteiro para o índice.");
			}
		}
	}

	public void editarProduto() {
		System.out.println("\n--- Editar Produto ---");
		if (BDestoque.isEmpty()) {
			System.out.println("Nenhum produto para editar.");
		} else {
			for (int i = 0; i < BDestoque.size(); i++) {
				System.out.println("Indice: " + i + " - " + BDestoque.get(i).getModelo() + " (" + BDestoque.get(i).getMarca() + ")");
			}
			try {
				int indiceEditar = (l1.entInt("Digite o índice do produto a ser editado: "));
				if (indiceEditar >= 0 && indiceEditar < BDestoque.size()) {
					Produto produto = BDestoque.get(indiceEditar);
					System.out.println("Editando produto: " + produto.getModelo() + " (" + produto.getMarca() + ")");

					try {
						produto.setPreco(l1.entFloat("Novo Preço (" + produto.getPreco() + "): "));
					} 
					
					catch (PrecoInvException pie) {
						System.out.println("[ERRO] Preço inválido. Não alterado.");
					} 
					
					catch (NumberFormatException nfe) {
						System.out.println("[ERRO] Entrada inválida para preço. Não alterado.");
					}
					produto.setDataGarantia(l1.entDados("Nova Duração da Garantia (" + produto.getDataGarantia() + "): "));

					System.out.println("Produto atualizado com sucesso!");
				} else {
					System.out.println("[ERRO] Índice inválido.");
				}
			} 
			
			catch (NumberFormatException e) {
				System.out.println("[ERRO] Entrada inválida. Digite um número inteiro para o índice.");
			}
		}
	}
} 