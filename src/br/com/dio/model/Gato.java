package br.com.dio.model;

import java.util.Objects;

public class Gato {
    private String nome;
    private String Cor;
    private Integer Idade;


    public Gato() { }

    public Gato(String nome, String cor, Integer idade) {
        this.nome = nome;
        Cor = cor;
        Idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public Integer getIdade() {
        return Idade;
    }

    public void setIdade(Integer idade) {
        Idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(nome, gato.nome) && Objects.equals(Cor, gato.Cor) && Objects.equals(Idade, gato.Idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, Cor, Idade);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", Cor='" + Cor + '\'' +
                ", Idade=" + Idade +
                '}';
    }
}
