package time;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.*;
import java.time.Duration;
import java.time.Instant;
import java.util.*;


public class Watch implements Runnable {

    JFrame f;
    Thread t = null;
    int hours = 0, minutes = 0, seconds = 0;
    String timeString = "";
    JButton b;
    JButton stopbtn;
    JButton startbtn;
    JLabel time;

    Watch() {
        f = new JFrame();

        t = new Thread(this);
        t.start();

        b = new JButton();
        b.setBounds(100, 100, 100, 50);
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);

        startbtn = new JButton("start");
        startbtn.setBounds(50, 200, 70, 35);
        startbtn.setBackground(Color.BLUE);
        startbtn.setForeground(Color.WHITE);

        stopbtn = new JButton("stop");
        stopbtn.setBounds(170, 200, 70, 35);
        stopbtn.setBackground(Color.RED);
        stopbtn.setForeground(Color.WHITE);
        
        time = new JLabel("Timer here!!");
        time.setForeground(Color.BLUE);
        time.setBounds(100,250,100,50);

        f.add(b);
        f.add(startbtn);
        f.add(stopbtn);
        f.add(time);
        f.setSize(300, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void run() {
        try {
            while (true) {

                Calendar cal = Calendar.getInstance();
                hours = cal.get(Calendar.HOUR_OF_DAY);
                if (hours > 12) {
                    hours -= 12;
                }
                minutes = cal.get(Calendar.MINUTE);
                seconds = cal.get(Calendar.SECOND);

                SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
                Date date = cal.getTime();
                timeString = formatter.format(date);

                printTime();

                t.sleep(1000);  // interval given in milliseconds  
            }
        } catch (Exception e) {
            
        }
        
        startbtn.addActionListener(new ActionListener() {
            Instant start;

            @Override
            public void actionPerformed(ActionEvent e) {
                start = Instant.now();

                javax.swing.Timer timer = new javax.swing.Timer(1, new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        time.setText(Duration.between(start, Instant.now()).getSeconds() + ":" + Duration.between(start, Instant.now()).getNano());
                    }
                });
                timer.start();
            }
        });
        
        stopbtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                javax.swing.Timer timer1 = new javax.swing.Timer(1, new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        time.setText("test");
                    }
                });
                timer1.stop();
            }
        });

        
    }

    public void printTime() {
        b.setText(timeString);
        
    }
}

