package com.company;
//ДЗ:
//        ● Создать класс Weapon (Оружие), с приватными полями тип оружия и название
//        оружия.
//        ● Создать класс GameEntity (Игровая сущность), выделить все общие поля которые
//        присущи и Боссу и Героям и добавить геттеры и сеттеры к ним.
//        ● Создать класс Босса, наследовать его от класса GameEntity и дополнить его полем
//        сложного типа данных Weapon (то есть дать оружие боссу). Также добавить
//        геттеры и сеттеры для этого поля.
//        ● В классе Main создать 1 экземпляр босса и задать ему все свойства (значения
//        полям). Затем распечатать всю информацию о боссе.
//        ДЗ на сообразительность:
//        ● Распечатывание информации сделать в методе в классе Босса public String
//        printInfo(){}
//        ● Создать класс Skeleton (Скелет), унаследовать от Босса.
//        ● Добавить поле (кол-во стрел) и добавить геттеры.
//        ● Переопределить родительский метод printInfo в классе Sceleton
//        ● В Main распечатать информацию о Боссе с помощью метода printInfo, также
//        создать 2 экземпляра скелета и заполнить данными) затем распечатать всю
//        информацию о скелетах.
public class Main {

    public static void main(String[] args) {
	// write your code here
        Boss boss = new Boss(1000, 200, "P90");
        System.out.println("Boss Health : " + boss.health + " Damage : " + boss.damage + " Weapon : " + boss.Weapon);
    }
}
