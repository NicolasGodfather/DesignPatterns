package com.design.creational.factory_method.example2;

/**
 * Реализация
 *
 * @author Nicolas Asinovich.
 */
public class ImageReaderFactory {

    public static ImageReader getReader(ImagesTypes types) {

//        if (types == ImagesTypes.JPG) {
//            return new JpgReader();
//        } else if (types == ImagesTypes.PNG) {
//            return new PngReader();
//        } else throw new IllegalArgumentException("Unknown type image");

        switch (types) {
            case JPG:
                return new JpgReader();
            case PNG:
                return new PngReader();
            default:
                throw new IllegalArgumentException("Unknown type image");
        }

    }
}
