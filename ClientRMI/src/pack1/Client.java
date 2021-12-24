package pack1;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import packA.InterfaceRMI;

/**
 *
 * @author hafid
 */
public class Client {

    /**
     * @throws java.rmi.RemoteException
     * @throws java.rmi.NotBoundException
     */
    InterfaceRMI k;

    public Client() throws RemoteException, NotBoundException {
        Registry reg = LocateRegistry.getRegistry("localhost", 1111);
        k = (InterfaceRMI) reg.lookup("server");
    }

    private void connectServer() throws RemoteException, NotBoundException {
        System.out.println("Hasil Perkalian adalah " + k.program(50, 30));
    }

    public static void main(String[] args)
            throws RemoteException, NotBoundException {
        // TODO code application logic here
        Client c = new Client();
        c.connectServer();
        GUI gui = new GUI();
    }

}
