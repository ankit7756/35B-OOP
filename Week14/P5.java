// 5. Design and implement a Java program that simulates a network monitoring system. 
// Your system should be capable of monitoring different types of network devices, such as routers and switches, 
// and alerting if any devices are experiencing errors or downtime. 
// Use interfaces to define common behaviors for network devices and implement these behaviors in different device classes.

// Create an interface named Network Device with at least two methods:

// - getStatus() which returns a String indicating the current status of the device 
// - isAvailable() which returns a boolean indicating if the device is currently available and functioning correctly.

// Implement the Network Device interface in at least three separate classes, Router and Switch. Each class should have a constructor that sets specific properties for the device and specific logic to determine its status and availability.


package Week14;

public class P5 {
    public static void main(String[] args) {
        NetworkDevice router = new Router("Router1", "Online");
        NetworkDevice switchDevice = new Switch("Switch1", "Offline");

        // Monitor the devices and display their status and availability
        monitorDevice(router);
        monitorDevice(switchDevice);
    }

    // Method to monitor a device and display its status and availability
    public static void monitorDevice(NetworkDevice device) {
        System.out.println("Device: " + device.getDeviceName());
        System.out.println("Status: " + device.getStatus());
        if (device.isAvailable()) {
            System.out.println("The device is available and functioning correctly.");
        } else {
            System.out.println("The device is experiencing errors or downtime.");
        }
        System.out.println();
    }
}

// NetworkDevice interface with common behaviors
interface NetworkDevice {
    String getDeviceName();
    String getStatus();
    boolean isAvailable();
}

class Router implements NetworkDevice {
    private String deviceName;
    private String status;

    // Constructor to set the device name and status
    public Router(String deviceName, String status) {
        this.deviceName = deviceName;
        this.status = status;
    }

    // Get the device name
    @Override
    public String getDeviceName() {
        return deviceName;
    }

    // Get the status of the device
    @Override
    public String getStatus() {
        return status;
    }

    // Check if the device is available based on its status
    @Override
    public boolean isAvailable() {
        return status.equalsIgnoreCase("Online");
    }
}

class Switch implements NetworkDevice {
    private String deviceName;
    private String status;

    // Constructor to set the device name and status
    public Switch(String deviceName, String status) {
        this.deviceName = deviceName;
        this.status = status;
    }

    // Get the device name
    @Override
    public String getDeviceName() {
        return deviceName;
    }

    // Get the status of the device
    @Override
    public String getStatus() {
        return status;
    }

    // Check if the device is available based on its status
    @Override
    public boolean isAvailable() {
        return status.equalsIgnoreCase("Online");
    }
}
