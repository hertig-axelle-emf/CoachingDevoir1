package services;

import java.text.DecimalFormat;

public class FormatageNombre {
    public String formatNombreEntier(long nombre) {
        return String.format("%,d", nombre).replace(',', '\'');
    }

    public String formatNombreDecimal(double nombre) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        return df.format(nombre).replace(',', '\'');
    }
}
