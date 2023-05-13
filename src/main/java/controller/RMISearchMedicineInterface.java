package controller;

import model.Medicine;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Use;

public interface RMISearchMedicineInterface extends Remote {
    public List<Medicine> searchMedicine(String name) throws RemoteException;
    public List<Use> searchUses(String name) throws RemoteException;
    public Medicine addMedicine(String name, long price, String type, String uses) throws RemoteException;
    public Use addUse(String name, String description ) throws RemoteException;
    public Use updateUse(int id, String name, String description ) throws RemoteException;
    public boolean deleteUse(int id ) throws RemoteException;
    public Medicine updateMedicine(int id, String name, long price, String type, String uses) throws RemoteException;
    public boolean deleteMedicine(int id ) throws RemoteException;
}
