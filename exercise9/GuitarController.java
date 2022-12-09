public interface GuitarController { 
    public static enum colors {GREEN,RED,YELLOW,BLUE,ORANGE} 
    public void PressFretButton(colors button); 
    public void PressPick();
    public void PressTremelo(); 
} 