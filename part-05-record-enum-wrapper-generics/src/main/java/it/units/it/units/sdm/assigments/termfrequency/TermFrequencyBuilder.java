package it.units.it.units.sdm.assigments.termfrequency;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class TermFrequencyBuilder {

    private Tokenizer tokenizer;
    private Normalizer normalizer;
    private Filter filter;

    public void setTokenizer(Tokenizer tokenizer) {
        this.tokenizer = tokenizer;
    }

    public void setNormalizer(Normalizer normalizer) {
        this.normalizer = normalizer;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    TermFrequency build(String text) {
        Collection<String> tokens = tokenizer.tokenize(text);
        Map<String, Integer> map = new HashMap<>();
        for (String term : tokens) {
            term = normalizer.normalize(term);
            if (filter.accept(term)) {
                map.merge(term, 1, new BiFunction<>() {
                    @Override
                    public Integer apply(Integer v, Integer d) {
                        return v + 1;
                    }
                });
            }
        }
        return new TermFrequency(map);
    }
}
