import java.io.*;

interface Bike {
    void applyBrake(int brake);

    void useAccelerator(int accelerate);

    void changeGears(int gearNumber);
}

class ApacheBike implements Bike {
    private int latestSpeed;
    private int currentGear;
    // InputStreamReader in = new InputStreamReader(System.in);
    // BufferedReader br = new BufferedReader(in);   //taking inout using inputstreamreader
    // //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //single line inout using Buffered Reader
    // System.out.println("Enter the current speed of the car and the current gear : ");
    // int latestSpeed =  Integer.parseInt(br.readline());
    // int currentGear = Integer.parseInt(br.readLine());
    // System.out.println(("Enter the accelaration decceleration and change in gear required : ");
    // int accelerate=Integer.parseInt(br.readLine());
    // int brake =  Integer.parseInt(br.readLine());
    // int currentGear = Integer.parseInt(br.readLine());

    ApacheBike() throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        // Taking input for initial speed and gear
        System.out.println("Enter the current speed of the bike:");
        latestSpeed = Integer.parseInt(br.readLine());

        System.out.println("Enter the current gear of the bike:");
        currentGear = Integer.parseInt(br.readLine());
    }

    // Implementing interface methods
    public void applyBrake(int brake) {
        latestSpeed -= brake;
        if (latestSpeed < 0) {
            latestSpeed = 0;
        }
        System.out.println("Brake applied. Current speed: " + latestSpeed + " km/h");
    }

    public void useAccelerator(int accelerate) {
        latestSpeed += accelerate;
        System.out.println("Accelerated. Current speed: " + latestSpeed + " km/h");
    }

    public void changeGears(int gearNumber) {
        currentGear = gearNumber;
        System.out.println("Gear changed. Current gear: " + currentGear);
    }

    // Method to display current bike status
    public void displayStatus() {
        System.out.println("Bike status -> Speed: " + latestSpeed + " km/h, Gear: " + currentGear);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            ApacheBike bike = new ApacheBike();

            // Sample actions
            bike.displayStatus();
            bike.useAccelerator(20);
            bike.changeGears(3);
            bike.applyBrake(10);
            bike.displayStatus();
        } catch (IOException e) {
            System.out.println("An error occurred while taking input: " + e.getMessage());
        }
    }
}



   
    
    
