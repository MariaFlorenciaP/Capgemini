package cadastroanuncio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CadastroAnuncio {

    public static void main(String[] args) throws ParseException {

        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Anuncio> lista = new ArrayList<>();

        System.out.println("****** Bemvindo a sistema de cadastro de anúncios ******");
      
                Anuncio anuncio1 = new Anuncio();
                System.out.println("Informe o nome do anúncio: ");
                String nomeAnuncio = entrada.next();
                anuncio1.setNomeAnuncio(nomeAnuncio);

                System.out.println("Informe o nome do cliente: ");
                String cliente = entrada.next();
                anuncio1.setCliente(cliente);

                System.out.println("Informe a data de inicio: (dd/MM/aaaa)");
                String dataIn = entrada.next();
                Date dataInicio = sdf.parse(dataIn); //trocar datas a LocalDate
                anuncio1.setDataInicio(dataInicio);

                System.out.println("Informe a data de término: (dd/MM/aaaa)");
                String dataOut = entrada.next();
                Date dataTermino = sdf.parse(dataOut);
                anuncio1.setDataTermino(dataTermino);

                System.out.println("Informe o valor do investimento diário: ");
                Double investimento = entrada.nextDouble();
                anuncio1.setInvestimento(investimento);
      

                mostrarAnuncio(anuncio1);
                
                Double totalInvestido = calcularValorInvestido(dataInicio, dataTermino, investimento);
                System.out.println("Valor total investido: " + totalInvestido);
                
                
                System.out.println("Visualizações: ");
                calcularVisualizacoes(investimento);
  

    }

   

    public static void mostrarAnuncio(Anuncio a) {
        System.out.println("Anuncio Cadastrado: ");
        System.out.println("----------------");
        System.out.println("Nome do anuncio: " + a.getNomeAnuncio());
        System.out.println("Nome do cliente: " + a.getCliente());
        System.out.println("Data de inicio: " + a.getDataInicio());
        System.out.println("Data de termino: " + a.getDataTermino());
        System.out.println("Investimento diário: " + a.getInvestimento());
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
    }

    public static double calcularValorInvestido(Date dataInicio, Date dataTermino, Double investimento) {
       
		long dif = Math.abs(dataTermino.getTime() - dataInicio.getTime()); 
		long dias = TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS); 
		return investimento * dias;
	
    }
    
    public static void calcularVisualizacoes(Double investimento){
        Double visualizaOriginal = investimento * 30;
        Double contadorVisualizacoes = visualizaOriginal;
        for (int i = 0; i <= 3; i++) {
            Double pessoasClicam = visualizaOriginal * 0.12;
            Double pessoasCompartilham = pessoasClicam * 0.15;
            Double visualizacoesCompartilhadas = pessoasCompartilham * 40;
            contadorVisualizacoes += visualizacoesCompartilhadas;
            
        }
        int totalViews = (int) Math.round(contadorVisualizacoes);
        System.out.println("A quantidade de pessoas que visualizaram o anúncio é: " + totalViews);
        
    }
    
    
    
}
