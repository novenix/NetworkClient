package edu.escuelaing.edu.co.datagrams;

import java.io.IOException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatagramTimeClient {
    private static String socketDate;
    public synchronized static void main(String[] args) {
         byte[] sendBuf = new byte[256];
         while (true){
             try {
                 DatagramSocket socket = new DatagramSocket();
                 socket.setSoTimeout(5000);
                 byte[] buf = new byte[256];
                 InetAddress address = InetAddress.getByName("127.0.0.1");
                 DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 4445);
                 socket.send(packet);
                 packet = new DatagramPacket(buf, buf.length);
                 try {
                     socket.receive(packet);
                     String received = new String(packet.getData(), 0, packet.getLength());

                     Thread.sleep(5000);
                     socketDate= received;
                     System.out.println("Date: " + socketDate);
                 }
                 catch (SocketTimeoutException exeption){
                     System.out.println("servidor apagado, no se obtiene la hora");
                     System.out.println("Date anterior: " + socketDate);
                 }



             } catch (IOException ex) {
                 Logger.getLogger(DatagramTimeClient.class.getName()).log(Level.SEVERE, null, ex);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }

    }
}
