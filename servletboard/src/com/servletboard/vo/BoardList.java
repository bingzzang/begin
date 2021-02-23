package com.servletboard.vo;

public class BoardList {

	private int currentPage;
	private int pageSize;
	private int totalCount;
	private int totalPage;
	private int startPage;
	private int endPage;
	
	public BoardList(int currentPage, int pageSize, int totalCount) {
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.totalCount = totalCount;
		
		totalPage = ((this.totalCount-1) / pageSize)+1;
		this.currentPage = currentPage> totalPage ? totalPage : currentPage; 
		this.currentPage = currentPage < 1 ? 1 :  currentPage;
		
		startPage = (this.currentPage-1)/10 * 10 +1;
		//currentPage가 11-20일 경우 startPage 11
		
		endPage = startPage+9;
		//engPage는 totalPage보다 작거나 같아야 한다.
		
		endPage = endPage > totalPage ? totalPage : endPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	
}
