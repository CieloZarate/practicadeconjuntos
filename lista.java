package Lista;

public class lista {
    Nodo primero;
    public lista (){
        primero=null;
    }
    public void insertar (String dato){
        Nodo temp= new Nodo (dato);
        temp.next=primero;
        primero=temp;
    }
    public void imprimir(){
        Nodo n=primero;
        while (n!=null){
            System.out.print(n.info+" ");
            n=n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        lista miLista = new lista();
        miLista.insertar("Esta es una practica");
        miLista.insertar("Codigo de listas enlazadas");
        miLista.insertar("Cielo Raymundo Zarate");
        miLista.insertar("FIN");
        miLista.imprimir(); // Debería imprimir al revés "Cielo Raymundo Zarate Codigo de listas enlazadas Esta es una practica "
    }
}