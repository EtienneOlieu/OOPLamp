public class Lamp {

    private boolean lampIsOn;

  public Lamp (boolean lampIsOn){
      this.lampIsOn = false;
  }

    public boolean isLampIsOn() {
        return lampIsOn;
    }

    public void flipTheSwitch (){
      if (lampIsOn == false){
          lampIsOn = true;
          System.out.println("The light is now on.");
      } else {
          lampIsOn = false;
          System.out.println("The light is now off");
      }

  }

    @Override
    public String toString() {
        return "Lamp[" +
                "lampIsOn=" + lampIsOn +
                ']';
    }
}
