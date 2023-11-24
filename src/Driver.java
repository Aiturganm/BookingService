public enum Driver {

    NURISLAM("0777100200", 20),
    AJYBEK("0777100201", 21),
    NURLAN("0771004200", 19),
    MIRLAN("0555700042", 23),
    JIGIT("0555402010", 21),
    NURCAMIL("0551123742", 24),
    ALIASKAR("0505102475", 31);
    public String number;
    public int age;

    Driver(String number, int age) {
        this.number = number;
        this.age = age;
    }

}
