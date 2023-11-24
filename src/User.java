import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class User extends Bank{
    private String name;
    private String email;
    private String address;
    private long phoneNumber;
    private String password;
    public User(){}

    public User(String name, String email, String password, String address, long phoneNumber, BigDecimal balance) {
        super(balance);
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty()) {
            this.name = name;
        }else {
            String nn;
            do{
                System.out.println("Имя не должно быть пустым");
                System.out.println("Введите имя:");
                nn = new Scanner(System.in).nextLine();
            }while (nn.isEmpty());
            this.name = name;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.contains("@gmail.com")) {
            this.email = email;
        }else{
            String ee;
            do{
                System.out.println("Электронная почта должна содержать @gmail.com");
                System.out.println("Введите емайл: ");
                ee = new Scanner(System.in).nextLine();
            }while(!ee.contains("@gmail.com"));
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(!address.isEmpty()) {
            this.address = address;
        }else{
            String aa;
            do{
                System.out.println("Адрес не может быть пустым");
                System.out.println("Введите адрес:");
                aa = new Scanner(System.in).nextLine();
            }while (aa.isEmpty());
        }
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
            this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length()>=4) {
            this.password = password;
        }else {
            String pp;
            do{
                System.out.println("Длина пароля должна быть больше 4");
                System.out.println("Введите пароль");
                pp = new Scanner(System.in).nextLine();
            }while(pp.length()<4);
        }
    }



    public static User register(User user){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        user.setName(scanner.nextLine());
        System.out.print("Введите емайл: ");
        user.setEmail(scanner.nextLine());
        System.out.print("Введите пароль: ");
        user.setPassword(scanner.nextLine());
        System.out.print("Введите адрес: ");
        user.setAddress(scanner.nextLine());
        System.out.print("Введите номер телефона: ");
        user.setPhoneNumber(scanner.nextLong());
        System.out.print("Внесите оплату на счет: ");
        user.setBalance(new Scanner(System.in).nextBigDecimal());
        System.out.println("\nРегистрация прошла успешно!✅");
        return user;
    }

    public BigDecimal pay(BigDecimal price, BigDecimal balance){
        setBalance(balance.subtract(price));
        return getBalance();
    }

    public BigDecimal deposit(BigDecimal deposit){
         setBalance(getBalance().add((deposit)));
         return getBalance();
    }

    public static User[] addUserToArray(User[] users, User registerUser) {
        User[] newArray = Arrays.copyOf(users, users.length + 1);
        newArray[newArray.length - 1] = registerUser;
        return newArray;
    }

    public static User login(User[] users){
        Scanner scanner = new Scanner(System.in);
        boolean isTruee = false;
        System.out.println("Введите емайл: ");
        String email = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();

        for (User user : users) {
            if(user.getEmail().equals(email) && user.getPassword().equals(password)){
                System.out.println("ВХОД ПРОШЕЛ УСПЕШНО!✅\n");
                isTruee = true;
                return user;
            }
        }
        if(isTruee != true) {
            System.out.println("ВХОД НЕ УДАЛСЯ!🚫");
        }
        return null;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", password='" + password + '\'' +
                "} " + super.toString();
    }
}
