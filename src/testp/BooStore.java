package testp;

public class BooStore {
    public static void main(String[] args) {

        ComicBook comic = new ComicBook("내친구 뽀로", 15000);
        comic.info();


        Novel novel = new Novel("헤리포터", 30000);
        novel.info();
    }
}
