//Nome: Arthur Gabriel Teotonio Stellato RA:2766949
public class GerMenu{

	private Leitura l1 = Leitura.geraLeit();
	private BDEstoque banco = new BDEstoque();
	
	public void geraMenu(){
		boolean vai = true;
		int opcao;
		do {
			// Menu principal
			System.out.println("\n--- Menu de Produtos ---");
			System.out.println("(1) Cadastrar Processador");
			System.out.println("(2) Cadastrar PlacaDeVideo");
			System.out.println("(3) Cadastrar PlacaMae");
			System.out.println("(4) Listar todos os Produtos");
			System.out.println("(5) Remover um produto");
			System.out.println("(6) Editar um produto");
			System.out.println("(7) Sair");
			try {
				opcao = (l1.entInt("Escolha uma opção: "));
			} 
			
			catch (NumberFormatException e) {
				System.out.println("[ERRO]Entrada inválida, tente novamente.");
				continue;
			}

			switch (opcao) {
				case 1 -> {
					banco.cadastrarProcessador();
				}
					
				case 2 -> {
					banco.cadastrarPlacaDeVideo();
				}
				
				case 3 -> {
					banco.cadastrarPlacaMae();
				}
				
				case 4 -> {
					banco.listarProduto();
				} 
				case 5 -> {
					banco.removerProduto();
				}
				case 6 -> {
					banco.editarProduto();
				}
				case 7 -> {
					vai = false;
					System.out.println("Saindo.");
				}
				default -> {
					System.out.println("[ERRO] Opção inválida. Tente novamente.");
				}
			}
		} while (vai);
	}
}