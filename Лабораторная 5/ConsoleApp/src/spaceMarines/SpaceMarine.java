package spaceMarines;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

import static spaceMarines.MyScanner.Scan;

public class SpaceMarine implements Serializable {

        private long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
        private String name; //Поле не может быть null, Строка не может быть пустой
        private Coordinates coordinates = new Coordinates(); //Поле не может быть null
        //   private LocalDateTime creationDate = LocalDateTime.now(); //Поле не может быть null, Значение этого поля должно генерироваться автоматически
        private long health; //Значение поля должно быть больше 0
        private boolean loyal;
        private Weapon weaponType; //Поле может быть null

        public long getId() {
                return id;
        }

        public String getName() {
                return name;
        }

        public Coordinates getCoordinates() {
                return coordinates;
        }


  /*      public LocalDateTime getCreationDate() {
                return creationDate;
        }
*/
        public long getHealth() {
                return health;
        }

        public boolean isLoyal() {
                return loyal;
        }

        public Weapon getWeaponType() {
                return weaponType;
        }

        public MeleeWeapon getMeleeWeapon() {
                return meleeWeapon;
        }

        public Chapter getChapter() {
                return chapter;
        }

        private MeleeWeapon meleeWeapon; //Поле может быть null
        private Chapter chapter; //Поле может быть null
        public SpaceMarine(){
                setChapter();
                setId();
                setName();
                setHealth();
                setLoyal();
                setMeleeWeapon();
                setWeapon();
                System.out.println("SpaceMarine " + name+ " создан");

        }
        private void setChapter() {
                int chapterChoice;


                while (true) {
                        try {
                                System.out.println("Хотите добавить chapter? Для ответа \"Да\" введите 1 иначе введите 0");
                                chapterChoice = Integer.parseInt(Scan());
                                if (chapterChoice != 1 && chapterChoice != 0) {
                                        System.out.println("Введите 1 или 0!");
                                } else {
                                        break;
                                }
                        } catch (NumberFormatException e) {
                                System.out.println("Надо ввести число! (int)");
                        }
                }
                switch (chapterChoice){
                        case 1:
                                chapter = new Chapter();
                                chapter.makeChapter();
                                break; //ГЛЯНУТЬ БЕЗ БРЕЙКА
                        case 0:
                                break;
                }
        }
        private void setMeleeWeapon(){
                while (true) {
                        try {


                        System.out.println("Хотите ли вы дать оружие ближнего боя? Да - 1, Нет - 0");
                        int weaponDecide;
                        weaponDecide = Integer.parseInt(Scan());
                        if (weaponDecide == 0){
                                meleeWeapon = null;
                                break;
                        }else {
                                System.out.println("Введите оружие ближнего боя (CHAIN_SWORD,CHAIN_AXE,MANREAPER,POWER_BLADE,POWER_FIST)");
                                //МБ ТУТ try catch ПРОВЕРИТЬ!
                                String meleeWeaponChoice;
                                meleeWeaponChoice = Scan();
                                meleeWeaponChoice.replaceAll(" ", "");
                                if (meleeWeaponChoice.equals("CHAIN_SWORD") || meleeWeaponChoice.equals("CHAIN_AXE") | meleeWeaponChoice.equals("MANREAPER") || meleeWeaponChoice.equals("POWER_BLADE") || meleeWeaponChoice.equals("POWER_FIST")) {
                                        switch (meleeWeaponChoice) {
                                                case "CHAIN_SWORD":
                                                        meleeWeapon = MeleeWeapon.CHAIN_SWORD;
                                                        break;
                                                case "CHAIN_AXE":
                                                        meleeWeapon = MeleeWeapon.CHAIN_AXE;
                                                        break;
                                                case "MANREAPER":
                                                        meleeWeapon = MeleeWeapon.MANREAPER;
                                                        break;
                                                case "POWER_FIST":
                                                        meleeWeapon = MeleeWeapon.POWER_FIST;
                                                        break;
                                                case "POWER_BLADE":
                                                        meleeWeapon = MeleeWeapon.POWER_BLADE;
                                                        break;
                                        }
                                        break; //
                                } else {
                                        System.out.println("Введите одно из доступных оружий!");
                                }
                        }
                        }catch (NumberFormatException e){
                                System.out.println("Введите 1 или 0!");
                        }



                }

        }
        public void setWeapon(){
                try {
                        while (true){
                                System.out.println("Хотите ли вы выдать оружие? (1 - Да или 0 - Нет");
                                int weaponDecide = Integer.parseInt(Scan());
                                if (weaponDecide == 0){
                                        weaponType = null;
                                        break;
                                }else{
                                        System.out.println("Выберите оружие (BOLTGUN/BOLT_RIFLE/COMBI_PLASMA_GUN/FLAMER/INFERNO_PISTOL");
                                        String weaponChoice = Scan();
                                        weaponChoice.replaceAll(" ","");
                                        if (weaponChoice.equals("BOLTGUN") || weaponChoice.equals("BOLT_RIFLE") || weaponChoice.equals("COMBI_PLASMA_GUN") || weaponChoice.equals("FLAMER") || weaponChoice.equals("INFERNO_PISTOL")){
                                                switch (weaponChoice){
                                                        case "BOLTGUN":
                                                                weaponType = Weapon.BOLTGUN;
                                                                break;
                                                        case "BOLT_RIFLE":
                                                                weaponType = Weapon.BOLT_RIFLE;
                                                                break;
                                                        case "COMBI_PLASMA_GUN":
                                                                weaponType = Weapon.COMBI_PLASMA_GUN;
                                                                break;
                                                        case "FLAMER":
                                                                weaponType = Weapon.FLAMER;
                                                                break;
                                                        case "INFERNO_PISTOL":
                                                                weaponType = Weapon.INFERNO_PISTOL;
                                                                break;
                                                }
                                                break;
                                        }else {
                                                System.out.println("Выберите один из предложенный вариантов");
                                        }
                                }
                        }
                }catch (NumberFormatException e){
                        System.out.println("Введите 1 или 0"); // тут кста трай перед циклом while
                }
        }
        private void setHealth(){
                while(true){
                        System.out.print("Введите значение больше 0 (long)health: ");
                        try{
                                String sHealth = Scan();
                                health = Long.parseLong(sHealth);
                                if (health<=0){
                                        System.out.println("Значение health должно быть больше 0!");
                                }else{
                                        break;
                                }
                        }catch(NumberFormatException e){
                                System.out.println("Надо ввести long!");
                        }
                }
        }
        public void setId(){
                this.id = (int) (Math.random() * 1000000)+1; //только целая часть + 1 тк > 0
        }
        //пришлость сделать паблик тк взял за значение и его надо менять (для команды)
        private void setName() {
                while (true) {
                        System.out.print("Введите имя: ");
                        name = Scan();
                        if (name.replaceAll(" ", "").equals("")) {
                                System.out.println("Вы ввели пустую строчку! Имя не может быть пустой строчкой.");
                        } else {
                                break;
                        }
                }
        }
        private void setLoyal(){
                while (true){
                        System.out.println("Будет ли десантник верным? (Да/Нет)");
                        String isLoyal = Scan();
                        isLoyal.replaceAll(" ", "");
                        if (isLoyal.equals("Да")){
                                loyal = true;
                                break;
                        } else if (isLoyal.equals("Нет")) {
                                loyal = false;
                                break;
                        }else {
                                System.out.println("Введите Да или Нет");
                        }
                }
        }
        @Override
        public String toString(){
                return ("Name: "+name+ "\nid: "+ id + "\nКоординаты: "+ coordinates+"\nhealth: "+ health+
                        "\nweaponType: "+ weaponType + "\nmeleeWeapon: "+meleeWeapon+"\nChapter: "+ chapter +"\nloyal: " + loyal);
        }





}
