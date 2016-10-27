/**
 * Created by svitlana.merezhko on 27.10.16.
 */
public class Phone {

    private String number;
    private Network network;

    public String getNumber() {
        return number;
    }

    public Phone(String number) {
        this.number = number;
    }

    public Phone() {
    }

    public void Register(Network network) {
        this.network = network;
        network.addPhone(this);
    }

    public void CallTo(String toCall) {
        if (network.isPhoneExist(toCall))
            System.out.println(this.getNumber() + " is calling to " + toCall);
        else
            System.out.println("Phone " + toCall + " doesn't exist in the network");
    }

    public void CallTo(Phone toCall) {
        CallTo(toCall.getNumber());
    }


}
