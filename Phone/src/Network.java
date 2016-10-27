import java.util.ArrayList;

/**
 * Created by svitlana.merezhko on 27.10.16.
 */
public class Network {

    ArrayList<Phone> phonesListInTheNetwork = new ArrayList<Phone>();

    public boolean isPhoneExist(String phone) {

        boolean isExist = false;
        for (Phone i : phonesListInTheNetwork)
            if (i.getNumber() == phone)
                isExist = true;

        if (isExist) return true;
        else return false;
    }

    public boolean isPhoneExist(Phone phone) {
        return  isPhoneExist(phone.getNumber());
    }

    public void addPhone(Phone phone) {
        phonesListInTheNetwork.add(phone);

    }
}
