package cls;
// 제목(str), 날짜(str), 내용(str) 클래스 작성 숙제
public class Diary {

    private String title;
    private String date;
    private String info;

    public Diary(){
        title = "";
        date = "";
        info = "";
    }

    public Diary(String ti, String day, String inf){
        this.title = ti;
        this.date = day;
        this.info =inf;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return getTitle();
    }

    public void setDate(String date){
        this.date = date;
    }
    public String getDate(){
        return date;
    }

    public void setInfo(String info){
        this.info = info;
    }
    public String getInfo(){
        return info;
    }

    @Override
    public String toString() {
        return String.format("제목: %s 날짜: %s 내용: %s", title, date, info);
    }

    @Override
    public boolean equals(Object dd) {
       if( !(dd instanceof Diary))
           return false;

       Diary is = (Diary) dd;
       return title.equals(is.getTitle()) &&
               date.equals(is.getDate()) &&
               info.equals(is.getInfo());
    }
}
