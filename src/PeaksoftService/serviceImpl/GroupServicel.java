package PeaksoftService.serviceImpl;

import model.Company.Company;
import model.Company.Group;

public class GroupServicel implements GroupService {

    private companyServiceIMPL serviceIMPL;

    public GroupServicel(companyServiceIMPL serviceIMPL) {
        this.serviceIMPL = serviceIMPL;
    }

    @Override
    public Group[] saveGroup(Long companyId, Group... groups) {
        Company company = serviceIMPL.getAllCompanyById(companyId);
        company.setGroups(groups);
        return company.getGroups();
    }

    @Override
    public Group getById(Long id) {
        return null;
    }

    @Override
    public Group[] getAllGroupByCompanyId(Long companyId) {
        return new Group[0];
    }

    @Override
    public Group updateGroupByName(String name, Group group) {
        return null;
    }

    @Override
    public String deleteGroupByCompanyId(Long companyId, Long groupId) {
        return null;
    }
}
