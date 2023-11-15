package com.example.designpatterntemplatemethodeexemple;

import com.example.designpatterntemplatemethodeexemple.mt.TemplateClass;
import com.example.designpatterntemplatemethodeexemple.mt.TemplateImpl1;
import com.example.designpatterntemplatemethodeexemple.mt.TemplateImpl2;

public class Client {
    public static void main(String[] args) {
        TemplateClass templateClass=new TemplateImpl1();
        System.out.println(templateClass.templateMethode());
          templateClass=new TemplateImpl2();
        System.out.println(templateClass.templateMethode());
    }
}
