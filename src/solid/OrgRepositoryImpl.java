package solid;

import java.util.ArrayList;
import java.util.List;

//Liskvos
public class OrgRepositoryImpl implements OrgRepository{
    List<User> peopleCount = new ArrayList<>();
    @Override
    public int getPeopleCount() {
        return peopleCount.size();
    }

    @Override
    public void savePeople(User user) {
        peopleCount.add(user);
    }
}
