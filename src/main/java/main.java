import org.apache.commons.io.FileUtils;
import org.apache.commons.io.output.StringBuilderWriter;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.List;


public class main {
    public static void main(String[] args) {

        int totalWords = 0;
        int totalLine = 0;
        int qaCount = 0;
        int qualityCount = 0;
        int casesCount = 0;
        int ToCount = 0;
        String[] wordsArr;
        File input = new File("src/main/resources/input.txt");
        File output = new File("src/main/resources/output.txt");
        try {
            List<String> line = FileUtils.readLines(input);
             totalLine= line.size();
            for (String word : line) {
                String[] words = word.split("\\s+");
                totalWords += words.length;
            }
                qaCount += StringUtils.countMatches(line.toString(), "QA");
                qualityCount += StringUtils.countMatches(line.toString(), "Quality");
                casesCount += StringUtils.countMatches(line.toString(), "cases");
                ToCount += StringUtils.countMatches(line.toString(),"to");

            System.out.println("To = " + ToCount);
            System.out.println("QA = " + qaCount);
            System.out.println("Cases = " + casesCount);
            System.out.println("Quality = " + qualityCount);
            System.out.println("Total line count: " + totalLine);
            System.out.println("Total words count: " + totalWords);
            FileUtils.writeStringToFile(output, "To =" + ToCount + "\n" + "QA = " + qaCount +"\n" + "Cases = " + casesCount +"\n" +"Quality = " + qualityCount);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
