package com.gfkl.adventofcode;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class PasswordChecker
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Solution Part One is: " + checkRangePasswords("src/main/resources/input"));
        System.out.println( "Solution Part Two is: " + checkPositionsPasswords("src/main/resources/input"));
    }

    public static long checkRangePasswords(String filePath) throws IOException {
        Stream<String> stream = Files.lines(Paths.get(filePath));
        return stream.map(PasswordValidator::createRangePassword).filter(PasswordValidator::isValid).count();
    }

    public static long checkPositionsPasswords(String filePath) throws IOException {
        Stream<String> stream = Files.lines(Paths.get(filePath));
        return stream.map(PasswordValidator::createPositionsPassword).filter(PasswordValidator::isValid).count();
    }

}


