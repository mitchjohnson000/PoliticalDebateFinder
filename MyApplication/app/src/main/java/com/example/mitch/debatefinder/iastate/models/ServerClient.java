package com.example.mitch.debatefinder.iastate.models;

/**
 * Created by nate on 3/8/17.
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.net.Socket;

public class ServerClient {

    public ServerClient() throws Exception {
    }

    public String queryServer(String inputString) throws Exception {

        String outputSentence = "";

        //Byte array to be filled by the server
        byte[] fromserver = new byte[256];

        //Initialize the connection to the static IP here
        Socket clientSocket = new Socket("10.0.0.19", 5555);

        BufferedOutputStream outToServer = new BufferedOutputStream(clientSocket.getOutputStream());

        BufferedInputStream inFromServer = new BufferedInputStream(clientSocket.getInputStream());

        byte[] b = inputString.getBytes();
        outToServer.flush();
        outToServer.write(b, 0, inputString.length());
        outToServer.flush();

        //read consumes the first character
        int consume = inFromServer.read();

        while (inFromServer.available() > 0) {
            int read = inFromServer.read(fromserver, 0, fromserver.length);
                if (read <= 0) {
                    break;
                }
            }

        outputSentence = new String(fromserver);
        System.out.println("FROM SERVER: " + outputSentence);

        clientSocket.close();

        return outputSentence;
    }

}

