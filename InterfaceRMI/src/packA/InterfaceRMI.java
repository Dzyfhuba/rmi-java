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

    public int program(int k1, int k2) throws RemoteException;

    public int ticket_get(String category) throws RemoteException; // get new ticket

    public void ticket_post(String ticket) throws RemoteException; // post / store ticket to list

    public void email_post(String ticket) throws RemoteException; // send ticket to email
}
