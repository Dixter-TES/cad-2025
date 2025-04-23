package ru.bsuedu.cad.lab;

import ru.bsuedu.cad.lab.Impl.CSVParser;
import ru.bsuedu.cad.lab.Impl.ConcreteProductProvider;
import ru.bsuedu.cad.lab.Impl.ConsoleTableRenderer;
import ru.bsuedu.cad.lab.Impl.ResourceFileReader;

public class App {
    public static void main(String[] args) {
        ConcreteProductProvider productProvider = new ConcreteProductProvider();
        ConsoleTableRenderer renderer = new ConsoleTableRenderer();
        CSVParser parser = new CSVParser();
        ResourceFileReader reader = new ResourceFileReader();

        productProvider.setParser(parser);
        productProvider.setReader(reader);

        renderer.setProductProvider(productProvider);

        renderer.render();
    }
}