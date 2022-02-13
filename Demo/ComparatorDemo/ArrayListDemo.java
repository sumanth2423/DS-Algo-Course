package Examples.ComparatorDemo;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Vehicle("Toyota", 2018));
        vehicleList.add(new Vehicle("Audi", 2021));
        vehicleList.add(new Vehicle("Ford", 2019));

        System.out.println("Sorting by Brand Name");
        Collections.sort(vehicleList, new BrandComparator());

        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.brand);
        }

        System.out.println("Sorting by year");
        Collections.sort(vehicleList, new MakeYearComparator());
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.makeYear);
        }
    }

}
