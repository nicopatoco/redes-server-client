package edu.utn.tpfinal.server;

import java.net.Socket;

public interface IServer {
    void setSocket(Socket client);
    void init();
    void disconnect();
    void start();
}
