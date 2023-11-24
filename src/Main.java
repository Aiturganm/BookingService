import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User[] users = new User[0];
        User currentUser = null;
        boolean isTrue = true;
        boolean isBooked1 = false;
        boolean isBooked2 = false;
        boolean isBooked3 = false;
        boolean isBooked4 = false;
        boolean isBooked5 = false;
        boolean isBooked6 = false;
        boolean isBooked7 = false;
        OuterLoop:
        while(true){
            System.out.println("""
                    
                    🙌 ДОБРО ПОЖАЛОВТЬ! 🙌
                    1.®️ РЕГИСТРАЦИЯ
                    2.🧾 ЛОГИН
                    3.⬅️ ВЫЙТИ
                    """);
            switch (scanner.nextLine().toLowerCase()){
                case "1", "регистрация" : {
                    User newUser = User.register(new User());
                    users = User.addUserToArray(users, newUser);
                    break;
                }
                case "2", "логин" : {
                    User loginedUser = User.login(users);
                    currentUser = loginedUser;
                    InnerLoop:
                    while (true){
                        if(currentUser!=null){
                        System.out.println("""
                                ДОСТУПНЫЕ МАШИНЫ:
                                1. FERRARI - ЦЕНА: $800.0
                                2. HONDA - ЦЕНА: $500.0
                                3. MERS - ЦЕНА: $800.0
                                4. TOYOTA - ЦЕНА: $400.0
                                5. KIA - ЦЕНА: $350.0
                                6. AUDI - ЦЕНА: $900.0
                                7. BMW - ЦЕНА: $950.0
                                
                                ВАШ ВЫБОР(0 чтобы вернуться в главное меню):
                                """);
                        switch (new Scanner(System.in).nextLine().toLowerCase()) {
                            case "0": {
                                break InnerLoop;
                            }
                            case "1", "ferrari": {
                                if (isBooked1 == false) {
                                    Managment.booking(currentUser, "1");
                                    isBooked1 = true;
                                }else {
                                    System.err.println("❎❎❎❎❎❎❎❎❎❎❎❎❎❎❎");
                                    System.err.println("\nЭТА МАШИНА УЖЕ ЗАНЯТА!\nВЫ МОЖЕТЕ ВЫБРАТЬ ДРУГУЮ МАШИНУ:\n");
                                    System.err.println("❎❎❎❎❎❎❎❎❎❎❎❎❎❎❎");
                                }
                                break;
                            }
                            case "2", "honda": {
                                if (isBooked2 == false) {
                                    Managment.booking(currentUser, "2");
                                    isBooked2 = true;
                                }else {
                                    System.err.println("❎❎❎❎❎❎❎❎❎❎❎❎❎❎❎");
                                    System.err.println("\nЭТА МАШИНА УЖЕ ЗАНЯТА!\nВЫ МОЖЕТЕ ВЫБРАТЬ ДРУГУЮ МАШИНУ:\n");
                                    System.err.println("❎❎❎❎❎❎❎❎❎❎❎❎❎❎❎");
                                }
                                break;
                            }
                            case "3", "mers": {
                                if (isBooked3 == false) {
                                    Managment.booking(currentUser, "3");
                                    isBooked3 = true;
                                }else {
                                    System.err.println("❎❎❎❎❎❎❎❎❎❎❎❎❎❎❎");
                                    System.err.println("\nЭТА МАШИНА УЖЕ ЗАНЯТА!\nВЫ МОЖЕТЕ ВЫБРАТЬ ДРУГУЮ МАШИНУ:\n");
                                    System.err.println("❎❎❎❎❎❎❎❎❎❎❎❎❎❎❎");
                                }
                                break;
                            }
                            case "4", "toyota": {
                                if (isBooked4 == false) {
                                    Managment.booking(currentUser, "4");
                                    isBooked4 = true;
                                }else {
                                    System.err.println("❎❎❎❎❎❎❎❎❎❎❎❎❎❎❎");
                                    System.err.println("\nЭТА МАШИНА УЖЕ ЗАНЯТА!\nВЫ МОЖЕТЕ ВЫБРАТЬ ДРУГУЮ МАШИНУ:\n");
                                    System.err.println("❎❎❎❎❎❎❎❎❎❎❎❎❎❎❎");
                                }
                                break;
                            }
                            case "5", "kia": {
                                if (isBooked5 == false) {
                                    Managment.booking(currentUser, "5");
                                    isBooked5 = true;
                                }else {
                                    System.err.println("❎❎❎❎❎❎❎❎❎❎❎❎❎❎❎");
                                    System.err.println("\nЭТА МАШИНА УЖЕ ЗАНЯТА!\nВЫ МОЖЕТЕ ВЫБРАТЬ ДРУГУЮ МАШИНУ:\n");
                                    System.err.println("❎❎❎❎❎❎❎❎❎❎❎❎❎❎❎");
                                }
                                break;
                            }
                            case "6", "audi": {
                                if (isBooked6 == false) {
                                    Managment.booking(currentUser, "6");
                                    isBooked6 = true;
                                }else {
                                    System.err.println("❎❎❎❎❎❎❎❎❎❎❎❎❎❎❎");
                                    System.err.println("\nЭТА МАШИНА УЖЕ ЗАНЯТА!\nВЫ МОЖЕТЕ ВЫБРАТЬ ДРУГУЮ МАШИНУ:\n");
                                    System.err.println("❎❎❎❎❎❎❎❎❎❎❎❎❎❎❎");
                                }
                                break;
                            }
                            case "7", "bmw": {
                                if (isBooked7 == false) {
                                    Managment.booking(currentUser, "7");
                                    isBooked7 = true;
                                }else {
                                    System.err.println("❎❎❎❎❎❎❎❎❎❎❎❎❎❎❎");
                                    System.err.println("\nЭТА МАШИНА УЖЕ ЗАНЯТА!\nВЫ МОЖЕТЕ ВЫБРАТЬ ДРУГУЮ МАШИНУ:\n");
                                    System.err.println("❎❎❎❎❎❎❎❎❎❎❎❎❎❎❎");
                                }
                                break;
                            }
                            }
                        }else {
                            break InnerLoop;
                        }
                    }
                    break;
                }
                case "3", "выйти" : {
                    System.out.println("\nВы хотите выйти?");
                    System.out.println("1 - да \n2 - нет");
                    String answer = new Scanner(System.in).nextLine().toLowerCase();
                    if(answer.equals("1") || answer.equals("да")) {
                        System.out.println("ВЫ ВЫШЛИ ИЗ СИСТЕМЫ!⬅️");
                        break OuterLoop;
                    }else if (answer.equals("2") || answer.equals("нет")){
                        isTrue=true;
                    }
                }
            }
        }
    }
}