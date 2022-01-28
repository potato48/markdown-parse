import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinksA() throws IOException {

        Path filename = Path.of("test-fileA.md");
        String contents = Files.readString(filename);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> expected = List.of("https://something.com", "some-page.html");
        assertEquals(expected, links);
    }

    @Test
    public void testGetLinksB() throws IOException {

        Path filename = Path.of("test-fileB.md");
        String contents = Files.readString(filename);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> expected = new ArrayList<String>();
        assertEquals(expected, links);
    }

    @Test
    public void testGetLinksC() throws IOException {

        Path filename = Path.of("test-fileC.md");
        String contents = Files.readString(filename);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> expected = List.of("https://something.com");
        assertEquals(expected, links);
    }

    @Test
    public void testGetLinksD() throws IOException {

        Path filename = Path.of("test-fileD.md");
        String contents = Files.readString(filename);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> expected = new ArrayList<String>();
        assertEquals(expected, links);
    }

    @Test
    public void testGetLinksOne() throws IOException {

        Path filename = Path.of("test-file.md");
        String contents = Files.readString(filename);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> expected = List.of("https://something.com", "some-page.html");
        assertEquals(expected, links);
    }

    @Test
    public void testGetLinksTwo() throws IOException {

        Path filename = Path.of("test-file2.md");
        String contents = Files.readString(filename);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> expected = List.of("https://something.com", "some-page.html");
        assertEquals(expected, links);
    }

    @Test
    public void testGetLinksThree() throws IOException {

        Path filename = Path.of("test-file3.md");
        String contents = Files.readString(filename);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> expected = new ArrayList<String>();
        assertEquals(expected, links);
    }

    @Test
    public void testGetLinksFour() throws IOException {

        Path filename = Path.of("test-file4.md");
        String contents = Files.readString(filename);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> expected = new ArrayList<String>();
        assertEquals(expected, links);
    }

    @Test
    public void testGetLinksFive() throws IOException {

        Path filename = Path.of("test-file5.md");
        String contents = Files.readString(filename);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> expected = new ArrayList<String>();
        assertEquals(expected, links);
    }

    @Test
    public void testGetLinksSix() throws IOException {

        Path filename = Path.of("test-file6.md");
        String contents = Files.readString(filename);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> expected = new ArrayList<String>();
        assertEquals(expected, links);
    }

    @Test
    public void testGetLinksSeven() throws IOException {

        Path filename = Path.of("test-file7.md");
        String contents = Files.readString(filename);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> expected = new ArrayList<String>();
        assertEquals(expected, links);
    }

    @Test
    public void testGetLinksEight() throws IOException {

        Path filename = Path.of("test-file8.md");
        String contents = Files.readString(filename);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> expected = new ArrayList<String>();
        assertEquals(expected, links);
    }

}
