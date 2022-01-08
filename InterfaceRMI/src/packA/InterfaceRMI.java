package packA;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author hafid
 */
public interface InterfaceRMI
        extends Remote {
    public int ticket_get(String category) throws RemoteException; // get new ticket
}
