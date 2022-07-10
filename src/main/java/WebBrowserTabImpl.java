import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class WebBrowserTabImpl implements WebBrowserTab{

    private Stack<String> backStack;
    private Stack<String> forwardStack;

    private String currentPage;

    private static final String TAB_HOME_PAGE_IDENTIFIER = "New Tab";

    private static final List<String> history = new ArrayList<>();

    public WebBrowserTabImpl() {
        backStack = new Stack<>();
        forwardStack = new Stack<>();
        currentPage = TAB_HOME_PAGE_IDENTIFIER;
    }

    @Override
    public void visitPage(String page) {
        backStack.add(currentPage);
        currentPage = page;
        history.add(page);
        forwardStack.clear();
    }

    @Override
    public String viewCurrentPage() {
        return currentPage;
    }

    @Override
    public void goBack() {
        if (!backStack.isEmpty()){
            forwardStack.add(currentPage);
            currentPage = backStack.pop();
        } else {
            System.out.println("Can't go backward");
        }
    }

    @Override
    public void goForward() {
        if (!forwardStack.empty()){
            backStack.add(currentPage);
            currentPage = forwardStack.pop();
        } else {
            System.out.println("Can't go forward");
        }
    }

    @Override
    public void refresh() {
        // Already done for now
    }

    @Override
    public List<String> viewHistory() {
        return history;
    }

    @Override
    public void clearHistory() {
        history.clear();
    }
}
