package com.tb.blog.dao;

import com.tb.blog.bean.Article;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ArticleMapper {
    @Select("select * from article order by createTime desc ")
    List<Article> selectNew();

    @Select("select * from article where id = #{id} ")
    Article selectById(int id);
}
