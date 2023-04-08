package br.inatel.cdg.ordenar.algoritmo;

import br.inatel.cdg.ordenar.AlgoritmoOrdenar;

import java.util.ArrayList;
import java.util.Collections;

//ordem decrescente
public class AlgoritmoASD implements AlgoritmoOrdenar {
    @Override
    public ArrayList<Integer> ordenarDados(ArrayList<Integer> lista) {
        Collections.sort(lista,Collections.reverseOrder());
        return lista;
    }
}