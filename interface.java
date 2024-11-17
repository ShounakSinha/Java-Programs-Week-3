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
    BufferedReader read = new BufferedReader(in);   //taking inout using inputstreamreader
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
    
    
