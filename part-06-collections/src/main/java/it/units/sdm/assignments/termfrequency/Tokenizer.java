package it.units.sdm.assignments.termfrequency;

import java.util.Collection;

public interface Tokenizer {

    Collection<String> tokenize(String text);
}
