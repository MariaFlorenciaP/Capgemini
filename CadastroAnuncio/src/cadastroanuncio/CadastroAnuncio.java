package cadastroanuncio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CadastroAnuncio {

    public static void main(String[] args) throws ParseException {

        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Anuncio> lista = new ArrayList<>();

        System.out.println("****** Bemvindo ******");
        System.out.println("Digite 1 para cadastrar um anuncio");
        System.out.println("Digite 2 para gerar relatório do valor total investido");
        System.out.println("Digite 3 para gerar relatório da quantidade máxima de visualizações");
        System.out.println("Digite 3 para gerar relatório da quantidade máxima de cliques");
        System.out.println("Digite 4 para gerar relatório da quantidade máxima de compartilhamentos");
        System.out.println("Digite 5 para sair");
        int resp = entrada.nextInt();

        switch (resp) {
            case 1:
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

                break;

        }

        //*case 2:
        // break;
        //default:
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

}
