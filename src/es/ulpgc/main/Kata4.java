package es.ulpgc.main;

import es.ulpgc.view.DisplayHistogram;
import es.ulpgc.view.MailHistogramBuilder;
import es.ulpgc.view.MailListReader;
import es.ulpgc.model.Histogram;
import es.ulpgc.model.Mail;

import java.io.IOException;
import java.util.List;

public class Kata4 {

    public static void main(String[] args) throws IOException {
        new Kata4().execute();
    }

    public void execute() throws IOException {
        List<Mail> input = input();
        Histogram<String> process = process(input);
        output(process);
    }

    private List<Mail> input() throws IOException {
        MailListReader reader = new MailListReader();
        return reader.read("emails.txt");
    }

    private Histogram<String> process(List<Mail> mails) {
        MailHistogramBuilder mailHistogramBuilder = new MailHistogramBuilder();
        return mailHistogramBuilder.build(mails);
    }

    private void output(Histogram<String> process) {
        java.awt.EventQueue.invokeLater(() -> {
            new DisplayHistogram("Histogram", process).execute();
        });
    }

}
