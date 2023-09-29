// Import Libraries 
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;

public class MyFrame extends JFrame {

    // Declare variables
    Calendar calendar;
    SimpleDateFormat timeFormat;
    JLabel timeLabel;
    String time;

    // Constructor for MyFrame class
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Make a title for the frame
        this.setTitle("My Clock Program");
        this.setLayout(new FlowLayout());
        // Set Size for the frame
        this.setSize(350, 200);
        // Make the frame not resizable
        this.setResizable(false);
        // Set the layout of the time
        timeFormat = new SimpleDateFormat("hh:mm:ss a");

        timeLabel = new JLabel();

        this.add(timeLabel);
        this.setVisible(true);
        // Call the set time method
        setTime();
    }
    // Make a setTime method
    public void setTime() {
        // A while true (try catch) to update the clock every second
        while(true){
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);
        try {
            Thread.sleep(1000);
        }    
        catch (InterruptedException e){
            e.printStackTrace();
        }
        }
    }
}
