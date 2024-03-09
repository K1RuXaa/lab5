package spaceMarines;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import static spaceMarines.MyScanner.Scan;

public class Chapter implements Serializable {
    @JsonProperty("chapterName")
    private String name; //Поле не может быть null, Строка не может быть пустой
    @JsonProperty("parentLegion")
    private String parentLegion;
    public void setName(String name) {
        this.name = name;
    }

    public void setParentLegion(String parentLegion) {
        this.parentLegion = parentLegion;
    }
    @Override
    public String toString(){
        return ("\n\tname: "+name+"\n\tparentLegion: "+parentLegion);
    }
    public void makeChapter(){
        while (true){
            System.out.print("Введите имя для Chapter (подразделения): ");
            String name = Scan();
            if (name.replaceAll(" ","") == ""){
                System.out.println("Вы ввели пустую строку! ");
            }else {
                setName(name);
                break;
            }
        }
        System.out.println("Введите parentLegion (военная часть): ");
        String parentLegion = Scan();
        if (parentLegion.replaceAll(" ","") == ""){
            this.parentLegion = null;
        }else {
            setParentLegion(parentLegion);
        }
    }
}
