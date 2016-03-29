package com.dashraven.projetotaboo;

import java.util.ArrayList;

public class Equipa {
    
    private String nome;
    private int pontos;

    public Equipa () {
        pontos =0;
    }

    public Equipa (String novoNome) {
        nome = novoNome;
        pontos=0;
    }

    public String getNome() {
        return nome;
    }
    public int getPontos() {
        return pontos;
    }
    
    public void setPontos(int novosPontos) {
        pontos = novosPontos;
    }
    
}
