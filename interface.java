//practise interfaces while implementing abstraction
interface bike
  {
    void applyBrake(int brake);
    void useAccelerator(int accelerate);
    void changeGears();
  }
class apacheBike implements bike
  {
    void applyBrake(int brake)
    {
      latestSpeed=latestSpeed - brake;
    }
    void useAccelerator(int accelerate)
    {
      latestSpeed=latestSpeed + accelerate;
    }
    
    
