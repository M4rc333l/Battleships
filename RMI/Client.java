package RMI;

import Game.Game;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    private final BattleshipServer server;

    /**
     * Konstruktor des Clients um eine Verbindung aufzubauen wie auch das Spiel zu Starten
     * @param ip
     * @param port
     * @throws RemoteException
     * @throws NotBoundException
     */
    public Client(String ip, int port) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry(ip,port);
        server = (BattleshipServer) registry.lookup("BattleshipServer");
    }

    /**
     * Client startet Spiel
     * @return
     */
    public String method() {
        Game game = new Game(server);
        game.game(false);
        return "started Client";
    }
}
