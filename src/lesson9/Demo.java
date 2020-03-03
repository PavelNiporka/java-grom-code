package lesson9;

import lesson9.utils.Checker;

/**
 * Created by Паша on 10.08.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Company company = new Company("qwe", "qqe");
        //  System.out.println(company.countryFounded);
        System.out.println(company.getName());

        //  company.name = "NewValue";

        //  company.name = "IBM";

        Checker checker = new Checker();
        //  System.out.println(checker.checkCompanyName(company.name));
        //System.out.println(checker.companyNamesValidatedCount);

    }


}
