package assetment;

import oracle.jvm.hotspot.jfr.Producer;

import javax.swing.*;

public class testalbum {
    public static void main(String[] args) {
        {
            String song, String trackname, String producer, int releaseyear;

            song = JOptionPane.showInputDialog("Name");
            Producer = JOptionPane.showInputDialog("Producer");
            releaseyear = JOptionPane.showInputDialog("release year");
            trackname = JOptionPane.showInputDialog("track");

            JOptionPane.showMessageDialog(null,"now playing track - details are as follow"+ song,
                    "",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
}
