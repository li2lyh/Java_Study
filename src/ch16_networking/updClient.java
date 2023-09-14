package ch16_networking;

import java.net.*;
import java.io.*;

public class updClient {
    public void start() throws IOException, UnknownHostException {
        DatagramSocket datagramSocket = new DatagramSocket();
        InetAddress serverAddress = InetAddress.getByName("127.0.0.1");
        byte[] msg = new byte[100];
        DatagramPacket outPacket = new DatagramPacket(msg, 1, serverAddress, 7777);
        DatagramPacket inPacket = new DatagramPacket(msg, msg.length);
        datagramSocket.send(outPacket);
        datagramSocket.receive(inPacket);
        System.out.println("Current server time: " + new String(inPacket.getData()));
        datagramSocket.close();
    }

    public static void main(String[] args) {
        try {
            new updClient().start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
