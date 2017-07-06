package com.my.examples.file;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PrettyPrinter {
    private static List<String> fileNames = new ArrayList<>();
    
    //To set the list of filenames.
    public PrettyPrinter( List<String> fileNames) {
        this.fileNames = fileNames;
    }
    //Get the list of file names.
    public static List<String> getFileNames() {
        return fileNames;
    }
    //Set the file names.
    public static void setFileNames(List<String> fileNames) {
        PrettyPrinter.fileNames = fileNames;
    }
    //set the prettyprint.
    public static String prettyPrint() {
        if(fileNames.isEmpty()){
            return "***   NOTHING TO PRINT!   ***";
        }
        
        final int PADDING_RIGHT = 3;
        final String TEST_PACK_GAP = "\n\n";
        
        final int MAX_LENGTH = Collections.max(fileNames, Comparator.comparing(s -> s.length())).length() + PADDING_RIGHT;
        
        final String DOTTED_LINE = dottedLine(MAX_LENGTH);
    
        final String printableReport = tabledReport(MAX_LENGTH, DOTTED_LINE);
    
        // ----------------
        // Reset the report
        // ----------------
        resetReport();
        
        return "\n" + DOTTED_LINE + printableReport + TEST_PACK_GAP;
    }
    
    @Override
    public String toString() {
        return "TestReport{" +
               "fileNames=" + fileNames +
               '}';
    }
    //print in a tablereport format.
    private static String tabledReport(int maxLength, String dottedLine) {
        return fileNames.stream().map(testResult -> {
            
                String spaces = extraSpaces(maxLength, testResult);
                
                return "\n| " + testResult + spaces + "|" + "\n" + dottedLine;
            
            }).collect(Collectors.joining(" "));
    }
    //Extra spaces in the table.
    private static String extraSpaces(int maxLength, String testResult) {
        String spaces = "";
        for (int i = testResult.length(); i < maxLength-1; i++) {
            spaces = spaces + " ";
        }
        return spaces;
    }
    //Dotted lines in the table.
    private static String dottedLine(int maxLength) {
        String dottedLine = " ";
        for (int i = 0; i < maxLength; i++) {
            dottedLine = dottedLine + "-";
        }
        return dottedLine;
    }
    //Reset the report.
    private static void resetReport() {
        PrettyPrinter.getFileNames().clear();
    }
    
}
