package com.example.atividadereqres.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CandidatoVaga {
    private String nome;
    private String idiomanativo;
    private LocalDate datanasc;
    private String[] habilidades;

    private DateTimeFormatter formatter;

    public CandidatoVaga(){
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.equals("") || nome.length() < 2) {
            throw new RuntimeException("O campo nome está vazio");
        }
        else if (nome.contains(";")){
            throw new RuntimeException("Não pode colocar ; no nome.");
        }
        this.nome = nome;
    }

    public String getIdiomanativo() {
        return idiomanativo;
    }

    public void setIdiomanativo(String idiomanativo) {
        this.idiomanativo = idiomanativo;
    }

    public LocalDate getDatanasc() {
        return datanasc;
    }

    public String getDatanascAsStr() {
        return datanasc.format(formatter);
    }

    public void setDatanasc(LocalDate datanasc) {
        this.datanasc = datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = LocalDate.parse(datanasc,formatter);
    }

    public String[] getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String[] habilidades) {
        this.habilidades = habilidades;
    }

}
