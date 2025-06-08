package cls;
// 파일이름(문자열), 파일크기(int)를 필드롤 갖는 클래스 MyFile를 생성

public class MyFile {

    private String filename;
    private int filesize;

    public MyFile(){
        filename = "";
        filesize = 0;
    }
    public MyFile(String fn, int fz){
        this.filename = fn;
        this.filesize = fz;
    }

    public void setFilename(String filename){
        this.filename = filename;
    }
    public void setFilesize(int filesize){
        this.filesize = filesize;
    }

    public String getFilename(){
        return filename;
    }
    public int getFilesize(){
        return filesize;
    }

    @Override
    public String toString() {
        return String.format("FAILENAME: %s\nFAILESIZE: %d", filename, filesize);
    }

    @Override
    public boolean equals(Object obj) {
        if( !(obj instanceof MyFile))
            return false;
        MyFile is = (MyFile) obj;

        return filename.equals(is.getFilename())
                && filesize == is.filesize;
    }
}
