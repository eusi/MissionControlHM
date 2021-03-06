package edu.hm.cs.sam.mc.jeromq;

import org.apache.log4j.Logger;
import org.jeromq.ZMQ;
import org.jeromq.ZMQ.Context;
import org.jeromq.ZMQ.Socket;

import java.io.Serializable;

import edu.hm.sam.Message;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * JeroMQ communication interface to the android devices. Its a test class in
 * first case.
 *
 * @author Christoph Friegel
 * @version 0.1
 */

public class JeroMQ {

    static final String TOPIC = "test";

    private static final Logger LOG = Logger.getLogger(JeroMQ.class.getName());

    private static Context ZCONTEXT = ZMQ.context(1);

    // response-test
    public boolean resTest() {
        boolean success = false;

        final Context context = ZMQ.context(1);
        final Socket socket = context.socket(ZMQ.REP);
        socket.bind("tcp://127.0.0.1:5555");

        final byte[] raw = socket.recv(0);
        final String rawMessage = new String(raw);
        success = rawMessage != null;
        LOG.debug(rawMessage);

        if (!success) {
            LOG.debug("getting message failed!");
        }

        return success;
    }

    // request-test
    public boolean reqTest() {
        boolean success = false;

        final Context context = ZMQ.context(1);
        final Socket socket = context.socket(ZMQ.REQ);
        socket.connect("tcp://localhost:5555");

        final String requestString = "message";
        final byte[] request = requestString.getBytes();
        success = socket.send(request, 0);

        if (!success) {
            LOG.debug("sending message failed!");
        }

        return success;
    }

    // publish-test
    public boolean pubTest() {
        boolean success = false;

        final Context context = ZMQ.context(1);
        final Socket publisher = context.socket(ZMQ.PUSH);
        publisher.bind("tcp://127.0.0.1:5563");

        publisher.setHWM(1000000);
        publisher.setSndHWM(1000000);

        publisher.sendMore(TOPIC);
        success = publisher.send("message number ");

        if (!success) {
            LOG.debug("getting message failed!");
        }

        return success;
    }

    // subscribe-test
    public boolean subTest() {
        boolean success = false;

        final Context context = ZMQ.context(1);
        final ZMQ.Socket subscriber = context.socket(ZMQ.SUB);
        subscriber.connect("tcp://127.0.0.1:5563");

        subscriber.setRcvHWM(1000000);
        subscriber.subscribe(TOPIC.getBytes());

        final String msg = subscriber.recvStr();
        success = msg != null;
        LOG.debug(msg);

        if (!success) {
            LOG.debug("sending message failed!");
        }

        return success;
    }

    public int takePhoto() {
        return 0;
    }

    public int getPicture() {
        return 0;
    }

    public int sendWlanData() {
        return 0;
    }

    public String getFtpData() {
        return null;
    }

    public int sendFtpData() {
        return 0;
    }

    public static void sendMessage(final String topic, final Message message) {
        final Socket socket = ZCONTEXT.socket(ZMQ.REQ);
        socket.connect("");
        socket.send(message.serialize());
        throw new NotImplementedException();
    }

    public static void sendSettingChange(final String topic, final Message message) {
        throw new NotImplementedException();
    }

    public static void addSubscriptionHandler(final String topic, final SubscriptionHandler handler) {
        throw new NotImplementedException();
    }

    public abstract class SubscriptionHandler<T extends Message & Serializable> {
        public abstract void handleSubscription(T subscription);
    }
}