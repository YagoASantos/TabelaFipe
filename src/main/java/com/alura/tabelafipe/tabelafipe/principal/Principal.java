package com.alura.tabelafipe.tabelafipe.principal;

import com.alura.tabelafipe.tabelafipe.Models.AnoVeiculo;
import com.alura.tabelafipe.tabelafipe.Models.Veiculo;
import com.alura.tabelafipe.tabelafipe.services.ConsumoApi;
import com.alura.tabelafipe.tabelafipe.services.ConverteDados;
import org.springframework.asm.TypeReference;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private static Scanner scanner = new Scanner(System.in);
    private static String ENDERECO = "https://parallelum.com.br/fipe/api/v1/";
    private static final String MARCA = "/marcas/";
    private static final String MODELO = "/modelos/";
    private static final String ANO = "/anos/";
    private static final ConverteDados converteDados = new ConverteDados();
    public static void run() {
        String endereco = "";
        System.out.println("Escolha um veículo: ");
        System.out.println("carros");
        System.out.println("motos");
        System.out.println("caminhoes");
        String tipoVeiculo = scanner.nextLine();
        endereco += ENDERECO + tipoVeiculo + MARCA;
        System.out.println(ConsumoApi.obterDados(endereco));
        System.out.println("Digite o código de uma marca: ");
        int codigoMarca = scanner.nextInt();
        endereco += codigoMarca + MODELO;
        System.out.println(ConsumoApi.obterDados(endereco));
        System.out.println("Digite o código do modelo: ");
        int codigoModelo = scanner.nextInt();
        endereco += codigoModelo + ANO;
        String resultApi = ConsumoApi.obterDados(endereco);
        List<AnoVeiculo> preInfosVeiculos = converteDados.converteParaList(resultApi, AnoVeiculo.class);
        System.out.println(preInfosVeiculos);
        List<Veiculo> veiculos = new ArrayList<>();
        for (AnoVeiculo preInfosVeiculo : preInfosVeiculos) {
            String resultado = ConsumoApi.obterDados(endereco + preInfosVeiculo.codigo());
            veiculos.add(converteDados.conversorDeDados(resultado, Veiculo.class));
        }
        System.out.println(veiculos);
        //System.out.println(ConsumoApi.obterDados(urlPrincipal + codigoMarca + MODELO + codigoModelo + ANO));
    }
}
