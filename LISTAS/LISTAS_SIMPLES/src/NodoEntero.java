public class NodoEntero {
    private int mElemento;
    private NodoEntero mSiguiente;

    public NodoEntero(int aElemento){
        this.mElemento = aElemento;
        this.mSiguiente = null;
    }

    public NodoEntero(int aElemento, NodoEntero aNodo){
        this.mElemento = aElemento;
        this.mSiguiente = aNodo;
    }

    public int getmElemento() {
        return mElemento;
    }

    public void setmElemento(int mElemento) {
        this.mElemento = mElemento;
    }

    public NodoEntero getmSiguiente() {
        return mSiguiente;
    }

    public void setmSiguiente(NodoEntero mSiguiente) {
        this.mSiguiente = mSiguiente;
    }
}
