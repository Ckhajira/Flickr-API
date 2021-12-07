
package com.example.techmarket.models;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Photos {

    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("pages")
    @Expose
    private Integer pages;
    @SerializedName("perpage")
    @Expose
    private Integer perpage;
    @SerializedName("total")
    @Expose
    private Integer total;


    /**
     * No args constructor for use in serialization
     * 
     */
    public Photos() {
    }

    /**
     * 
     * @param perpage
     * @param total
     * @param pages

     * @param page
     */
    public Photos(Integer page, Integer pages, Integer perpage, Integer total) {
        super();
        this.page = page;
        this.pages = pages;
        this.perpage = perpage;
        this.total = total;

    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getPerpage() {
        return perpage;
    }

    public void setPerpage(Integer perpage) {
        this.perpage = perpage;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }


}
