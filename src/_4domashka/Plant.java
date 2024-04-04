package _4domashka;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Plant implements Externalizable{
    private String name;
    private String higth;
    private String wigth;
    private String type;
    private Boolean isWild;

    public Plant(String name, String wigth, String higth, String type, Boolean isWild){
        this.name=name;
        this.wigth=wigth;
        this.higth=higth;
        this.isWild=isWild;
        this.type=type;
    }




    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.higth);
        objectOutput.writeObject(this.isWild);
        objectOutput.writeObject(this.wigth);
        objectOutput.writeObject(this.name);
        objectOutput.writeObject(this.type);
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        this.type = (String) objectInput.readObject();
        this.higth = (String) objectInput.readObject();
        this.isWild= (Boolean) objectInput.readObject();
        this.wigth = (String) objectInput.readObject();
        this.name= (String) objectInput.readObject();
    }
}
