/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.sum.grade;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Student[] studentArray=new Student[5];
        Student s1=new Student();
        s1.setName("Xaoi");
        s1.setScores(400);
        
        Student s2=new Student();
        s2.setName("Mu");
        s2.setScores(450);
        
        Student s3=new Student();
        s3.setName("Hao");
        s3.setScores(480);
        
        Student s4=new Student();
        s4.setName("Yao");
        s4.setScores(420);
        
        Student s5=new Student();
        s5.setName("Ame");
        s5.setScores(410);
        
        studentArray[0]=s1;
        studentArray[1]=s2;
        studentArray[2]=s3;
        studentArray[3]=s4;
        studentArray[4]=s5;
        double totalscores=0;
       for(int i=0;i<5;i++){
           totalscores+=studentArray[i].getScores();
           System.out.println("Name:"+studentArray[i].getName());
           System.out.println("Scores:"+studentArray[i].getScores());
           
           
     
       
       
    }
        System.out.println(totalscores);
    }
}
