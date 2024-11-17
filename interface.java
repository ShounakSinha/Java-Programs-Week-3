//practise interfaces while implementing abstraction
interface bike
  {
    void applyBrake(int brake);
    void useAccelerator();
    void changeGears();
  }
class apacheBike implements bike
  {
    void applyBrake()
    {
      latestSpeed=latestSpeed - brake;
    }
    
