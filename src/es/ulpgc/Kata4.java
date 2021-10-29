package es.ulpgc;

import es.ulpgc.domain.Histogram;
import es.ulpgc.domain.Mail;

import java.io.IOException;
import java.util.List;

public class Kata4 {

    public static void main(String[] args) throws IOException {
        MailListReader reader = new MailListReader();
        List<Mail> mails = reader.read("emails.txt");

        MailHistogramBuilder mailHistogramBuilder = new MailHistogramBuilder();
        Histogram<String> histogram = mailHistogramBuilder.build(mails);

        java.awt.EventQueue.invokeLater(() -> {
            new DisplayHistogram("Histogram", histogram).execupte();
        });
    }

}
