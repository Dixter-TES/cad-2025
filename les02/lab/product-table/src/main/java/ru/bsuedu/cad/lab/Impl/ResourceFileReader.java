package ru.bsuedu.cad.lab.Impl;

import ru.bsuedu.cad.lab.Reader;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class ResourceFileReader implements Reader {
    @Override
    public String read() {
        URL path = ClassLoader.getSystemResource("product.csv");

        try {
            return Files.readString(Path.of(path.toURI()));
        }
        catch (Exception ignored) {

        }

        return null;
    }
}
