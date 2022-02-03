
// File reading code from https://howtodoinjava.com/java/io/java-read-file-to-string-examples/
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {
    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then take up to
        // the next )
        int currentIndex = 0;
        int iterationLimit = 0;

        // add buffer to markdown string
        markdown = "   " + markdown;

        while (currentIndex < markdown.length() && iterationLimit < 30) {
            // System.out.println("Start: " + currentIndex);
            int nextOpenBracket = markdown.indexOf("[", currentIndex);
            if (nextOpenBracket == -1) {
                break;
            }
            int nextCloseBracket = markdown.indexOf("]", nextOpenBracket);
            if (nextCloseBracket == -1) {
                break;
            }
            int openParen = markdown.indexOf("(", nextCloseBracket);
            if (openParen == -1 || openParen != nextCloseBracket + 1) {
                break;
            }
            int closeParen = markdown.indexOf(")", openParen);
            if (closeParen == -1) {
                break;
            }

            if (markdown.substring(nextOpenBracket - 1, nextOpenBracket).contains("!")) {
                break;
            }
            int startOfURL = markdown.substring(openParen, closeParen).indexOf("https");
            if (startOfURL > 0) {
                openParen = openParen + startOfURL - 1;
            }
            if (markdown.substring(openParen, closeParen).contains(".html") ||
                    markdown.substring(openParen, closeParen).contains("https")) {
                toReturn.add(markdown.substring(openParen + 1, closeParen));
            }

            currentIndex = closeParen + 1;
            // System.out.println("End: " + currentIndex);
            iterationLimit++;

        }
        return toReturn;
    }

    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String contents = Files.readString(fileName);
        ArrayList<String> links = getLinks(contents);
        System.out.println(links);
    }
}