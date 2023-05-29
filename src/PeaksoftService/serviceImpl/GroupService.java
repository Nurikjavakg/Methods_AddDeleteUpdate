package PeaksoftService.serviceImpl;

import model.Company.Group;

public interface GroupService {

    Group[] saveGroup(Long companyId, Group... groups);
    Group getById(Long id);
    Group[] getAllGroupByCompanyId(Long companyId);
    Group updateGroupByName(String name, Group group);
    String deleteGroupByCompanyId(Long companyId, Long groupId);
}
