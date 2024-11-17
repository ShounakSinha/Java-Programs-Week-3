//practise interfaces while implementing abstraction
import java.io.*;
//import java.util.*;
interface bike
  {
    void applyBrake(int brake);
    void useAccelerator(int accelerate);
    void changeGears(int gearNumber);
  }
class apacheBike implements bike
  {
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(in);   //taking inout using inputstreamreader
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //single line inout using Buffered Reader
    System.out.println("Enter the current speed of the car and the current gear : ");
    int latestSpeed =  Integer.parseInt(br.readline);
    int currentGear = Integer.parseInt(br.readLine);
    System.out.println(("Enter the accelaration decceleration and change in gear required : ");
    int accelerate=Integer.parseInt(br.readLine);
    int brake =  Integer.parseInt(br.readLine);
    int currentGear = Integer.parseInt(br.readLine);
    void applyBrake(int brake)
    {
      latestSpeed=latestSpeed - brake;
    }
    void useAccelerator(int accelerate)
    {
      latestSpeed=latestSpeed + accelerate;
    }
    void changeGears(int gearNumber)
    {
      currentGear = gearNumber;
    }
  }
    
    
