package lesson9.utils;


import lesson9.Company;

/**
 * Created by Паша on 10.08.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Checker checker = new Checker();
        System.out.println(checker.companyNamesValidatedCount);
        Company company = new Company("ibm", "ukr");


    }
}
