package com.principale;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.voiture.Vehicule;

public class Garage {
	
	List <Vehicule> voiture = new ArrayList <Vehicule>();
	
	public String toString(){
		String str = "";
		str += "      *************************************\n";
		str += "      ******* Garage OpenClassRooms *******\n";
		str += "      *************************************\n";
		return str;
	}
	
	public void addVoiture(Vehicule nouvelleVoiture){
		voiture.add(nouvelleVoiture);
		System.out.println(nouvelleVoiture);
	}
	
    /*ObjectInputStream ois;
    ObjectOutputStream oos;
    
    try {
        oos = new ObjectOutputStream(
                new BufferedOutputStream(
                  new FileOutputStream(
                    new File("Garage.txt"))));
        
        System.out.println("lecture de Fichier");
        oos.writeObject(new Vehicule());
        for(int i = 0; i < voiture.size(); i++){
            System.out.println(voiture.get(i).toString());
        }
        oos.close();
        
        ois = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(
                                new File("Garage.txt"))));

        try{
            System.out.println(((Vehicule)ois.readObject()).toString());   
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
            ois.close();
        	
        } catch (FileNotFoundException e) {
          e.printStackTrace();
        } catch (IOException e) {
          e.printStackTrace();
        }     	
      }*/
}


