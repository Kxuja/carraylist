package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {

        public static int count =0;

        public static Scanner scanner = new Scanner(in);

        public void main(String[] args) {
            ArrayList<User> userArrayList = new ArrayList<>();
            ArrayList<Car> carArrayList= new ArrayList<>();
            count++;
            carArrayList.add(new Car("Spark","chevrolet",2020,80000,count));
            carArrayList.add(new Car("Damas","chevrolet",2021,85000,count));
            carArrayList.add(new Car("Gentra","chevrolet",2022,150000,count));
            System.out.println("hush kelibsiz !!!");

            while (true){
                System.out.println("tanlang: ");
                System.out.println("[1] user panel ");
                System.out.println("[2] admin panel ");
                int a= scanner.nextInt();
                if (a==1){


                    System.out.println("[1] avtomobillar listini ko'rish ");
                    System.out.println("[2] avtomobil sotib olish ");
                    System.out.println("[3] avtomobill qo'shish ");
                    System.out.println("[4] userlar haqida ma'lumot ");
                    System.out.println("[5] yangi user qo'shish ");
                    System.out.println("[6] avtomobil qidirish ");
                    int b= scanner.nextInt();
                    switch (b){
                        case 1->{
                            carArrayList.forEach(car -> {
                                System.out.println("nomi: " + car.getName() + " " + "brandi: " + car.getBrand() + " " + "yili: " + " " + car.getAge() + " " + "narxi: " + car.getPrice());
                            });
                        }
                        case 2->{
                            System.out.println("avtomobilni tallang !!!");
                            System.out.println();
                            for (Car car: carArrayList) {
                                System.out.println("nomi: " + car.getName());

                            }
                            String name =scanner.next();
                            carArrayList.forEach(car -> {
                                if  (name.contains(car.getName())){
                                    System.out.println("Malumotlarni kiriting !!! ");
                                    System.out.println("Isim: ");
                                    String userName1 = scanner.next();
                                    System.out.println("Password ");
                                    int userPassword1 = scanner.nextInt();
                                    System.out.println("Yosh: ");
                                    int userAge1 = scanner.nextInt();
                                    System.out.println("Card: ");
                                    int userCard1 = scanner.nextInt();
                                    userArrayList.add(new User(userName1, userAge1, userPassword1, userCard1));
                                }
                            });





                        }
                        case 3->{

                            System.out.println("Avtomobilni nomini kiriting: ");
                            String name = scanner.next();
                            System.out.println("Avtomobilni brandini kriting: ");
                            String brand = scanner.next();
                            System.out.println("Avtomobilni yilini kiriting: ");
                            int age = scanner.nextInt();
                            System.out.println("Avtomobilni narxini kiriting ");
                            int price = scanner.nextInt();
                            carArrayList.add(new Car(name, brand, age, price,count));
                        }

                        case 4->{
                            userArrayList.forEach(user -> {
                                System.out.println("ismi "+user.getName() + " yoshi: " + user.getAge() + " paroli: " + user.getPassword() + " cartasi: " + user.getCard());

                            });
                        }
                        case 5->{
                            System.out.println("Isim: ");
                            String userName1 = scanner.next();
                            System.out.println("Password ");
                            int userPassword1 = scanner.nextInt();
                            System.out.println("Yosh: ");
                            int userAge1 = scanner.nextInt();
                            System.out.println("Card: ");
                            int userCard1 = scanner.nextInt();
                            userArrayList.add(new User(userName1, userAge1, userPassword1, userCard1));
                        }
                        case 6->{
                            System.out.println("avtomobilni qidirish !!!");
                            for (Car car: carArrayList) {
                                System.out.println("avtomobilni nomini kiriting !!! ");
                                String carname= scanner.next();
                                if (carname.contains(car.getName())){
                                    System.out.println("nomi: " + car.getName() + " " + "brandi: " + car.getBrand() + " " + "yili: " + " " + car.getAge() + " " + "narxi: " + car.getPrice());

                                }
                            }

                        }



                    }

                }
                else if (a==2){

                    userArrayList.forEach(user -> {
                        System.out.println("loginni kiiriting !!!");
                        String login = scanner.next();
                        System.out.println("parolni kiriting !!! ");

                        int password = scanner.nextInt();
                        if (password== user.getPassword()&&login.contains(user.getName())){
                            System.out.println("[1] yangi avtomobil listini qo'shish ");
                            System.out.println("[2] avtomobillar listini ko'rish ");
                            System.out.println("[3] avtomobillar listini o'chirish ");
                            System.out.println("[4] avtomobillar listini yangilash  ");
                            System.out.println("[5] qo'shilgan userlar listini ko'rish ");
                            System.out.println("[6] qo'shilgan userlarni listini o'chirish ");
                            System.out.println("[7] exit");
                            int nn = scanner.nextInt();


                            if (nn == 1) {


                                System.out.println("Avtomobilni nomini kiriting: ");
                                String name = scanner.next();
                                System.out.println("Avtomobilni brandini kriting: ");
                                String brand = scanner.next();
                                System.out.println("Avtomobilni yilini kiriting: ");
                                int age = scanner.nextInt();
                                System.out.println("Avtomobilni narxini kiriting ");
                                int price = scanner.nextInt();
                                carArrayList.add(new Car(name, brand, age, price,count));
                            }
                            else if (nn==2){
                                carArrayList.forEach(car -> {

                                    System.out.println("nomi: " + car.getName() + " " + "brandi: " + car.getBrand() + " " + "yili: " + " " + car.getAge() + " " + "narxi: " + car.getPrice());

                                });
                                System.out.println();
                            }
                            else if (nn==3){
                                carArrayList.clear();
                            }
                            else if (nn==4){

                                System.out.println("Avtomobilni nomini kiriting: ");
                                String nameCar = scanner.next();

                                System.out.println("Avtomobilni brandini kriting: ");
                                String brandCar = scanner.next();
                                System.out.println("Avtomobilni yilini kiriting: ");
                                int ageCar = scanner.nextInt();
                                System.out.println("Avtomobilni narxini kiriting ");
                                int priceCar = scanner.nextInt();
                                carArrayList.set(0, new Car(nameCar, brandCar, ageCar, priceCar,count));


                            }
                            else     if (nn==5){
                                for (User user3 : userArrayList) {
                                    System.out.println("ismi "+user3.getName() + " yoshi: " + user3.getAge() + " paroli: " + user3.getPassword() + " cartasi: " + user3.getCard());
                                }
                                System.out.println();
                            }
                            else if (nn==6){
                                userArrayList.clear();
                            }
                            else if (nn==7){

                            }
                        }
                    });

                }
            }}}










