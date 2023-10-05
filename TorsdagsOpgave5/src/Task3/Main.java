package Task3;

import Task2.Cafe;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Room Room = new Room(1, 1, 1);
        Room Room1 = new Room(1, 2, 1);
        Room Room2 = new Room(1, 3, 1);
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(Room);
        rooms.add(Room1);
        rooms.add(Room2);
        Building build = new Building(rooms, 2, 2, true);
        int i = countLampsInBuilding(build);
        System.out.println("Dit hus har denne mængde lamper:" + i);

        isNormal(build);
    }

    public static int countLampsInBuilding(Building build) {
        int countLamps = 0;
        ArrayList<Room> rooms = build.getRooms();
        for (Room r : rooms) {
            countLamps += r.getNumberOfLamps();
        }

        return countLamps;
    }

    public static boolean isNormal(Building building) {
        int floors = building.getNumberOfFloors();
        ArrayList<Room> rooms = building.getRooms();
        if (floors > rooms.size()) {
            System.out.println("isNormal");
            return true;
        } 
        else{
            System.out.println("This is an odd building");
            return false;
        }


    }
}
