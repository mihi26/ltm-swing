package controller;

import model.Medicine;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.List;
import model.Use;

public class RMIMedicineManageControl {
    private String serverHost = "localhost";
    private int serverPort = 3232;
    private RMISearchMedicineInterface rmiServer;
    private Registry registry;
    private String rmiService = "rmiMedicineManagementServer";

    public RMIMedicineManageControl() {
//        view.addLoginListener(new RMIMedicineManageControl.SearchListener());
        try {
            // lay the dang ki
            registry = LocateRegistry.getRegistry(serverHost, serverPort);
            // tim kiem RMI server
            rmiServer = (RMISearchMedicineInterface) (registry.lookup(rmiService));
        } catch (RemoteException e) {
//            view.showMessage(e.getStackTrace().toString());
            e.printStackTrace();
        } catch (NotBoundException e) {
//            view.showMessage(e.getStackTrace().toString());
            e.printStackTrace();
        }
    }
    
    public Medicine addMedicine(String name, long price, String type, String uses) {
        Medicine medicine = new Medicine();
        try {
            medicine = rmiServer.addMedicine(name, price, type, uses);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return medicine;
    }
    
    public Medicine updateMedicine(int id, String name, long price, String type, String uses) {
        Medicine medicine = new Medicine();
        try {
            medicine = rmiServer.updateMedicine(id, name, price, type, uses);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return medicine;
    }
    
    public boolean deleteMedicine(int id) {
        try {
            return rmiServer.deleteMedicine(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public Use addUse(String name, String description) {
        Use use = new Use();
        try {
            use = rmiServer.addUse(name, description);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return use;
    }
    
    public Use updateUse(int id, String name, String description) {
        Use use = new Use();
        try {
            use = rmiServer.updateUse(id, name, description);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return use;
    }
    
    public boolean deleteUse(int id) {
        try {
            return rmiServer.deleteUse(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Medicine> SearchMedicines(String keyword) {
        List listMedicine = new ArrayList<Medicine>();
        try {
                listMedicine = rmiServer.searchMedicine(keyword);
            } catch (Exception ex) {
                ex.printStackTrace();
        }
        return listMedicine;
    }
    
    public List<Use> SearchUses(String keyword) {
        List listUse = new ArrayList<Use>();
        try {
                listUse = rmiServer.searchUses(keyword);
            } catch (Exception ex) {
                ex.printStackTrace();
        }
        return listUse;
    }
}
