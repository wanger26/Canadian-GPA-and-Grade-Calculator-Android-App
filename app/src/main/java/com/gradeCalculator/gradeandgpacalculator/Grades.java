package com.gradeCalculator.gradeandgpacalculator;

import java.util.Iterator;
import java.util.LinkedList;

public class Grades {
    private LinkedList <Grade> grades;
    public Grades (){
        this.grades=new LinkedList<Grade>();
    }
    public void addGrade (Grade grade){
        this.grades.add(grade);
    }
    public int getSize(){
        return this.grades.size();
    }
    public Iterator<Grade> getIterator(){
        return this.grades.iterator();
    }
}
