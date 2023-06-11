package patterns.structural.decorator.ex2.interfaces.impl;

import patterns.structural.decorator.ex2.interfaces.FileStream;

public class FileStreamReader implements FileStream {
    @Override
    public void read() {
        System.out.println("Read file...");
    }
}
