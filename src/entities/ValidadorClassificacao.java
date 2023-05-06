package entities;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ValidadorClassificacao {


    public boolean validar(int ano, int classificacao){
        Calendar cal = GregorianCalendar.getInstance();
        int year = cal.get(Calendar.YEAR);

        if ((year - ano) < classificacao){
            return false;
        } else {
            return true;
        }
    }
}
