package patterns.decorator.ex2;

import patterns.decorator.ex2.interfaces.FileStream;
import patterns.decorator.ex2.interfaces.impl.FileInputReader;
import patterns.decorator.ex2.interfaces.impl.FileStreamReader;

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
