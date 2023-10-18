// Import Libraries 
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;

public class MyFrame extends JFrame {

    // Declare variables
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;

    // Constructor for MyFrame class
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Make a title for the frame
        this.setTitle("My Clock Program");
        // Set the lay out for the frame
        this.setLayout(new FlowLayout());
        // Set the background for the frame
        getContentPane().setBackground(Color.black);
        // Set Size for the frame
        this.setSize(350, 200);
        // Make the frame not resizable
        this.setResizable(false);
        // Set the layout of the time
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        // Set the layout of the day one E for the abbreviation and EEEE for the full word
        dayFormat = new SimpleDateFormat("EEEE");
        // Set the layout of the date
        dateFormat = new SimpleDateFormat("MM/dd/yyyy");

        // Create the Label for the time including font and color
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Stencil", Font.PLAIN, 44));
        timeLabel.setForeground(new Color(0x23FF00));

        // Create the Label for the day including font and color
        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Impact", Font.PLAIN, 39));
        dayLabel.setForeground(new Color(0x23FF00));

        // Create the Label for the date including font and color
        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Ink Free", Font.PLAIN, 37));
        dateLabel.setForeground(new Color(0x23FF00));

        // Add the labels to the jPane
        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
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

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);
        
        // Updates the clock every second
        try {
            Thread.sleep(1000);
        }    
        catch (InterruptedException e){
            e.printStackTrace();
        }
        }
    }
}
