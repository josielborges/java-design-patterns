package br.com.josielborges.designpatterns.factory.example1;

import com.sun.imageio.plugins.gif.GIFImageReader;
import com.sun.imageio.plugins.jpeg.JPEGImageReader;

import javax.imageio.ImageReader;
import javax.imageio.spi.ImageReaderSpi;

public class ImageReaderFactory {
    public static ImageReader createImageReader(ImageReaderSpi iisp) {
        if (iisp.toString().equals("GIF")) {
            return new GIFImageReader(iisp);
        } else if (iisp.toString().equals("JPEG")) {
            return new JPEGImageReader(iisp);
        } else {
            throw new IllegalArgumentException("Unknown image type.");
        }
    }
}