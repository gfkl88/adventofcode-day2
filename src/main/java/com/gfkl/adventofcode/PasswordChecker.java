package com.gfkl.adventofcode;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class PasswordChecker
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Solution Part One is: " + checkPasswords("src/main/resources/input"));
    }

    public static long checkPasswords(String filePath) throws IOException {
        Stream<String> stream = Files.lines(Paths.get(filePath));
        return stream.map(Password::new).filter(Password::isValid).count();
    }
}
