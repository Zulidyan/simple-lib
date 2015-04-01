package simpleLib;

//context class
public class SearchContext {
	
	private SearchStrategy strategy;
	
	public void setSearchStrategy(SearchStrategy strategy){
		this.strategy = strategy;
	}
	
	public void doSearch(){
		strategy.search();
	}

}
