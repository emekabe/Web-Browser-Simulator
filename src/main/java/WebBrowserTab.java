import java.util.List;

public interface WebBrowserTab {

    void visitPage(String page);

    String viewCurrentPage();

    void goBack();

    void goForward();

    void refresh();

    List<String> viewHistory();

    void clearHistory();

}
