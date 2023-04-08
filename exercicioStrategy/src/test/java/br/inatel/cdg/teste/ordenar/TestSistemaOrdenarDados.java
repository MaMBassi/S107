package br.inatel.cdg.teste.ordenar;

import br.inatel.cdg.ordenar.*;
import br.inatel.cdg.ordenar.algoritmo.AlgoritmoAS;
import br.inatel.cdg.ordenar.algoritmo.AlgoritmoASD;
import br.inatel.cdg.ordenar.algoritmo.AlgoritmoBS;
import br.inatel.cdg.ordenar.algoritmo.AlgoritmoIS;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestSistemaOrdenarDados {
    SistemaOrdenarDados sistemaOrdenarDados;

    //verificar se o algoritmo chamado é o ArraySort
    @Test
    public void testeArraySort() {
        sistemaOrdenarDados = new ArraySort();
        assertTrue(sistemaOrdenarDados.getAlgOrdenar() instanceof AlgoritmoAS);
    }

    //verificar se o algoritmo chamado é o InsertionSort
    @Test
    public void testeInsertionSort() {
        sistemaOrdenarDados = new InsertionSort();
        assertTrue(sistemaOrdenarDados.getAlgOrdenar() instanceof AlgoritmoIS);
    }

    //verificar se o algoritmo chamado é o BubbleSort
    @Test
    public void testeBubbleSort() {
        sistemaOrdenarDados = new BubbleSort();
        assertTrue(sistemaOrdenarDados.getAlgOrdenar() instanceof AlgoritmoBS);
    }

    //verificar se o algoritmo chamado é o ArraySort Decrescente
    @Test
    public void testeArraySortD() {
        sistemaOrdenarDados = new ArraySortDecrescente();
        assertTrue(sistemaOrdenarDados.getAlgOrdenar() instanceof AlgoritmoASD);
    }

    //verificar se o ArraySort ordena corretamente numeros positivos
    @Test
    public void testeArraySortResultado() {
        sistemaOrdenarDados = new ArraySort();
        ArrayList<Integer> listaTeste = new ArrayList<>();
        listaTeste.add(20);
        listaTeste.add(4);
        listaTeste.add(10);
        ArrayList<Integer> resultadoTeste = new ArrayList<>();
        resultadoTeste.add(4);
        resultadoTeste.add(10);
        resultadoTeste.add(20);

        ArrayList<Integer> resultado = sistemaOrdenarDados.ordenarDados(listaTeste);
        assertEquals(resultado, resultadoTeste);
    }

    //verificar se o ArraySort ordena corretamente numeros negativos
    @Test
    public void testeArraySortResultadoNeg() {
        sistemaOrdenarDados = new ArraySort();
        ArrayList<Integer> listaTeste = new ArrayList<>();
        listaTeste.add(-1);
        listaTeste.add(-4);
        listaTeste.add(-10);
        ArrayList<Integer> resultadoTeste = new ArrayList<>();
        resultadoTeste.add(-10);
        resultadoTeste.add(-4);
        resultadoTeste.add(-1);

        ArrayList<Integer> resultado = sistemaOrdenarDados.ordenarDados(listaTeste);
        assertEquals(resultado, resultadoTeste);
    }

    //verificar se o InsertionSort ordena corretamente numeros positivos
    @Test
    public void testeInsertionSortResultado() {
        sistemaOrdenarDados = new InsertionSort();
        ArrayList<Integer> listaTeste = new ArrayList<>();
        listaTeste.add(20);
        listaTeste.add(4);
        listaTeste.add(10);
        ArrayList<Integer> resultadoTeste = new ArrayList<>();
        resultadoTeste.add(4);
        resultadoTeste.add(10);
        resultadoTeste.add(20);

        ArrayList<Integer> resultado = sistemaOrdenarDados.ordenarDados(listaTeste);
        assertEquals(resultado, resultadoTeste);
    }

    //verificar se o InsertionSort ordena corretamente numeros negativos
    @Test
    public void testeInsertionSortResultadoNeg() {
        sistemaOrdenarDados = new InsertionSort();
        ArrayList<Integer> listaTeste = new ArrayList<>();
        listaTeste.add(-20);
        listaTeste.add(-4);
        listaTeste.add(-10);
        ArrayList<Integer> resultadoTeste = new ArrayList<>();
        resultadoTeste.add(-20);
        resultadoTeste.add(-10);
        resultadoTeste.add(-4);

        ArrayList<Integer> resultado = sistemaOrdenarDados.ordenarDados(listaTeste);
        assertEquals(resultado, resultadoTeste);
    }

    //verificar se o BubbleSort ordena corretamente numeros positivos
    @Test
    public void testeBubbleSortResultado() {
        sistemaOrdenarDados = new BubbleSort();
        ArrayList<Integer> listaTeste = new ArrayList<>();
        listaTeste.add(20);
        listaTeste.add(4);
        listaTeste.add(10);
        ArrayList<Integer> resultadoTeste = new ArrayList<>();
        resultadoTeste.add(4);
        resultadoTeste.add(10);
        resultadoTeste.add(20);

        ArrayList<Integer> resultado = sistemaOrdenarDados.ordenarDados(listaTeste);
        assertEquals(resultado, resultadoTeste);
    }

    //verificar se o BubbleSort ordena corretamente numeros negativos
    @Test
    public void testeBubbleSortResultadoNeg() {
        sistemaOrdenarDados = new BubbleSort();
        ArrayList<Integer> listaTeste = new ArrayList<>();
        listaTeste.add(-20);
        listaTeste.add(-4);
        listaTeste.add(-10);
        ArrayList<Integer> resultadoTeste = new ArrayList<>();
        resultadoTeste.add(-20);
        resultadoTeste.add(-10);
        resultadoTeste.add(-4);

        ArrayList<Integer> resultado = sistemaOrdenarDados.ordenarDados(listaTeste);
        assertEquals(resultado, resultadoTeste);
    }

    //verificar se o ArraySortDecrescente ordena corretamente numeros positivos
    @Test
    public void testeArraySortDResultado() {
        sistemaOrdenarDados = new ArraySortDecrescente();
        ArrayList<Integer> listaTeste = new ArrayList<>();
        listaTeste.add(20);
        listaTeste.add(4);
        listaTeste.add(10);
        ArrayList<Integer> resultadoTeste = new ArrayList<>();
        resultadoTeste.add(20);
        resultadoTeste.add(10);
        resultadoTeste.add(4);

        ArrayList<Integer> resultado = sistemaOrdenarDados.ordenarDados(listaTeste);
        assertEquals(resultado, resultadoTeste);
    }

    //verificar se o ArraySortDecrescente ordena corretamente numeros negativos
    @Test
    public void testeArraySortDResultadoNeg() {
        sistemaOrdenarDados = new ArraySortDecrescente();
        ArrayList<Integer> listaTeste = new ArrayList<>();
        listaTeste.add(-20);
        listaTeste.add(-14);
        listaTeste.add(-10);
        ArrayList<Integer> resultadoTeste = new ArrayList<>();
        resultadoTeste.add(-10);
        resultadoTeste.add(-14);
        resultadoTeste.add(-20);

        ArrayList<Integer> resultado = sistemaOrdenarDados.ordenarDados(listaTeste);
        assertEquals(resultado, resultadoTeste);
    }
}
