package lesson9.utils;

/**
 * Created by Паша on 10.08.2017.
 */
public class Checker {
    //public
    //private
    //default (package-private)
    //protected

    //private
    //default (package-private)
    //protected
    //public


    int companyNamesValidatedCount = 0;


    public boolean checkCompanyName(String companyName) {
        //  if (companyName != "Google" && companyName != "Amazon")
        //     return false;
        //  return true;
        if (companyNamesValidatedCount > 10)
            return false;
        companyNamesValidatedCount++;
        return companyName != "Google" && companyName != "Amazon";
    }
}
