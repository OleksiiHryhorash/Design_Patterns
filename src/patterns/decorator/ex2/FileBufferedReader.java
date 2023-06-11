package patterns.decorator.ex2;

import patterns.decorator.ex2.interfaces.FileStream;

public class FileBufferedReader extends FileDecorator{
    public FileBufferedReader(FileStream fileStream) {
        super(fileStream);
    }

    @Override
    public void read() {
        fileStream.read();
        System.out.println("Read file in buffer...");
    }
}
