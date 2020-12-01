package com.solvd.lab.v2.automation.sshukalovich.io;


import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class JsonIO<T> {
    private Class<T> clasz;
    private final static Gson GSON =
            new GsonBuilder().setPrettyPrinting()
                    .serializeNulls()
                    .create();

    public JsonIO(Class<T> clasz) {
        this.clasz = clasz;
    }

    public void write(T obj, String pathTo) throws IOException {
        Writer writer = new FileWriter(pathTo);
        GSON.toJson(obj, writer);
        writer.flush();
        writer.close();
    }

    public T read(String pathTo) throws IOException {
        return (T) GSON.fromJson(new FileReader(pathTo), clasz);
    }
}
