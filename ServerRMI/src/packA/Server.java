package packA;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author hafid
 */
public class Server
        extends UnicastRemoteObject
        implements InterfaceRMI {

    public Server() throws RemoteException {
        super();
    }

    @Override
    public int program(int k1, int k2)
            throws RemoteException {
        return k1 * k2;
    }

    public static void main(String[] args)
            throws RemoteException {
        Server s = new Server();
        // TODO code application logic here
        Registry reg = LocateRegistry.createRegistry(1111);
        reg.rebind("server", s);
        System.out.println("Server berjalan");
    }
}
