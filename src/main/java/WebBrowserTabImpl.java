import java.util.List;

public class WebBrowserTabImpl implements WebBrowserTab{

    // TODO: Create two stacks to keep track of the web navigation
    // TODO: Create variable (String) for current page
    // TODO: Create array list for history (static)

    private String currentPage;

    public WebBrowserTabImpl() {
        // TODO: Initialize stack objects and page variable here
    }

    @Override
    public void visitPage(String page) {
        // TODO: Implement this
    }

    @Override
    public String viewCurrentPage() {
        // TODO: Implement this
        return null;
    }

    @Override
    public void goBack() {
        // TODO: Implement this
    }

    @Override
    public void goForward() {
        // TODO: Implement this
    }

    @Override
    public void refresh() {
        // Already done for now
    }

    @Override
    public List<String> viewHistory() {
        // TODO: Implement this
        return null;
    }

    @Override
    public void clearHistory() {
        // TODO: Implement this
    }
}
