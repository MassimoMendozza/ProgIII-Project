package mx.Post.Server.Network;

public class PostalBag {

    enum MessageType {
        LOGIN_CREDENTIALS,
        LOGIN_ACCOUNT,
        ACCOUNT_INFO,
        ACCOUNT,
        MAILBOX_DOWNLOAD,
        MAILBOX,
        MAIL_IN,
        MAIL_OUT
    }
    MessageType messageType;
    Object payload;
    public PostalBag(MessageType messageType, Object payload) {
        this.messageType = messageType;
        this.payload = payload;
    }
}
