package ex1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VersionControl {
    private HashMap<Integer, FileSnapshot> versions = new HashMap<Integer, FileSnapshot>();
    private static int version;

    public void addFileSnapshot(FileSnapshot fileSnapshot){
        versions.put(version,fileSnapshot);
    }
    public FileSnapshot getFSByVersion(int version){
        if(versions.containsKey(version)){
            return versions.get(version);
        }
        return null;
    }
    public void listSnapshotList(){
        //versions.forEach(version,file);
        for (Map.Entry<Integer, FileSnapshot> entry : versions.entrySet()) {
            System.out.println("details " + entry.getValue());
        }
    }
    public static int getNextVersion(){
        version++;
        return version;
    }
}
