package com.tb.blog.web;

import com.github.pagehelper.PageHelper;
import com.tb.blog.bean.Article;
import com.tb.blog.dao.ArticleMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import java.util.List;

@Controller
public class IndexAction {
    @Resource
    private ArticleMapper articleMapper;

    @GetMapping("/")
    public String index(Model model,@RequestParam(defaultValue = "1") int page){
        PageHelper.startPage(page,5);
        model.addAttribute("articleList",articleMapper.selectNew());
        return "index";
    }
    @GetMapping("article")
    public String article(Model model,int id){
        System.out.println(articleMapper.selectById(id));
        model.addAttribute("article",articleMapper.selectById(id));
        return "article";
    }

}
