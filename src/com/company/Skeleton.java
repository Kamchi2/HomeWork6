package com.company;

public class Skeleton extends Boss {
    int countOfArrows;

    public void printInfo() {
        System.out.println("Skeleton\033[31m Health\033[0m : " + this.health + " | \033[34mDamage\033[0m : " + this.damage + " | \033[35mWeapon\033[0m : " + this.weapon + " | \033[36mArrows\033[0m : " + this.countOfArrows);
    }
//    red"\033[31m"
//    blue"\033[34m"
//    reset"\033[0m"
//    cyan"\033[36m"
//    magenta "\033[35m"

    public int getCountOfArrows() {
        return countOfArrows;
    }
}
