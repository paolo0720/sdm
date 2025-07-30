package it.units.sdm;

interface Collection {

    int getSize();

    boolean isEmpty();
}

interface MutableCollection {

    void clear();
}

interface List extends Collection, MutableCollection {

    void addElement(Object obj);
}
