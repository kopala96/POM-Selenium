package DataObject;

import com.github.javafaker.Faker;

public class LogInData {
    static Faker faker1 = new Faker();
    public static String
            incorrectEmail = "mariami",
            incorrectPwd = "blablabla",
            IncorrectEmail1 = faker1.bothify("????##?@gmail.com"),
            incorrectpwd1 = faker1.bothify("????##?"),
            adress1 = faker1.address().city(), //adressis shemdeg citys nacvlad bevri opshenia country da ase shemdeg
            firstname1 = faker1.name().firstName(), //aqac names nacvlad shegvidzlia lastname da bevri ram

            firstname2 = "mariami",
            lastname = "kopaleishvili",
            email1 = faker1.bothify("????##?@gmail.com"),  //?- nishnavs asoebi # nishnavs ricxvs
            phone1 = faker1.phoneNumber().phoneNumber(),
            pwd12 = "kopalakopala12",
            confirmPwd = "kopalakopala12";
}




