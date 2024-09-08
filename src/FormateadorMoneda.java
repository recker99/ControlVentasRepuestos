import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivanb
 */


public class FormateadorMoneda {

    private static final DecimalFormat formateador = new DecimalFormat("###,###.##", new DecimalFormatSymbols(new Locale("es", "CL")));

    public static String formatearMoneda(double monto) {
        return "$" + formateador.format(monto);
    }
}