package com.sun40.fakedata.provider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ResourceLoader {

    // TODO: make it package-private
    public static List<String> getResource(Locale locale, String resourceName) {
        return readResource(locale.getLanguage() + File.separator + resourceName);
    }

    private static List<String> readResource(String path) {
        File file = getFile(path);
        try {
            List<String> data = new ArrayList<String>();
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                data.add(line);
            }
            return data;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static File getFile(String path) {
        URL url = ResourceLoader.class.getClassLoader().getResource(path);
        if (url == null) {
            throw new IllegalArgumentException("Resources for current locale does not exists " + path);
        }
        return new File(url.getFile());
    }

}
