package time;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

public class Watch extends javax.swing.JFrame {

    private Timer timer;

    static int milliseconds = 0;
    static int seconds = 0;
    static int minutes = 0;
    static int hours = 0;
    static Date date;
    static int counter = 10;
    static int count = 0;
    static Thread thread;
    static boolean state = true;
    static boolean states = true;

    public Watch() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        current_time = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        time = new javax.swing.JButton();
        countdown = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        countdown_stop = new javax.swing.JButton();
        Downcount = new javax.swing.JLabel();
        countdown_start = new javax.swing.JButton();
        countup = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        countup_stop = new javax.swing.JButton();
        Upcount = new javax.swing.JLabel();
        countup_start = new javax.swing.JButton();
        stopwatch = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        stopwatch_start = new javax.swing.JButton();
        stopwatch_reset = new javax.swing.JButton();
        stopwatch_stop = new javax.swing.JButton();
        hour = new javax.swing.JLabel();
        second = new javax.swing.JLabel();
        minute = new javax.swing.JLabel();
        millisecond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        current_time.setBackground(new java.awt.Color(255, 204, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("CURRENT TIME");

        time.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout current_timeLayout = new javax.swing.GroupLayout(current_time);
        current_time.setLayout(current_timeLayout);
        current_timeLayout.setHorizontalGroup(
                current_timeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, current_timeLayout.createSequentialGroup()
                        .addContainerGap(102, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                .addGroup(current_timeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, current_timeLayout.createSequentialGroup()
                                .addContainerGap(70, Short.MAX_VALUE)
                                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(76, Short.MAX_VALUE)))
        );
        current_timeLayout.setVerticalGroup(
                current_timeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(current_timeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(current_timeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, current_timeLayout.createSequentialGroup()
                                .addContainerGap(98, Short.MAX_VALUE)
                                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(101, Short.MAX_VALUE)))
        );

        countdown.setBackground(new java.awt.Color(255, 204, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("COUNTDOWN");

        countdown_stop.setBackground(new java.awt.Color(0, 0, 204));
        countdown_stop.setForeground(new java.awt.Color(255, 255, 255));
        countdown_stop.setText("stop");
        countdown_stop.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        countdown_stop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                countdown_stopMouseClicked(evt);
            }
        });
        countdown_stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countdown_stopActionPerformed(evt);
            }
        });

        Downcount.setBackground(new java.awt.Color(255, 255, 255));
        Downcount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        countdown_start.setBackground(new java.awt.Color(255, 51, 51));
        countdown_start.setForeground(new java.awt.Color(255, 255, 255));
        countdown_start.setText("start");
        countdown_start.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        countdown_start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                countdown_startMouseClicked(evt);
            }
        });
        countdown_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countdown_startActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout countdownLayout = new javax.swing.GroupLayout(countdown);
        countdown.setLayout(countdownLayout);
        countdownLayout.setHorizontalGroup(
                countdownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(countdownLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(Downcount, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(countdownLayout.createSequentialGroup()
                        .addGroup(countdownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(countdownLayout.createSequentialGroup()
                                        .addGap(89, 89, 89)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(countdownLayout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(countdown_start, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(countdown_stop, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
        );
        countdownLayout.setVerticalGroup(
                countdownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(countdownLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Downcount, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(countdownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(countdown_stop, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(countdown_start, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))
        );

        countup.setBackground(new java.awt.Color(255, 204, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("COUNTUP");

        countup_stop.setBackground(new java.awt.Color(0, 0, 204));
        countup_stop.setForeground(new java.awt.Color(255, 255, 255));
        countup_stop.setText("stop");
        countup_stop.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        countup_stop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                countup_stopMouseClicked(evt);
            }
        });
        countup_stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countup_stopActionPerformed(evt);
            }
        });

        Upcount.setBackground(new java.awt.Color(255, 255, 255));
        Upcount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        countup_start.setBackground(new java.awt.Color(255, 51, 51));
        countup_start.setForeground(new java.awt.Color(255, 255, 255));
        countup_start.setText("start");
        countup_start.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        countup_start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            }
        });
        countup_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countup_startActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout countupLayout = new javax.swing.GroupLayout(countup);
        countup.setLayout(countupLayout);
        countupLayout.setHorizontalGroup(
                countupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(countupLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(countup_start, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(countup_stop, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, countupLayout.createSequentialGroup()
                        .addContainerGap(83, Short.MAX_VALUE)
                        .addGroup(countupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, countupLayout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(92, 92, 92))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, countupLayout.createSequentialGroup()
                                        .addComponent(Upcount, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(78, 78, 78))))
        );
        countupLayout.setVerticalGroup(
                countupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(countupLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(45, 45, 45)
                        .addComponent(Upcount, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(countupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(countup_stop, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(countup_start, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))
        );

        stopwatch.setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("STOPWATCH");

        stopwatch_start.setBackground(new java.awt.Color(255, 51, 51));
        stopwatch_start.setForeground(new java.awt.Color(255, 255, 255));
        stopwatch_start.setText("start");
        stopwatch_start.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stopwatch_start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopwatch_startMouseClicked(evt);
            }
        });
        stopwatch_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopwatch_startActionPerformed(evt);
            }
        });

        stopwatch_reset.setBackground(new java.awt.Color(0, 0, 0));
        stopwatch_reset.setForeground(new java.awt.Color(255, 255, 255));
        stopwatch_reset.setText("reset");
        stopwatch_reset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stopwatch_reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopwatch_resetMouseClicked(evt);
            }
        });
        stopwatch_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopwatch_resetActionPerformed(evt);
            }
        });

        stopwatch_stop.setBackground(new java.awt.Color(0, 0, 204));
        stopwatch_stop.setForeground(new java.awt.Color(255, 255, 255));
        stopwatch_stop.setText("stop");
        stopwatch_stop.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stopwatch_stop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopwatch_stopMouseClicked(evt);
            }
        });
        stopwatch_stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopwatch_stopActionPerformed(evt);
            }
        });

        hour.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hour.setText("00:");

        second.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        second.setText("00:");

        minute.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minute.setText("00:");

        millisecond.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        millisecond.setText("000");

        javax.swing.GroupLayout stopwatchLayout = new javax.swing.GroupLayout(stopwatch);
        stopwatch.setLayout(stopwatchLayout);
        stopwatchLayout.setHorizontalGroup(
                stopwatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stopwatchLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(96, 96, 96))
                .addGroup(stopwatchLayout.createSequentialGroup()
                        .addGroup(stopwatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(stopwatchLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(stopwatch_start, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(stopwatch_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(stopwatch_stop, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(stopwatchLayout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(hour)
                                        .addGap(18, 18, 18)
                                        .addComponent(minute)
                                        .addGap(18, 18, 18)
                                        .addComponent(second)
                                        .addGap(18, 18, 18)
                                        .addComponent(millisecond)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        stopwatchLayout.setVerticalGroup(
                stopwatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(stopwatchLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(51, 51, 51)
                        .addGroup(stopwatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(hour)
                                .addComponent(second)
                                .addComponent(minute)
                                .addComponent(millisecond))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(stopwatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(stopwatch_start, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(stopwatch_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(stopwatch_stop, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(stopwatch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(countdown, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(current_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(countup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(stopwatch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(current_time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(countup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(countdown, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stopwatch_startMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopwatch_startMouseClicked

    }//GEN-LAST:event_stopwatch_startMouseClicked

    private void stopwatch_resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopwatch_resetMouseClicked
        state = false;
    }//GEN-LAST:event_stopwatch_resetMouseClicked

    private void stopwatch_stopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopwatch_stopMouseClicked

    }//GEN-LAST:event_stopwatch_stopMouseClicked

    private void countdown_stopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_countdown_stopMouseClicked
        timer.stop();
    }//GEN-LAST:event_countdown_stopMouseClicked

    private void countup_stopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_countup_stopMouseClicked
        timer.stop();

    }//GEN-LAST:event_countup_stopMouseClicked

    private void stopwatch_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopwatch_startActionPerformed
        state = true;

        Thread t;
        t = new Thread() {
            public void run() {
                for (;;) {
                    if (state == true) {
                        try {
                            sleep(1);
                            if (milliseconds > 1000) {
                                milliseconds = 0;
                                seconds++;
                            }
                            if (seconds > 60) {
                                milliseconds = 0;
                                seconds = 0;
                                minutes++;
                            }
                            if (minutes > 60) {
                                milliseconds = 0;
                                seconds = 0;
                                minutes = 0;
                                hours++;
                            }

                            millisecond.setText(milliseconds + " ");

                            milliseconds++;
                            second.setText(seconds + " : ");
                            minute.setText(minutes + " : ");
                            hour.setText(hours + " : ");
                        } catch (Exception e) {

                        }
                    } else {
                        break;
                    }
                }
            }
        };
        t.start();

    }//GEN-LAST:event_stopwatch_startActionPerformed

    private void stopwatch_stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopwatch_stopActionPerformed
        state = false;
    }//GEN-LAST:event_stopwatch_stopActionPerformed

    private void stopwatch_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopwatch_resetActionPerformed
        state = false;

        hours = 0;
        minutes = 0;
        seconds = 0;
        milliseconds = 0;

        hour.setText("00: ");
        minute.setText("00: ");
        second.setText("00: ");
        millisecond.setText("00");
    }//GEN-LAST:event_stopwatch_resetActionPerformed

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
        states = true;
        Thread t = new Thread() {
            public void run() {
                for (;;) {
                    if (states == true) {
                        try {
                            do {
                                date = new Date();
                                SimpleDateFormat simple = new SimpleDateFormat("hh:mm:ss a");
                                time.setText(simple.format(date));
                                Thread.sleep(1000);  // 1000 = 1 second
                            } while (thread.isAlive());
                        } catch (Exception e) {

                        }

                    } else {
                        break;
                    }
                }
            }

        };
        t.start();

    }//GEN-LAST:event_timeActionPerformed

    private void countdown_startMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_countdown_startMouseClicked

    }//GEN-LAST:event_countdown_startMouseClicked

    private void countdown_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countdown_startActionPerformed
        timer = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                counter--;
                Downcount.setText("" + counter);
            }

        });
        timer.start();

    }//GEN-LAST:event_countdown_startActionPerformed

    private void countup_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countup_startActionPerformed
        timer = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                Upcount.setText("" + count);
            }

        });
        timer.start();
    }//GEN-LAST:event_countup_startActionPerformed

    private void countup_stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countup_stopActionPerformed
        timer.stop();
    }//GEN-LAST:event_countup_stopActionPerformed

    private void countdown_stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countdown_stopActionPerformed
        timer.stop();
    }//GEN-LAST:event_countdown_stopActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Watch s = new Watch();
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Watch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Watch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Watch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Watch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Watch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Downcount;
    private javax.swing.JLabel Upcount;
    private javax.swing.JPanel countdown;
    private javax.swing.JButton countdown_start;
    private javax.swing.JButton countdown_stop;
    private javax.swing.JPanel countup;
    private javax.swing.JButton countup_start;
    private javax.swing.JButton countup_stop;
    private javax.swing.JPanel current_time;
    private javax.swing.JLabel hour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel millisecond;
    private javax.swing.JLabel minute;
    private javax.swing.JLabel second;
    private javax.swing.JPanel stopwatch;
    private javax.swing.JButton stopwatch_reset;
    private javax.swing.JButton stopwatch_start;
    private javax.swing.JButton stopwatch_stop;
    private javax.swing.JButton time;
    // End of variables declaration//GEN-END:variables

}
