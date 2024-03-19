
package cn.scikth.utils;

import java.util.List;

/**
 * <p>分页处理类 .</p>
 *
 *
 */
public class Page<T> {
	/**
	 * 当前页 .
	 */
    private Integer currPage;
    /**
     * 总记录数 .
     */
    private Integer totalCount;
    /**
     * 每页行数 .
     */
    private Integer pageSize;
    /**
     * 页面的总数  .
     */
    private Integer pageCount;
    /**
     * 结果集中数据的起始位置  .
     */
    private Integer start;
    /**
     * List 集合.
     */
    private List<T> list;

    public Page() {

    }
    public Page(int currPage, Integer pageSize, Integer totalCount) {

        this.currPage = currPage;//当前页码
        this.totalCount = totalCount;//总记录数
        this.pageSize = pageSize;//页码容量

        if(this.totalCount>0){
            //总页数=总记录数total/pageSize（+1）
            this.pageCount = (this.totalCount + this.pageSize - 1) /this.pageSize;
        }else{
            this.pageCount = 1;
        }
        //判断当前页
        if(this.currPage<1){
            this.currPage = 1;
        }else if(this.currPage > this.pageCount){
            this.currPage = this.pageCount;
        }
        //下标起始位置：(curPage-1)*pageSize
        this.start = (this.currPage-1)*this.pageSize;
    }

    public Integer getStart() {
        return start;
    }

    public Integer getCurrPage() {
        return currPage;
    }

    public void setCurrPage(Integer currPage) {
        this.currPage = currPage;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
