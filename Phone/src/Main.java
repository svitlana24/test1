/**
 * Created by svitlana.merezhko on 27.10.16.
 */
public class Main {
    public static void main(String[] args) {

        Network lifecell = new Network();
        Phone myphone = new Phone("0992888268");
        System.out.println(lifecell.isPhoneExist(myphone));
        myphone.Register(lifecell);
        Phone myphone2 = new Phone("0992888268");
        System.out.println(lifecell.isPhoneExist(myphone));
        System.out.println(lifecell.isPhoneExist(myphone2));

        myphone.CallTo("0662801388");

        System.out.println(lifecell.isPhoneExist("0979472420"));
        Phone lerasphone = new Phone("0979472420");
        lerasphone.Register(lifecell);
        System.out.println(lifecell.isPhoneExist("0979472420"));
        myphone.CallTo(lerasphone);
        lerasphone.CallTo(myphone);




    }
}
