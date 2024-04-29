package pacote;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 while (true) {
	            System.out.println("\nMenu de opções:");
	            System.out.println("1) Registrar reclamação");
	            System.out.println("2) Excluir reclamação");
	            System.out.println("3) Consultar reclamação");
	            System.out.println("4) Registrar conserto");
	            System.out.println("5) Sair");
	            System.out.print("Escolha uma opção: ");
	            int opcao = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (opcao) {
	                case 1:
	                	public void registrarReclamacao();
	                    break;
	                case 2:
	                    System.out.print("Número da reclamação a ser excluída: ");
	                    int numeroExclusao = scanner.nextInt();
	                    break;
	                case 3:
	                    System.out.print("Número da reclamação a ser consultada: ");
	                    int numeroConsulta = scanner.nextInt();
	                    break;
	                case 4:
	                    System.out.print("Número da reclamação: ");
	                    int numeroConserto = scanner.nextInt();
	                    System.out.print("Data e hora do conserto: ");
	                    String dataHoraConserto = scanner.next();
	                    System.out.print("Valor do conserto: ");
	                    double valorConserto = scanner.nextDouble();
	                    break;
	                case 5:
	                    System.out.println("Encerrando o programa. Obrigado por usar o Controle de Obras!");
	                    System.exit(0);
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");

	}

}
