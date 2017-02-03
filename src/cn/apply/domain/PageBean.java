package cn.apply.domain;


public class PageBean {
	// 指定的或是页面参赛
	private int currentPage; // 当前页
	private int pageSize; // 每页显示多少条
	// 查询数据库
	private int recordCount; // 总记录数	
	// 计算
	private int pageCount; // 总页数
	private int beginPageIndex; // 页码列表的开始索引
	private int endPageIndex; // 页面列表的结束索引
			
/*	public PageBean(int currentPage, int pageSize, int recordCount) {
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.recordCount = recordCount;
		// 计算总页码
		pageCount = (recordCount + pageSize - 1) / pageSize;
		beginPageIndex = (currentPage-1)*pageSize+1;
		endPageIndex = beginPageIndex+pageSize;
	}*/

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

	public int getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}


	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getBeginPageIndex() {
		return beginPageIndex;
	}

	public void setBeginPageIndex(int beginPageIndex) {
		this.beginPageIndex = beginPageIndex;
	}

	public int getEndPageIndex() {
		return endPageIndex;
	}

	public void setEndPageIndex(int endPageIndex) {
		this.endPageIndex = endPageIndex;
	}

}
