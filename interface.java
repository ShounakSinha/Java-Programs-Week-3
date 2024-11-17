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
    
    
