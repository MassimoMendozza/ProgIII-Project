package mx.Post.Server.Network;

import mx.Post.Server.Entities.Account;

import java.io.*;
import java.net.Socket;

public class PostMan extends Thread{
    ObjectInputStream incomingBagStream;
    ObjectOutputStream outcomingBagStream;
    Socket socket;
    public PostMan(Socket socket, InputStream socketInputStream, OutputStream socketOutputStream) throws IOException {
        this.socket = socket;
        this.incomingBagStream = new ObjectInputStream(socketInputStream);
        this.outcomingBagStream = new ObjectOutputStream(socketOutputStream);
    }
    public void handleLogin(PostalBag loginBag){
        Account account = (Account) loginBag.payload;

    }
    @Override
    public void run() {
        PostalBag incomingBag = null;
        while(true){
            try {
                incomingBag = (PostalBag) incomingBagStream.readObject();
                switch (incomingBag.messageType){
                    case LOGIN_CREDENTIALS:
                        handleLogin(incomingBag);
                        break;
                    case LOGIN_ACCOUNT:
                        break;
                    case ACCOUNT_INFO:
                        break;
                    case ACCOUNT:
                        break;
                    case MAILBOX_DOWNLOAD:
                        break;
                    case MAILBOX:
                        break;
                    case MAIL_IN:
                        break;
                    case MAIL_OUT:
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
