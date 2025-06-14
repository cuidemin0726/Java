package cls;
// 이름(str), 직업(str), 스킬(str), HP(int), MP(int) 클랙스 작성 숙제
public class Deonpa {

    private String name;
    private String character;
    private String skill;
    private int hp;
    private int mp;

    public Deonpa(){
        name = "";
        character = "";
        skill= "";
        hp = 0;
        mp = 0;
    }

    public Deonpa(String nam, String ch, String sk, int hpp, int mpp){
        this.name = nam;
        this.character = ch;
        this.skill = sk;
        this.hp = hpp;
        this.mp = mpp;
    }

    public void setName(String name){
        this.name = name;
    }
    public  void setCharacter(String character){
        this.character = character;
    }
    public void setSkill(String skill){
        this.skill = skill;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public void setMp(int mp){
        this.mp = mp;
    }

    public String getName(){
        return name;
    }

    public String getCharacter(){
        return character;
    }
    public String getSkill(){
        return skill;
    }
    public int getHp(){
        return hp;
    }
    public int getMp(){
        return mp;
    }

    @Override
    public String toString() {
        return String.format("이름: %s, 캐릭터: %s, 스킬: %s, HP: %d, MP: %d", name, character, skill, hp, mp);
    }

    @Override
    public boolean equals(Object den) {
        if ( !(den instanceof  Deonpa))
            return false;

        Deonpa is = (Deonpa) den;

        return  name.equals(is.name) &&
                character.equals(is.character) &&
                skill.equals(is.skill) &&
                hp == is.hp &&
                mp == is.mp;
    }
}
