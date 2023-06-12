import model.Adress;
import util.zipcodeQuery;
import util.File;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        File file = new File();
        zipcodeQuery zipcodeQuery = new zipcodeQuery();

        System.out.print("Digite o seu cep: ");
        String cep = input.next();

        Adress newAdress = new Adress(zipcodeQuery.searchAdress(cep));
        file.saveInJson(newAdress);
        System.out.println("Consulta Finalizada com sucesso!");
    }
}
