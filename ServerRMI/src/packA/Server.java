package packA;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/**
 *
 * @author hafid
 */
public class Server
        extends UnicastRemoteObject
        implements InterfaceRMI {

    CrudCSV db;

    public Server() throws RemoteException {
        super();
        
    }

    public static void main(String[] args)
            throws RemoteException {
        Server s = new Server();
        // TODO code application logic here
        Registry reg = LocateRegistry.createRegistry(1111);
        reg.rebind("server", s);
        System.out.println("Server berjalan");

    }

    @Override
    public int ticket_get(String category) {
        db = new CrudCSV("queue.csv");
        Map<Integer, String[]> data = db.search("category", category);
        int i = 0;
        int queue = 0;
        for (String[] d : data.values()) {
            queue = Integer.parseInt(d[2]);
            if (++i > data.size()) {
                break;
            }
        }
        queue++;
        String[] value = {category, String.valueOf(queue)};
        db.insert(value);
        System.out.println(Arrays.toString(value));

        return queue;
    }
}
