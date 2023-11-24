import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class Managment {
    private User[] users ;
    private Car[] cars1 = Car.values();
    private Driver[] drivers1 = Driver.values();

    public static void booking(User user, String chek){
        Car[] cars = Car.values();
        Driver[] drivers = Driver.values();
//        boolean isDriver1 = false;
//        boolean isDriver2 = false;
//        boolean isDriver3 = false;
//        boolean isDriver4 = false;
//        boolean isDriver5 = false;
//        boolean isDriver6 = false;
//        boolean isDriver7 = false;
        for (Car car : cars) {
            if (car.id.equals(chek)) {
                if (user.getBalance().floatValue() >= car.price.floatValue()) {
                    user.pay(car.price, user.getBalance());
                    String blue = "\u001B[34m";
                    String resetColorCode = "\u001B[0m";
                    System.out.println(blue + "✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅");
                    System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ ЗА МАШИНУ: $" + car.price);
                                System.out.println("\nОСТАВШИЕСЯ БАЛАНС: $" + user.getBalance());
                                if(chek.equals("1")) {
                                    System.out.println("\n" + Driver.NURISLAM + " с " + car + " К ВАШИМ УСЛУГАМ");
                                    System.out.println("\nДРАЙВЕР: " + Driver.NURISLAM + " номер телефона: " + Driver.NURISLAM.number + " " + Driver.NURISLAM.age + " y.o." );
                                }
                                else if(chek.equals("2")) {
                                    System.out.println("\n" + Driver.AJYBEK + " с " + car + " К ВАШИМ УСЛУГАМ");
                                    System.out.println("\nДРАЙВЕР: " + Driver.AJYBEK + " номер телефона: " + Driver.AJYBEK.number + " " + Driver.AJYBEK.age + " y.o." );
                                }
                                else if(chek.equals("3")) {
                                    System.out.println("\n" + Driver.NURLAN + " с " + car + " К ВАШИМ УСЛУГАМ");
                                    System.out.println("\nДРАЙВЕР: " + Driver.NURLAN + " номер телефона: " + Driver.NURLAN.number + " " + Driver.NURLAN.age + " y.o." );
                                }
                                else if(chek.equals("4")) {
                                    System.out.println("\n" + Driver.MIRLAN + " с " + car + " К ВАШИМ УСЛУГАМ");
                                    System.out.println("\nДРАЙВЕР: " + Driver.MIRLAN + " номер телефона: " + Driver.MIRLAN.number + " " + Driver.MIRLAN.age + " y.o." );
                                }
                                else if(chek.equals("5")) {
                                    System.out.println("\n" + Driver.JIGIT + " с " + car + " К ВАШИМ УСЛУГАМ");
                                    System.out.println("\nДРАЙВЕР: " + Driver.JIGIT + " номер телефона: " + Driver.JIGIT.number + " " + Driver.JIGIT.age + " y.o." );
                                }
                                else if(chek.equals("6")) {
                                    System.out.println("\n" + Driver.NURCAMIL + " с " + car + " К ВАШИМ УСЛУГАМ");
                                    System.out.println("\nДРАЙВЕР: " + Driver.NURCAMIL + " номер телефона: " + Driver.NURCAMIL.number + " " + Driver.NURCAMIL.age + " y.o." );
                                }
                                else if(chek.equals("7")) {
                                    System.out.println("\n" + Driver.ALIASKAR + " с " + car + " К ВАШИМ УСЛУГАМ");
                                    System.out.println("\nДРАЙВЕР: " + Driver.ALIASKAR + " номер телефона: " + Driver.ALIASKAR.number + " " + Driver.ALIASKAR.age + " y.o." );
                                }
                                System.out.println("✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅" + resetColorCode);


//                    System.out.println("ВЫБЕРИТЕ ДРАЙВЕР: \n");
//                    for (int i = 0; i < drivers.length; i++) {
//                        System.out.println((i+1)+ ". " + drivers[i] + " номер телефона: " + drivers[i].number + ". " + drivers[i].age + " y.o.\n");
//                    }
//                    System.out.println();
//                    int answer = new Scanner(System.in).nextInt();
//
//                    switch (answer){
//                        case 1 : {
//                            if(isDriver1==false) {
//                                System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ ЗА МАШИНУ: $" + car.price);
//                                System.out.println("\nОСТАВШИЕСЯ БАЛАНС: $" + user.getBalance());
//                                System.out.println("\nНУРИСЛАМ с " + car + " К ВАШИМ УСЛУГАМ");
//                                System.out.println();
//                            }else {
//                                System.out.println("ЭТОТ ВОДИТЕЛЬ ЗАНЯТ, ВЫБЕРИТЕ ДРУГОГО.");
//                            }
//                            isDriver1 = true;
//                            break;
//                        }
//                        case 2 : {
//                            if(isDriver2==false) {
//                                System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ ЗА МАШИНУ: $" + car.price);
//                                System.out.println("\nОСТАВШИЕСЯ БАЛАНС: $" + user.getBalance());
//                                System.out.println("\nАЖЫБЕК с " + car + " К ВАШИМ УСЛУГАМ");
//                                System.out.println();
//                            }else System.out.println("ЭТОТ ВОДИТЕЛЬ ЗАНЯТ, ВЫБЕРИТЕ ДРУГОГО.");
//                            isDriver2 = true;
//                            break;
//                        }
//                        case 3 : {
//                            if(isDriver3==false) {
//                                System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ ЗА МАШИНУ: $" + car.price);
//                                System.out.println("\nОСТАВШИЕСЯ БАЛАНС: $" + user.getBalance());
//                                System.out.println("\nНУРЛАН с " + car + " К ВАШИМ УСЛУГАМ");
//                                System.out.println();
//                            }else System.out.println("ЭТОТ ВОДИТЕЛЬ ЗАНЯТ, ВЫБЕРИТЕ ДРУГОГО.");
//                            isDriver3 = true;
//                            break;
//                        }
//                        case 4 : {
//                            if(isDriver4==false) {
//                                System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ ЗА МАШИНУ: $" + car.price);
//                                System.out.println("\nОСТАВШИЕСЯ БАЛАНС: $" + user.getBalance());
//                                System.out.println("\nМИРЛАН с " + car + " К ВАШИМ УСЛУГАМ");
//                                System.out.println();
//                            }else System.out.println("ЭТОТ ВОДИТЕЛЬ ЗАНЯТ, ВЫБЕРИТЕ ДРУГОГО.");
//                            isDriver4 = true;
//                            break;
//                        }
//                        case 5 : {
//                            if(isDriver5==false) {
//                                System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ ЗА МАШИНУ: $" + car.price);
//                                System.out.println("\nОСТАВШИЕСЯ БАЛАНС: $" + user.getBalance());
//                                System.out.println("\nЖИГИТ с " + car + " К ВАШИМ УСЛУГАМ");
//                                isDriver5 = true;
//                                System.out.println();
//                            }else System.out.println("ЭТОТ ВОДИТЕЛЬ ЗАНЯТ, ВЫБЕРИТЕ ДРУГОГО.");
//                            break;
//                        }
//                        case 6 : {
//                            if(isDriver6==false) {
//                                System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ ЗА МАШИНУ: $" + car.price);
//                                System.out.println("\nОСТАВШИЕСЯ БАЛАНС: $" + user.getBalance());
//                                System.out.println("\nНУРКАМИЛ с " + car + " К ВАШИМ УСЛУГАМ");
//                                System.out.println();
//                            }else System.out.println("ЭТОТ ВОДИТЕЛЬ ЗАНЯТ, ВЫБЕРИТЕ ДРУГОГО.");
//                            isDriver6 = true;
//                            break;
//                        }
//                        case 7 : {
//                            if(isDriver7==false) {
//                                System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ ЗА МАШИНУ: $" + car.price);
//                                System.out.println("\nОСТАВШИЕСЯ БАЛАНС: $" + user.getBalance());
//                                System.out.println("\nАЛИАСКАР с " + car + " К ВАШИМ УСЛУГАМ");
//                                System.out.println();
//                            }else System.out.println("ЭТОТ ВОДИТЕЛЬ ЗАНЯТ, ВЫБЕРИТЕ ДРУГОГО.");
//                            isDriver7 = true;
//                            break;
//                        }
//                    }
                } else {
                    System.out.println("У ВАС НЕ ДОСТАТОЧНО СРЕДСТВ НА ВАШЕЙ КАРТЕ!");
                    System.out.println("ВЫ ХОТИТЕ ПОЛУЧИТЬ ДЕПОЗИТ?");
                    System.out.println("1 - ДА \n2 - НЕТ");
                    String answer = new Scanner(System.in).nextLine().toLowerCase();
                    if (answer.equals("1") || answer.equals("да")) {
                        System.out.println("ВВЕДИТЕ ИМЯ: ");
                        String chekName = new Scanner(System.in).nextLine();
                        System.out.println("ВВЕДИТЕ ПАРОЛЬ: ");
                        String chekPassword = new Scanner(System.in).nextLine();
                        if (chekName.equals(user.getName()) || chekPassword.equals(user.getPassword())) {
                            System.out.println("КАКУЮ СУММУ ВЫ ХОТИТЕ ПОЛУЧИТЬ?");
                            BigDecimal dpt = new Scanner(System.in).nextBigDecimal();
                            user.deposit(dpt);
                            System.out.println("ПЛАТЕЖ УСПЕШНО ЗАВЕРШЕН💸✅. У ВАС НА КАРТЕ: " + user.getBalance());
                        } else System.out.println("НЕПРАВИЛЬНЫЙ ЛОГИН!🚫");
                        break;
                    } else {
                        System.out.println("ВЫ ВЫШЛИ ИЗ СИСТЕМЫ!⬅️");
                        break;
                    }
                }
            }
        }
    }

}
