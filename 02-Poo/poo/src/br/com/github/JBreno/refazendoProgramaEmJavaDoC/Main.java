package br.com.github.JBreno.refazendoProgramaEmJavaDoC;

import br.com.github.JBreno.refazendoProgramaEmJavaDoC.bib.Data;
import br.com.github.JBreno.refazendoProgramaEmJavaDoC.bib.LeituraDaTela;

public class Main {
    public static void main(String[] args) {

        LeituraDaTela lt = new LeituraDaTela();

        int dia = lt.leDaTela("Informe o dia da data: ");
        int mes = lt.leDaTela("Informe o mes da data: ");
        int ano = lt.leDaTela("Informe o ano da data: ");

        Data data = new Data(dia, mes, ano);
        data.imprimeDataNaTela();

    }
}