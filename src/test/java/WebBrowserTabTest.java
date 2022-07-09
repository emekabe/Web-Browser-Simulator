import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebBrowserTabTest {

    WebBrowserTab tab1;
    WebBrowserTab tab2;


    @BeforeEach
    void setUp() {
        tab1 = new WebBrowserTabImpl();
        tab2 = new WebBrowserTabImpl();
    }

    @Test
    void letsBrowse(){
        tab1.visitPage("Google");
        tab1.visitPage("Seamfix");
        tab1.visitPage("Amazon");

        assertEquals("Amazon", tab1.viewCurrentPage());

        tab1.goBack();

        assertEquals("Seamfix", tab1.viewCurrentPage());

        tab1.goBack();
        tab1.refresh();

        assertEquals("Google", tab1.viewCurrentPage());
    }

    @Test
    void letsSurfTheInternet(){
        assertEquals("New Tab", tab2.viewCurrentPage());

        tab2.visitPage("YouTube");
        tab2.visitPage("Christ Embassy");
        tab2.visitPage("Online Tutorial School");

        tab2.goBack();
        tab2.goBack();
        tab2.goForward();

        assertEquals("Christ Embassy", tab2.viewCurrentPage());

        assertFalse(tab2.viewHistory().isEmpty());

        tab2.visitPage("Janet Website");
        tab2.visitPage("Jessica's Instagram profile");
        tab2.visitPage("Emeka's Facebook page");
        tab2.visitPage("Cartoon network");
        tab2.visitPage("CNN");
        tab2.visitPage("Mnet");

        tab2.goBack();
        tab2.goBack();
        tab2.goBack();

        tab2.visitPage("Seamfix");

        tab2.goBack();
        assertEquals("Emeka's Facebook page", tab2.viewCurrentPage());

        tab2.clearHistory();
        assertTrue(tab2.viewHistory().isEmpty());
    }
}