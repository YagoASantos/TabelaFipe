package com.alura.tabelafipe.tabelafipe.services;

public interface IConverteDados {
    <T> T conversorDeDados(String json, Class<T> classe);
}
