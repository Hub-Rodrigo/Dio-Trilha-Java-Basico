package AulasTratamentoExcecoes;

import java.io.*;

public class CheckedException {

    public static void main(String[] args) throws IOException {

        /*metodo para pegar um arquivo e se imprimido no console e usando IOException, caso passe nome errado vai
        apresento as exeções onde nao foi lacalizado o arquivo e so lembrando sem olha o erro de baixo para cima*/
        String nomeDoArquivo = "romances-blake-crouch.txt";
        imprimirArquivoNoConsole(nomeDoArquivo);

        System.out.println("Apesar da exception ou não, o programa continua... ");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader((file.getName())));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }while(line != null);
        bw.flush();
        br.close();
    }
}
