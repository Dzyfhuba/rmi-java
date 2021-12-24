package packA;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author hafid
 */
public interface InterfaceRMI 
        extends Remote{
    public int program(int k1, int k2) 
            throws RemoteException;
}
