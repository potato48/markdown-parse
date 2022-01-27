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
    public void testGetLinks() throws IOException {

        Path filename = Path.of("test-file.md");
        String contents = Files.readString(filename);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List expected = List.of("https://something.com", "some-page.html");
        assertEquals(expected, links);
    }

    @Test
    public void testGetLinksTwo() throws IOException {

        Path filename = Path.of("test-file2.md");
        String contents = Files.readString(filename);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List expected = List.of("");
        assertEquals(expected, links);
    }

    @Test
    public void testGetLinksThree() throws IOException {

        Path filename = Path.of("test-file3.md");
        String contents = Files.readString(filename);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List expected = List.of("https://something.com");
        assertEquals(expected, links);
    }

    @Test
    public void testGetLinksFour() throws IOException {

        Path filename = Path.of("test-file4.md");
        String contents = Files.readString(filename);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List expected = List.of("");
        assertEquals(expected, links);
    }
}
