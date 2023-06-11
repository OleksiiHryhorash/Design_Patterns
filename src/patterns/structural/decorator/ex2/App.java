package patterns.structural.decorator.ex2;

import patterns.structural.decorator.ex2.interfaces.impl.FileInputReader;
import patterns.structural.decorator.ex2.interfaces.impl.FileStreamReader;
import patterns.structural.decorator.ex2.interfaces.FileStream;

public class App {
    public static void main(String[] args) {
        System.out.println("Original:");
        FileStream fileStreamReader = new FileStreamReader();
        fileStreamReader.read();

        System.out.println("\nWith pattern 'decorator' with first impl:");
        FileStream fileBufferedInputReader = new FileBufferedReader(new FileInputReader());
        fileBufferedInputReader.read();

        System.out.println("\nWith pattern 'decorator' with second impl:");
        FileStream fileBufferedStreamReader = new FileBufferedReader(new FileStreamReader());
        fileBufferedStreamReader.read();
    }
}
