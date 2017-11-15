/*
 * Yin Liu
 */
package tt;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import javax.swing.JFrame;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseInputListener;
import static java.lang.Math.abs;

/**
 *
 * @author Yin Liu
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
//        manager.addKeyEventDispatcher(new KeyDispatcher());
        try {

            GlobalScreen.registerNativeHook();
        } catch (NativeHookException ex) {
            System.err.println("There was a problem registering the native hook.");
            System.err.println(ex.getMessage());

            System.exit(1);
        }
        GlobalMouseListenerExample example = new GlobalMouseListenerExample();
        GlobalScreen.addNativeMouseListener(example);
        GlobalScreen.addNativeMouseMotionListener(example);

        GlobalScreen.addNativeKeyListener(new GlobalKeyListenerExample());

    }

    private int mouseX;
    private int mouseY;
    private int rrr = -1;
    private int ggg = -1;
    public double ascendtimer = 1; //hour

    class GlobalMouseListenerExample implements NativeMouseInputListener {

        @Override
        public void nativeMouseClicked(NativeMouseEvent e) {

            if (rrr == 0) {
                mouseX = e.getX();
                mouseY = e.getY();
                tlX.setText(mouseX + "");
                tlY.setText(mouseY + "");
                rrr = -1;
            } else if (rrr == 1) {
                mouseX = e.getX();
                mouseY = e.getY();
                brX.setText(mouseX + "");
                brY.setText(mouseY + "");
                rrr = -1;
            }

            if (ggg == 0) {
                mouseX = e.getX();
                mouseY = e.getY();
                x1.setText(mouseX + "");
                y1.setText(mouseY + "");
                ggg = -1;
            } else if (ggg == 1) {
                mouseX = e.getX();
                mouseY = e.getY();
                x2.setText(mouseX + "");
                y2.setText(mouseY + "");
                ggg = -1;
            } else if (ggg == 2) {
                mouseX = e.getX();
                mouseY = e.getY();
                x3.setText(mouseX + "");
                y3.setText(mouseY + "");
                ggg = -1;
            } else if (ggg == 3) {
                mouseX = e.getX();
                mouseY = e.getY();
                x4.setText(mouseX + "");
                y4.setText(mouseY + "");
                ggg = -1;
            } else if (ggg == 4) {
                mouseX = e.getX();
                mouseY = e.getY();
                x5.setText(mouseX + "");
                y5.setText(mouseY + "");
                ggg = -1;
            } else if (ggg == 5) {
                mouseX = e.getX();
                mouseY = e.getY();
                x6.setText(mouseX + "");
                y6.setText(mouseY + "");
                ggg = -1;
            }
//            System.out.println("Mouse Clicked: " + e.getClickCount());
        }

        @Override
        public void nativeMousePressed(NativeMouseEvent e) {
//            System.out.println("Mouse Pressed: " + e.getButton());
        }

        @Override
        public void nativeMouseReleased(NativeMouseEvent e) {
//            System.out.println("Mouse Released: " + e.getButton());
        }

        @Override
        public void nativeMouseMoved(NativeMouseEvent e) {
//            System.out.println("Mouse Moved: " + e.getX() + ", " + e.getY());
        }

        @Override
        public void nativeMouseDragged(NativeMouseEvent e) {
//            System.out.println("Mouse Dragged: " + e.getX() + ", " + e.getY());
        }
    }

    class GlobalKeyListenerExample implements NativeKeyListener {

        @Override
        public void nativeKeyPressed(NativeKeyEvent e) {
//            System.out.println("Key Pressed: " + NativeKeyEvent.getKeyText(e.getKeyCode()));

            if (e.getKeyCode() == NativeKeyEvent.VC_ESCAPE) {
                //GlobalScreen.unregisterNativeHook();
                //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);

            }
            if (e.getKeyCode() == NativeKeyEvent.VC_BACKQUOTE) {
                running = false;
                gilding = false;
            }
        }

        @Override
        public void nativeKeyReleased(NativeKeyEvent e) {
//            System.out.println("Key Released: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
        }

        @Override
        public void nativeKeyTyped(NativeKeyEvent e) {
//            System.out.println("Key Typed: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        tlX = new javax.swing.JLabel();
        levelButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        tabButton = new javax.swing.JButton();
        scrollButton = new javax.swing.JButton();
        brX = new javax.swing.JLabel();
        tlY = new javax.swing.JLabel();
        brY = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        reText = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        gButton1 = new javax.swing.JButton();
        gButton2 = new javax.swing.JButton();
        gButton3 = new javax.swing.JButton();
        x1 = new javax.swing.JLabel();
        y1 = new javax.swing.JLabel();
        y2 = new javax.swing.JLabel();
        x2 = new javax.swing.JLabel();
        y3 = new javax.swing.JLabel();
        x3 = new javax.swing.JLabel();
        gildButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        gButton4 = new javax.swing.JButton();
        x4 = new javax.swing.JLabel();
        y4 = new javax.swing.JLabel();
        gButton5 = new javax.swing.JButton();
        x5 = new javax.swing.JLabel();
        y5 = new javax.swing.JLabel();
        gButton6 = new javax.swing.JButton();
        x6 = new javax.swing.JLabel();
        y6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        levelButton.setText("start");
        levelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelButtonActionPerformed(evt);
            }
        });

        jLabel13.setText("Click ` to stop");

        tabButton.setText("Get Top Left");
        tabButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabButtonActionPerformed(evt);
            }
        });

        scrollButton.setText("Get Bottom Right");
        scrollButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scrollButtonActionPerformed(evt);
            }
        });

        jCheckBox1.setText("hide this window");

        jLabel5.setText("Remaining");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrollButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tabButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tlX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(brX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tlY, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(brY, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(levelButton)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reText, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tabButton)
                    .addComponent(tlX, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tlY, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(scrollButton, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(brX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(brY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(163, 163, 163)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(levelButton)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addComponent(reText, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("AutoLevel", jPanel5);

        gButton1.setText("Get 1");
        gButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gButton1ActionPerformed(evt);
            }
        });

        gButton2.setText("Get 2");
        gButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gButton2ActionPerformed(evt);
            }
        });

        gButton3.setText("Get 3");
        gButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gButton3ActionPerformed(evt);
            }
        });

        gildButton.setText("Start");
        gildButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gildButtonActionPerformed(evt);
            }
        });

        jLabel14.setText("Click ` to stop");

        gButton4.setText("Get 4");
        gButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gButton4ActionPerformed(evt);
            }
        });

        gButton5.setText("Get 5");
        gButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gButton5ActionPerformed(evt);
            }
        });

        gButton6.setText("Get 6");
        gButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(gButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(gButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(gButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(y3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14)
                    .addComponent(gildButton)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(gButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(y4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(gButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(y5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(gButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(y6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(gButton1)
                    .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(gButton2)
                    .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(gButton3)
                    .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(gButton4)
                    .addComponent(x4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(gButton5)
                    .addComponent(x5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(gButton6)
                    .addComponent(x6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gildButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        jTabbedPane1.addTab("BuyGilds", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gButton6ActionPerformed
        // TODO add your handling code here:
        ggg = 5;
    }//GEN-LAST:event_gButton6ActionPerformed

    private void gButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gButton5ActionPerformed
        // TODO add your handling code here:
        ggg = 4;
    }//GEN-LAST:event_gButton5ActionPerformed

    private void gButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gButton4ActionPerformed
        // TODO add your handling code here:
        ggg = 3;
    }//GEN-LAST:event_gButton4ActionPerformed

    private void gildButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gildButtonActionPerformed
        // TODO add your handling code here:
        gilding = true;
        int l1[] = {Integer.valueOf(x1.getText()), Integer.valueOf(y1.getText())};
        int l2[] = {Integer.valueOf(x2.getText()), Integer.valueOf(y2.getText())};
        int l3[] = {Integer.valueOf(x3.getText()), Integer.valueOf(y3.getText())};
        int l4[] = {Integer.valueOf(x4.getText()), Integer.valueOf(y4.getText())};
        int l5[] = {Integer.valueOf(x5.getText()), Integer.valueOf(y5.getText())};
        int l6[] = {Integer.valueOf(x6.getText()), Integer.valueOf(y6.getText())};
        AG(l1, l2, l3, l4, l5, l6);
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_gildButtonActionPerformed

    private void gButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gButton3ActionPerformed
        // TODO add your handling code here:
        ggg = 2;
    }//GEN-LAST:event_gButton3ActionPerformed

    private void gButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gButton2ActionPerformed
        // TODO add your handling code here:
        ggg = 1;
    }//GEN-LAST:event_gButton2ActionPerformed

    private void gButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gButton1ActionPerformed
        // TODO add your handling code here:
        ggg = 0;
    }//GEN-LAST:event_gButton1ActionPerformed

    private void scrollButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scrollButtonActionPerformed
        // TODO add your handling code here:
        rrr = 1;
    }//GEN-LAST:event_scrollButtonActionPerformed

    private void tabButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabButtonActionPerformed
        // TODO add your handling code here:
        rrr = 0;
    }//GEN-LAST:event_tabButtonActionPerformed

    private void levelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelButtonActionPerformed
        // TODO add your handling code here:
        running = true;

        //        jLabel2.setText(width + " " + height + "");
        int[] tl = {Integer.valueOf(tlX.getText()), Integer.valueOf(tlY.getText())};
        int[] br = {Integer.valueOf(brX.getText()), Integer.valueOf(brY.getText())};
        AL(tl, br);
        if (jCheckBox1.isSelected()) {
            this.setState(JFrame.ICONIFIED);
        }
    }//GEN-LAST:event_levelButtonActionPerformed

    private boolean running = true;

    void AL(int[] tl, int[] br) {
        class AutoLevel implements Runnable {

            int[] tl;
            int[] br;

            AutoLevel(int[] i, int[] j) {
                tl = i;
                br = j;

            }

            @Override
            public void run() {
                try {
                    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                    double width = screenSize.getWidth();
                    double height = screenSize.getHeight();
                    double size = 1;
                    if (abs(width - 3000) < 10 && abs(height - 2000) < 10) {
                        size = 2.0;
                    }

                    int flag = 0;

                    //tab1 location
                    int[] tab1 = new int[2];
                    tab1[0] = tl[0];
                    tab1[1] = br[1];

                    //sword master location
                    int[] sw = new int[2];
                    sw[0] = br[0];
                    sw[1] = (int) (tl[1] + (br[1] - tl[1]) * 0.7);

                    //tab2 location
                    int[] tab2 = new int[2];
                    tab2[0] = (int) (tl[0] + (br[0] - tl[0]) * 0.2);
                    tab2[1] = br[1];

                    //sword master location
                    int[] hbbottom = new int[2];
                    hbbottom[0] = (int) (tl[0] + (br[0] - tl[0]) * 0.85);
                    hbbottom[1] = (int) (tl[1] + (br[1] - tl[1]) * 0.5);

                    int[] hero = new int[2];
                    hero[0] = br[0];
                    hero[1] = (int) (tl[1] + (br[1] - tl[1]) * 0.85);

                    //Yes location
                    int[] yes = new int[2];
                    yes[0] = (int) (tl[0] + (br[0] - tl[0]) * 0.65);
                    yes[1] = (int) (tl[1] + (br[1] - tl[1]) * 0.8);

                    //Robot
                    Robot robot = new Robot();
                    while (running) {

                        flag++;
                        if (flag % 2 == 0) {
                            //click sword master tab
                            robot.delay(250);
                            robot.mouseMove((int) (tab1[0] * size), (int) (tab1[1] * size));
                            robot.mousePress(InputEvent.BUTTON1_MASK);
                            robot.mouseRelease(InputEvent.BUTTON1_MASK);

                            //level up sword master
                            robot.delay(250);
                            robot.mouseMove((int) (sw[0] * size), (int) (sw[1] * size));
                            robot.mousePress(InputEvent.BUTTON1_MASK);
                            robot.mouseRelease(InputEvent.BUTTON1_MASK);

                            //click sword master tab
                            robot.delay(250);
                            robot.mouseMove((int) (tab1[0] * size), (int) (tab1[1] * size));
                            robot.mousePress(InputEvent.BUTTON1_MASK);
                            robot.mouseRelease(InputEvent.BUTTON1_MASK);
                        }

                        if (flag % 2 == 1) {
                            //click hero tab
                            robot.delay(250);
                            robot.mouseMove((int) (tab2[0] * size), (int) (tab2[1] * size));
                            robot.mousePress(InputEvent.BUTTON1_MASK);
                            robot.mouseRelease(InputEvent.BUTTON1_MASK);

                            //level up hero
                            robot.delay(250);
                            robot.mouseMove((int) (hero[0] * size), (int) (hero[1] * size));
                            robot.mousePress(InputEvent.BUTTON1_MASK);
                            robot.mouseRelease(InputEvent.BUTTON1_MASK);

                            robot.delay(250);
                            robot.mouseWheel(100);

                            //click hero tab
                            robot.delay(250);
                            robot.mouseMove((int) (tab2[0] * size), (int) (tab2[1] * size));
                            robot.mousePress(InputEvent.BUTTON1_MASK);
                            robot.mouseRelease(InputEvent.BUTTON1_MASK);
                            //click square
                        }
                        for (int a = 0; a < 50; a++) {
                            if (running) {
                                for (int i = 0; i < 6; i++) {
                                    for (int j = 0; j < 8; j++) {
                                        //click location
                                        int[] top = new int[2];
                                        top[0] = (int) (tl[0] + (br[0] - tl[0]) * 0.02 + (br[0] - tl[0]) * 0.98 * 0.142857 * j);
                                        top[1] = (int) (tl[1] + (br[1] - tl[1]) * 0.18 + (br[1] - tl[1]) * 0.9 * i * 0.1667 * 0.45);

                                        robot.mouseMove((int) (top[0] * size), (int) (top[1] * size));
                                        robot.delay(25);
                                        robot.mousePress(InputEvent.BUTTON1_MASK);
                                        robot.delay(25);
                                        robot.mouseRelease(InputEvent.BUTTON1_MASK);
                                    }
                                }
                                //click yes
                                robot.mouseMove((int) (yes[0] * size), (int) (yes[1] * size));
                                robot.delay(25);
                                robot.mousePress(InputEvent.BUTTON1_MASK);
                                robot.delay(25);
                                robot.mouseRelease(InputEvent.BUTTON1_MASK);
                            }

                        }

//                        robot.delay(100);
//                        robot.keyRelease(KeyEvent.VK_Q);
//                            Thread.sleep(100);
//                            robot.keyPress(KeyEvent.VK_T);
//                            robot.keyRelease(KeyEvent.VK_T);
                    }

                    Thread.currentThread()
                            .interrupt();

                } catch (AWTException ex) {
                    //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        Thread t = new Thread(new AutoLevel(tl, br));

        t.start();
    }

    private boolean gilding = true;

    void AG(int[] l1, int[] l2, int[] l3, int[] l4, int[] l5, int[] l6) {
        class AutoGild implements Runnable {

            int[] l1;
            int[] l2;
            int[] l3;
            int[] l4;
            int[] l5;
            int[] l6;

            AutoGild(int[] i, int[] j, int[] k, int[] l, int[] m, int[] n) {
                l1 = i;
                l2 = j;
                l3 = k;
                l4 = l;
                l5 = m;
                l6 = n;
            }

            @Override
            public void run() {
                try {
                    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                    double width = screenSize.getWidth();
                    double height = screenSize.getHeight();
                    double size = 1;
                    if (abs(width - 3000) < 10 && abs(height - 2000) < 10) {
                        size = 2.0;
                    }

                    Robot robot = new Robot();
                    while (gilding) {

                        Thread.sleep(400);
                        robot.mouseMove((int) (l1[0] * size), (int) (l1[1] * size));
                        robot.mousePress(InputEvent.BUTTON1_MASK);
                        robot.mouseRelease(InputEvent.BUTTON1_MASK);

                        Thread.sleep(400);
                        robot.mouseMove((int) (l2[0] * size), (int) (l2[1] * size));
                        robot.mousePress(InputEvent.BUTTON1_MASK);
                        robot.mouseRelease(InputEvent.BUTTON1_MASK);

                        Thread.sleep(400);
                        robot.mouseMove((int) (l3[0] * size), (int) (l3[1] * size));
                        robot.mousePress(InputEvent.BUTTON1_MASK);
                        robot.mouseRelease(InputEvent.BUTTON1_MASK);

                        Thread.sleep(400);
                        robot.mouseMove((int) (l4[0] * size), (int) (l4[1] * size));
                        robot.mousePress(InputEvent.BUTTON1_MASK);
                        robot.mouseRelease(InputEvent.BUTTON1_MASK);

                        Thread.sleep(400);
                        robot.mouseMove((int) (l5[0] * size), (int) (l5[1] * size));
                        robot.mousePress(InputEvent.BUTTON1_MASK);
                        robot.mouseRelease(InputEvent.BUTTON1_MASK);

                        Thread.sleep(1100);
                        robot.mouseMove((int) (l6[0] * size), (int) (l6[1] * size));
                        robot.mousePress(InputEvent.BUTTON1_MASK);
                        robot.mouseRelease(InputEvent.BUTTON1_MASK);

                    }
                    Thread.currentThread().interrupt();

                } catch (AWTException | InterruptedException ex) {
                    // Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        Thread t = new Thread(new AutoGild(l1, l2, l3, l4, l5, l6));

        t.start();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            // java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel brX;
    private javax.swing.JLabel brY;
    private javax.swing.JButton gButton1;
    private javax.swing.JButton gButton2;
    private javax.swing.JButton gButton3;
    private javax.swing.JButton gButton4;
    private javax.swing.JButton gButton5;
    private javax.swing.JButton gButton6;
    private javax.swing.JButton gildButton;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton levelButton;
    private javax.swing.JLabel reText;
    private javax.swing.JButton scrollButton;
    private javax.swing.JButton tabButton;
    private javax.swing.JLabel tlX;
    private javax.swing.JLabel tlY;
    private javax.swing.JLabel x1;
    private javax.swing.JLabel x2;
    private javax.swing.JLabel x3;
    private javax.swing.JLabel x4;
    private javax.swing.JLabel x5;
    private javax.swing.JLabel x6;
    private javax.swing.JLabel y1;
    private javax.swing.JLabel y2;
    private javax.swing.JLabel y3;
    private javax.swing.JLabel y4;
    private javax.swing.JLabel y5;
    private javax.swing.JLabel y6;
    // End of variables declaration//GEN-END:variables

}
