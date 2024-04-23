package generic;

public class genericClass<T, H> {
    private T nama;
    private H idinsta;


    public genericClass(T nama, H idinsta){
        this.nama = nama;
        this.idinsta = idinsta;
    }
    public T getNama(){
        return nama;
    }

    public void setNama(T nama){
        this.nama = nama;
    }
    
    public H getIdInsta(){
        return idinsta;
    }

    public void setIdInsta(){
        this.idinsta = idinsta;
    }
}
