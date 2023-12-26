//baraa asaad said
//1220280
//Lab Section :5

package asse;

public class Room {
    private int number;
    private double length;
    private double width;
    private Chair[] chairs;

    public Room(int number, double length, double width, Chair[] chairs) {
        this.number = number;
        this.length = length;
        this.width = width;
        this.chairs = chairs;
    }

    public void displayRoomInfo() {
        int yellow = 0;
        int red = 0;
        int white = 0;
        System.out.println("number      length     width      total chairs          red       yellow      white");
        System.out.print(
                number + "          " + ((int) (length * 100) / 100.0) + "     "
                        + ((int) (width * 100) / 100.0) + "      "
                        + chairs.length
                        + "                    ");

        for (int i = 0; i < chairs.length; i++) {
            if (chairs[i].getColor().equals("red")) {
                red++;
            }

            else if (chairs[i].getColor().equals("yellow")) {
                yellow++;
            }

            else
                white++;

        }
        System.out.println(red + "        " + yellow + "           " + white);

    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setChairs(Chair[] chairs) {
        this.chairs = chairs;
    }

    public int getNumber() {
        return this.number;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public Chair[] getChairs() {
        return this.chairs;
    }

}
