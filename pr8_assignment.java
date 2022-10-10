import java.io.*;

public class pr8_assignment {
    public static void main(String[] args) throws IOException {
        File file = new File("TextReader.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        try (BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            String line;
            int wordCount = 0;
            int charcount = 0;
            int paraCount = 0;
            int wsCount = 0;
            int senCount = 0;

            while ((line = bufferedReader.readLine()) != null) {
                if (line.equals("")) {
                    paraCount += 1;
                } else {
                    charcount += line.length();
                    String words[] = line.split("\\s+");
                    wordCount += words.length;
                    wsCount += wordCount - 1;
                    String sentence[] = line.split("[!?.:]+");
                    senCount += sentence.length;
                }
            }
            if (senCount >= 1) {
                paraCount++;
            }
            System.out.println("Total word count = " + wordCount);
            System.out.println("Total number of sentences = " + senCount);
            System.out.println("Total number of characters = " + charcount);
            System.out.println("Number of paragraphs = " + paraCount);
            System.out.println("Total number of whitespaces = " + wsCount);
        }
    }
}