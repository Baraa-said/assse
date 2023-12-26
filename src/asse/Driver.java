//baraa asaad said
//1220280
//Lab Section :5

package asse;

import java.util.*;

public class Driver {
    final static int SEEDVALUE = 100;

    public static void main(String[] args) {

        Room[] rooms = new Room[3];
        Random r = new Random(SEEDVALUE);
        for (int j = 0; j < 3; j++) {

            double roomLength = r.nextDouble(21) + 30;
            Chair[] chairNumber1 = new Chair[r.nextInt(21) + 30];

            for (int i = 0; i < chairNumber1.length; i++) {

                chairNumber1[i] = new Chair();
                chairNumber1[i].setDistanceFromFrontWall(r.nextDouble(roomLength));
                int colorChooser = r.nextInt(3);
                if (colorChooser == 0) {
                    chairNumber1[i].setColor("red");
                } else if (colorChooser == 1) {
                    chairNumber1[i].setColor("yellow");
                } else {
                    chairNumber1[i].setColor("white");
                }
            }

            rooms[j] = new Room(201 + j, roomLength, r.nextDouble(11) + 20, chairNumber1);
        }
        DisplayRooms(rooms);

    }

    public static void DisplayRooms(Room[] rooms) {
        for (int i = 0; i < 3; i++) {
            rooms[i].displayRoomInfo();
        }
    }

}