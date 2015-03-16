/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author Marina
 */
public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data(int mes, int ano) {
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public static boolean validMes(int mes) {
        if (mes < 1 || mes > 12) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean validAno(int ano) {
        return ano >= 0;
    }

    public int diasDoMes() {
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            return 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        } else if (mes == 2 && anoBisexto()) {
            return 29;
        } else {
            return 28;
        }
    }

    public boolean anoBisexto() {
        boolean bissexto = (ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0));
        return bissexto;
    }

    public static boolean validDate(int ano, int mes) {
        return validAno(ano) && validMes(mes);
    }
}
