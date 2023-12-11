import com.solvd.foodDelivery.order.FoodDelivery;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.List;


public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

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

            LOGGER.info("To = " + ToCount);
            LOGGER.info("QA = " + qaCount);
            LOGGER.info("Cases = " + casesCount);
            LOGGER.info("Quality = " + qualityCount);
            LOGGER.info("Total line count: " + totalLine);
            LOGGER.info("Total words count: " + totalWords);
            FileUtils.writeStringToFile(output, "To =" + ToCount + "\n" + "QA = " + qaCount +"\n" + "Cases = " + casesCount +"\n" +"Quality = " + qualityCount);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
