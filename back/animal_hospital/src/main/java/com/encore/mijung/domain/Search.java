package com.encore.mijung.domain;

public class Search {
	String searchContent;
	int page;
	
	public Search() {}
	
	public Search(String searchContent, int page) {
		this.searchContent = searchContent;
		this.page = page;
	}

	public String getSearchContent() {
		return searchContent;
	}

	public void setSearchContent(String searchContent) {
		this.searchContent = searchContent;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}
	
	@Override
	public String toString() {
		return "Search [searchContent=" + searchContent + ", page=" + page + "]";
	}
	
	
}
