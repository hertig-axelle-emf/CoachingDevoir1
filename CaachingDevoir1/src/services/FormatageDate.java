package services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatageDate {

    public String formatageDate1(LocalDate date) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formattedDate = today.format(formatter);
        return formattedDate;

    }

    public String formatageDate2(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        return date.format(formatter);
    }
}
