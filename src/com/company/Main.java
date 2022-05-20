package com.company;

public class Main {
    public static void main(String[] args) {
        // Босс
        Boss boss = new Boss();
        boss.setWeapon("ak47");
        boss.setHealth(1000);
        boss.setDamage(200);
        //Скелет 1
        Skeleton Skeleton1 = new Skeleton();
        Skeleton1.setHealth(100);
        Skeleton1.setDamage(50);
        Skeleton1.setWeapon("Bow");
        Skeleton1.setCountOfArrows(20);
        //Скелет 2
        Skeleton Skeleton2 = new Skeleton();
        Skeleton2.setHealth(100);
        Skeleton2.setDamage(80);
        Skeleton2.setWeapon("CrossBow");
        Skeleton2.setCountOfArrows(15);
        //вывод характеристик
        boss.printInfo();
        Skeleton1.printInfo();
        Skeleton2.printInfo();
    }
}
