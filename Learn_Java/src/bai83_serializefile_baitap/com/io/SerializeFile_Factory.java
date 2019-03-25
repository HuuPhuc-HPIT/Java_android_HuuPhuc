package bai83_serializefile_baitap.com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import bai83_serializefile_baitap.com.model.DanhBa;

public class SerializeFile_Factory {
	public static boolean saveFile(ArrayList<DanhBa>dsDB, String path) {
		try {
			 FileOutputStream fos= new FileOutputStream(path);
			 ObjectOutputStream oss= new ObjectOutputStream(fos);
			 oss.writeObject(dsDB);
			 oss.close();
			 fos.close();
			 return true;
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}
	public static ArrayList<DanhBa> readFile(String path){
		ArrayList<DanhBa> dsDB= new ArrayList<DanhBa>();
		try {
			FileInputStream fis= new FileInputStream(path);
			ObjectInputStream ois= new ObjectInputStream(fis);
			Object data= ois.readObject();
			dsDB=(ArrayList<DanhBa>) data;
			ois.close();
			fis.close();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return dsDB;
	}
}
