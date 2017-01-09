package com.design.creational.factory_method.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализация
 *
 * @author Nicolas Asinovich.
 */
public class Runner {
    public static void main (String[] args) {

        ImageReader reader = ImageReaderFactory.getReader(ImagesTypes.PNG);

        List<ImageReader> readerList = new ArrayList<>();
        readerList.add(ImageReaderFactory.getReader(ImagesTypes.PNG));
        readerList.add(new JpgReader());
        readerList.add(reader);

        for (ImageReader r : readerList) {
            System.out.printf("Created {%s}\n", r.getClass());
            System.out.printf("Created {%s}", r.getClass());
        }

    }
}
