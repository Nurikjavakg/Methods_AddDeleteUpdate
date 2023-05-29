package PeaksoftService;

import model.Company.Company;

public interface CompanyService {

    //crud
    //create - createCompany();
    String saveCompany(Company... company);
    // R - getAllCompanies();
    Company[] getAllCompanies();
    Company getAllCompanyById(Long id);
// U updat
    Company updateCompany(Long oldCompany, Company company);
    Company[] deleteCompany(Long id);


}