package es.ulpgc;

import es.ulpgc.domain.Histogram;
import es.ulpgc.domain.Mail;

import java.util.List;

public class MailHistogramBuilder {

    public Histogram<String> build(List<Mail> mails) {
        Histogram<String> histogram = new Histogram<>();
        mails.forEach(m -> histogram.increment(m.getDomain()));
        return histogram;
    }

}
