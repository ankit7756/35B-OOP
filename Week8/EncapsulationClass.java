/*Task 
    Make a constructer of Laptop that takes brand and name
    Make a setter and getter for remaining private attributes, ram, storage
    Make a function upgrade() takes, 2 number for ram and storage \
    and add them to the current value of ram and storage
    Make a function inflation() takes 1 number price \
    and add to the current value of price
    Make 2 object, fill the attribute and call upgrade & inflation
    Print the following
    Output
    Brand: Apple
    Name: Apple Air M3
    Price: 150000
    Ram: 10GB
    Storage: 256GB
    Year: 2022 
*/

package Week8;

public class EncapsulationClass {
    public static void main(String[] args) {
        // Creating two Laptop objects
        Laptop laptop1 = new Laptop("Apple", "Apple Air M3");
        Laptop laptop2 = new Laptop("Dell", "Dell XPS 13");

        // Setting initial attributes using setters
        laptop1.setRam(8);
        laptop1.setStorage(128);
        laptop1.setPrice(140000);
        laptop1.setYear(2022);

        laptop2.setRam(16);
        laptop2.setStorage(512);
        laptop2.setPrice(120000);
        laptop2.setYear(2021);

        // Upgrading the first laptop
        laptop1.upgrade(2, 128); // Adding 2GB RAM and 128GB storage
        laptop1.inflation(10000); // Adding 10000 to the price

        // Upgrading the second laptop
        laptop2.upgrade(4, 256); // Adding 4GB RAM and 256GB storage
        laptop2.inflation(5000); // Adding 5000 to the price

        // Printing details of the first laptop
        System.out.println("Brand: " + laptop1.getBrand());
        System.out.println("Name: " + laptop1.getName());
        System.out.println("Price: " + laptop1.getPrice());
        System.out.println("Ram: " + laptop1.getRam() + "GB");
        System.out.println("Storage: " + laptop1.getStorage() + "GB");
        System.out.println("Year: " + laptop1.getYear());

        System.out.println();

        // Printing details of the second laptop
        System.out.println("Brand: " + laptop2.getBrand());
        System.out.println("Name: " + laptop2.getName());
        System.out.println("Price: " + laptop2.getPrice());
        System.out.println("Ram: " + laptop2.getRam() + "GB");
        System.out.println("Storage: " + laptop2.getStorage() + "GB");
        System.out.println("Year: " + laptop2.getYear());
    }
}

// 1. Encapsulation enclose/bundles similar properties/attribute
// and function/methods inside a single class

class Laptop {
    String brand;
    String name;
    // 2. Data hiding can be done using private modifier
    private double price;
    private int ram;
    private int storage;
    public int year;

    // Constructor to initialize brand and name
    public Laptop(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    // 3. Data attributes can have a better control using setter/getter
    // Write only using setter
    public void setPrice(double price) {
        this.price = price;
    }

    // Read only using getter
    public double getPrice() {
        return this.price;
    }

    // Setter for RAM
    public void setRam(int ram) {
        this.ram = ram;
    }

    // Getter for RAM
    public int getRam() {
        return this.ram;
    }

    // Setter for Storage
    public void setStorage(int storage) {
        this.storage = storage;
    }

    // Getter for Storage
    public int getStorage() {
        return this.storage;
    }

    // Setter for Year
    public void setYear(int year) {
        this.year = year;
    }

    // Getter for Year
    public int getYear() {
        return this.year;
    }

    // Getter for Brand
    public String getBrand() {
        return this.brand;
    }

    // Getter for Name
    public String getName() {
        return this.name;
    }

    // Method to upgrade RAM and Storage
    public void upgrade(int additionalRam, int additionalStorage) {
        this.ram += additionalRam;
        this.storage += additionalStorage;
    }

    // Method to add inflation to the price
    public void inflation(double additionalPrice) {
        this.price += additionalPrice;
    }

    void branding() {
        System.out.println("Brand: " + brand);
    }
}
