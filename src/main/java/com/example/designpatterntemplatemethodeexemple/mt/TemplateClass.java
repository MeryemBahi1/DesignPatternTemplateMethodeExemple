package com.example.designpatterntemplatemethodeexemple;

public abstract class TemplateClass {
    public double templateMethode(){
        int n=operation1();
        double somme=0;
        for(int i = 0; i < n; i++){
            somme+=Operation2(i);
        }
        return somme;
    }

    protected abstract double Operation2(int i);

    protected abstract int operation1();
}
