package com.tb.blog.bean;

public class Category {
    private Integer id;
    private String name;//栏目名称
    private Integer sort;//排序号
    private String introduce;//栏目说明

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sort=" + sort +
                ", introduce='" + introduce + '\'' +
                '}';
    }
}
