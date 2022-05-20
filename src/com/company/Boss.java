package com.company;
public class Boss extends GameEntity {

    String weapon;

    public void printInfo() {
        System.out.println("Skeleton\033[31m Health\033[0m : " + this.health + " | \033[34mDamage\033[0m : " + this.damage + " | \033[35mWeapon\033[0m : " + this.weapon);
    }
//    red "\033[31m"
//    blue "\033[34m"
//    reset "\033[0m"
//    cyan" \033[36m"
//    magenta "\033[35m"

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
