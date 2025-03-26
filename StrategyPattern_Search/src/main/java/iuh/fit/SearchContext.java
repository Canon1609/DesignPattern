package iuh.fit;

public class SearchContext {
    private SearchStrategy searchStrategy;

    public SearchContext(SearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }

    public void setSearchStrategy(SearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }

    public void search(String query) {
        searchStrategy.search(query);
    }
}
