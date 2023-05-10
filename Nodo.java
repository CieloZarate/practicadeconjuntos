package Lista;

public class Nodo{
    String info;
    Nodo next;

    public Nodo(){
        next=null;
    }
    public Nodo (String info){
        this.info=info;
        next=null;
    }
    public Nodo (String info, Nodo next){
        this.info=info;
        this.next=next;
    }
}
