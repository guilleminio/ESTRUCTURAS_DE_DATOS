public class ListaDeEnteros {

    private NodoEntero mCabeza;
    private NodoEntero mCola;

    public ListaDeEnteros(){
        this.mCabeza = this.mCola = null;
    }

    public ListaDeEnteros( NodoEntero aCabeza, NodoEntero aCola ){
        this.mCabeza = aCabeza;
        this.mCola = aCola;
    }

    public boolean estaVacia(){
        return this.mCabeza == null;
    }

    public void insertarAlPrincipio( int aDato ){

        mCabeza = new NodoEntero(aDato,mCabeza);

        if ( mCola == null)
            mCola = mCabeza;
    }

    public void mostrarLista(){
        NodoEntero nodo = mCabeza;
        while ( nodo != null){
            System.out.print(nodo.getmElemento() + " ");
            nodo = nodo.getmSiguiente();
        }
    }
}
