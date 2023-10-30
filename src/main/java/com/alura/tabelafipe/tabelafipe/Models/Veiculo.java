package com.alura.tabelafipe.tabelafipe.Models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Veiculo(@JsonAlias("Modelo") String nome,
                      @JsonAlias("AnoModelo") Integer ano,
                      @JsonAlias("Valor") String valor,
                      @JsonAlias("Combustivel") String combustivel) {
}
