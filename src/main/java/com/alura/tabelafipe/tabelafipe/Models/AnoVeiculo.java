package com.alura.tabelafipe.tabelafipe.Models;

import com.fasterxml.jackson.annotation.JsonAlias;

public record AnoVeiculo(@JsonAlias("codigo") String codigo,
                         @JsonAlias("nome") String ano) {
}
