package com.telusko.OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg = new Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory sf = cfg.buildSessionFactory();
       Session ses = sf.openSession();
       Transaction tx = ses.beginTransaction();
       Students s = new Students(101,"Zakir hussain","Civil",76);
       Students s1 = new Students(102,"veeranji","EEE",75);
       Students s2 = new Students(103,"Naresh","Msc",70);
       Students s3 = new Students(104,"Afreed","EEE",80);
       ArrayList<Students> al = new ArrayList<Students>();
       al.add(s);
       al.add(s1);
       al.add(s2);
       al.add(s3);
       CollegeAddress ca = new CollegeAddress("Aits","New boyanapally","kadpa","Ap",516002);
       ca.setStudent(al);
       ses.save(ca);
       tx.commit();
       System.out.println(ses);
       System.out.println("Inserted Succesfully");
    }
}
