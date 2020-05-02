package com.rutterheger;

import java.util.Scanner;

class Main {

    private Main() {
        Player player = new Player();
        Rabbit rabbit = new Rabbit();
        Wolf wolf = new Wolf();

        Scanner scanner = new Scanner(System.in);
        while (player.isAlive()) {
            System.out.println("Wen moechten Sie angreifen? 'w' fuer Wolf oder 'h' fuer Hasen.");
            String s = scanner.nextLine();
            if (s.equals("w"))
                attack(player, wolf);
            else if (s.equals("h"))
                attack(player, rabbit);
            else
                System.out.println("Eingabe konnte nicht ausgewertet werden.");
            if (!rabbit.isAlive())
                rabbit = new Rabbit();
            else if (!wolf.isAlive())
                wolf = new Wolf();
            System.out.println("\n");
        }
        System.out.println("Der Spieler ist tot. Er hat sich " + player.getXP() + " Erfahrungspunkte erspielt. Das Spiel wird beendet.");
    }

    private void attack(Player player, NPC npc) {
        String type;
        if (npc instanceof Wolf) {
            type = "Wolf";
        } else {
            type = "Hase";
        }
        System.out.println(type + " wird angegriffen.");
        player.attack(npc);
        if (npc.isAlive()) {
            npc.attack(player);
            System.out.println("Der " + type + " schlaegt zurueck.");
            System.out.println("Du hast noch " + player.getLives() + " und der " + type + " noch " + npc.getLives() + " Leben.");
        } else {
            System.out.println("Der " + type + " ist tot. Es kommt ein neuer " + type + ".");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
