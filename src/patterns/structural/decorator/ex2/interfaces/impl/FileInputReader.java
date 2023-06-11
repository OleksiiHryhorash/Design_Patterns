package patterns.structural.decorator.ex2.interfaces.impl;

import patterns.structural.decorator.ex2.interfaces.FileStream;

public class FileInputReader implements FileStream {
    @Override
    public void read() {
        System.out.println("Read input file...");
    }
}
