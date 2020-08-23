package com.tb.blog.bean;

import java.sql.Timestamp;

public class Article {
    private Integer id;
    private String author;//作者
    private String title;//标题
    private String content;//内容
    private String keywords;//关键字
    private String description;//描述
    private Integer categoryid;//栏目
    private String label;//标签，用逗号分隔
    private String titleimgs;//标题图片列表
    private String status;//状态
    private Timestamp createtime;//发布时间
    private Integer readcnt;//阅读量
    private Integer agreecnt;//点赞数

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getTitleimgs() {
        return titleimgs;
    }

    public void setTitleimgs(String titleimgs) {
        this.titleimgs = titleimgs;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public Integer getReadcnt() {
        return readcnt;
    }

    public void setReadcnt(Integer readcnt) {
        this.readcnt = readcnt;
    }

    public Integer getAgreecnt() {
        return agreecnt;
    }

    public void setAgreecnt(Integer agreecnt) {
        this.agreecnt = agreecnt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", keywords='" + keywords + '\'' +
                ", description='" + description + '\'' +
                ", categoryid=" + categoryid +
                ", label='" + label + '\'' +
                ", titleimgs='" + titleimgs + '\'' +
                ", status='" + status + '\'' +
                ", createtime=" + createtime +
                ", readcnt=" + readcnt +
                ", agreecnt=" + agreecnt +
                '}';
    }
}
