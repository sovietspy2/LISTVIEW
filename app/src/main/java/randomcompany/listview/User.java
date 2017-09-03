package randomcompany.listview;

import java.io.Serializable;

/**
 * Created by hang1barnab502 on 2017.09.03..
 */

public class User implements Serializable{
    public String name;
    public String hometown;
    public String id;

    public User(String name, String hometown, String id) {
        this.name = name;
        this.hometown = hometown;
        this.id = id;
    }


}