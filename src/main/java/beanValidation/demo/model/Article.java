package beanValidation.demo.model;

import javax.validation.constraints.Pattern;

public class Article  {
    //Constraint: Alpha Numeric article titles only using a regular expression
    @Pattern(regexp = "[a-zA-Z0-9 ]")
    private String articleTitle;
    public String getArticleTitle()  {
        return  articleTitle;
    }
    public void setArticleTitle(String  articleTitle)  {
        this.articleTitle  =  articleTitle;
    }

}
