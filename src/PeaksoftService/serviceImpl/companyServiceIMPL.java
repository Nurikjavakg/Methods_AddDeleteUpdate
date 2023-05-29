package PeaksoftService.serviceImpl;

import PeaksoftService.CompanyService;
import model.Company.Company;

import java.util.Arrays;

public class companyServiceIMPL implements CompanyService {

    private Company[] companies;

    @Override
    public String saveCompany(Company... company) {
        Company[] companies1;
        if(companies==null){
            this.companies=company;
        }else{
            companies1=new Company[companies.length+company.length];
            for (int i = 0; i <companies.length ; i++) {
                companies1[i]=companies[i];

            }
            companies=companies1;
        }
        return "Person successfully saved...";
    }

    @Override
    public Company[] getAllCompanies() {
        return companies;
    }

    @Override
    public Company getAllCompanyById(Long id) {
        for (int i = 0; i < companies.length; i++) {
            if(companies[i].getId()==id){

                return companies[i];
            }


        }
        return null;
    }

    @Override
    public Company updateCompany(Long oldCompany, Company company) {
        Company company1= getAllCompanyById(oldCompany);
        company1.setName(company.getName());
        company1.setCountry(company.getCountry());
        company1.setAddress(company.getAddress());
        company1.setGroups(company.getGroups());
        company1.setStudents(company.getStudents());
        company1.setInstructors(company.getInstructors());
        return company1;
    }

    @Override
    public Company[] deleteCompany(Long id) {
        Company companyById = getAllCompanyById(id);
        for (int i = 0; i < companies.length; i++) {
            if(companies[i].equals(companyById)){
                companies[i]=null;

            }

        }


        return companies;
    }

    @Override
    public String toString() {
        return "companyServiceIMPL{" +
                "companies=" + Arrays.toString(companies) +
                '}';
    }
}
