import PeaksoftService.CompanyService;
import PeaksoftService.serviceImpl.GroupServicel;
import PeaksoftService.serviceImpl.companyServiceIMPL;
import model.Company.Company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        CompanyService companyService = new companyServiceIMPL();
        companyService.saveCompany(new Company(1l,"Peaksoft","KG", "isanova 324"),
                new Company(345l,"Olol","KG","bokonbaeva 45"));

        System.out.println(Arrays.toString(companyService.getAllCompanies()));

        System.out.println(companyService.getAllCompanyById(1l));
        System.out.println();

        System.out.println(companyService.updateCompany(1l, new Company(2l, "Baatyr", "USE", "isanova 45")));

        System.out.println();
        System.out.println(companyService.getAllCompanyById(1l));
        System.out.println("delete:");
        System.out.println(companyService.deleteCompany(1l));

        GroupServicel groupServicel = new GroupServicel((companyServiceIMPL);

    }


    }


















// CRUD
//C create
//R read
//U update
//D delete