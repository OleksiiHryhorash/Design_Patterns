package patterns.structural.decorator.ex2;


import patterns.structural.decorator.ex2.interfaces.FileStream;

public abstract class FileDecorator implements FileStream {
    FileStream fileStream;

    public FileDecorator(FileStream fileStream) {
        this.fileStream = fileStream;
    }
}
