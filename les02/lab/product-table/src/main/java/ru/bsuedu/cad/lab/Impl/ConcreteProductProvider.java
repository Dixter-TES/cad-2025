package ru.bsuedu.cad.lab.Impl;

import ru.bsuedu.cad.lab.*;

import java.util.List;

public class ConcreteProductProvider implements ProductProvider {
    private Reader reader;
    private Parser parser;

    @Override
    public List<Product> getProducts() {
        return parser.parse(reader.read());
    }

    public Parser getParser() {
        return parser;
    }

    public void setParser(Parser parser) {
        this.parser = parser;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }
}
