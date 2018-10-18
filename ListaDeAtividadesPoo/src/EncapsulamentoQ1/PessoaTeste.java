package EncapsulamentoQ1;

import java.sql.Time;
import java.sql.Types;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author iurimega13
 */
public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("iuri", new Date(2001,0,21), 1.72);
        Pessoa p2 = new Pessoa("iuri", new Date(2001,0,21), 1.72);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println();
        
    }
}
