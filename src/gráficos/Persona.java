package gráficos;

public class Persona{
    Cola discapacitados,embarazadas,adultos,corporativos,regulares;
    public final class Prueba {

    public Nodo primerNodo;
    public Nodo ultimoNodo;
    private int size = 0;

    /**
    * La clase Nodo es usada únicamente a nivel interno dentro de la lista
    * Tiene dos atributos: el dato y el enlace al siguiente nodo
    *
    */
    public class Nodo{
        private Object dato;
        Nodo siguiente;
        Nodo anterior;
        public Nodo(){
            this.dato = null;
            this.siguiente = null;
            this.anterior = null;
        }
        public Nodo(Object inputDato){
            if (size == 0){
                this.anterior = null;
            }
            else{
                this.anterior = ultimoNodo;
            }
            this.dato = inputDato;
            this.siguiente = null;
        }
        public Object obtenerDato(){
            return dato;
        }
        public void establecerDato(Object dato){
            this.dato = dato;
        }
        public Nodo obtenerSiguiente(){
            return siguiente;
        }
        public Nodo obtenerAnterior(){
            return anterior;
        }
        public void establecerSiguiente(Nodo siguiente){
            this.siguiente = siguiente;
        }
        public void establecerAnterior(Nodo anterior){
            this.anterior = anterior;
        }
    }

    // Métodos

    /**
    * Constructor predeterminado
    */
    public Prueba()
    {
        this.primerNodo = null;
        this.ultimoNodo = null;
    }
    /**
    * Devuelve la representación en string de la lista
    */
    public String recorrer(){
        String s = "[";
        Nodo aux = primerNodo;
        int i = 0;
        while (i < size){
            if (i == size -1){
                s += aux.dato;
            }
            else{
            s += aux.dato + ",";
            }
            aux = aux.siguiente;
            i ++;
        }
        return s + "]";
    }
    /**
    * Agrega un nuevo elemento a la lista
    * @param elemento El elemento a agregar
    */
    public void agregar(Object elemento)
    {
          Nodo nodo = new Nodo(elemento);

        // caso de lista vacía
        if (this.primerNodo == null)
        {
            this.primerNodo = nodo;
            this.ultimoNodo = nodo;
        }
        else
        {
            this.ultimoNodo.establecerSiguiente(nodo);
            this.ultimoNodo = nodo;       
        }

        this.size++;
    }
    /**
    * Devuelve el tamaño de la lista
    * @return Número de elementos de la lista
    */
    public int size()
    {
        return this.size;
    }
    public void vaciar(){
        while (size > 0){
            ultimoNodo = ultimoNodo.anterior;
            ultimoNodo.siguiente = null;
            size --;
        }
    }
    public void eliminarPrimero(){
        if (size == 1){
            primerNodo = ultimoNodo = null;
        }
        else{
            primerNodo = primerNodo.siguiente;
            primerNodo.anterior = null;
        }
        size --;
    }
    public boolean esVacia(){
        return primerNodo == null;
    }
}
    public class Cola {
        Prueba cola;
        Cola(){
            cola = new Prueba();
        }
        public void queue(Object e){
            cola.agregar(e);
        }
        public Prueba.Nodo front(){
            return cola.primerNodo;
        }
        public Object dequeue(){
            Prueba.Nodo r = cola.primerNodo;
            cola.eliminarPrimero();
            return r.obtenerDato();
        }
        public void empty(){
            cola.vaciar();
        }
        public Prueba.Nodo rear(){
            return cola.ultimoNodo;
        }
        public int lenght(){
            return cola.size();
        }
        public String print(){
            return cola.recorrer();
        }
        public boolean vacia(){
            return cola.esVacia();
        }
    }
    Persona(){
        discapacitados=new Cola();
        adultos=new Cola();
        embarazadas=new Cola();
        corporativos=new Cola();
        regulares=new Cola();
    }
    public void entrarDiscapacitados(Object e){
        discapacitados.queue(e);
    }
    public void entrarEmbarazadas(Object e){
        embarazadas.queue(e);
    }
    public void entrarAdultos(Object e){
        adultos.queue(e);
    }
    public void entrarCorpotarivos(Object e){
        corporativos.queue(e);
    }
    public void entrarRegulares(Object e){
        regulares.queue(e);
    }
    public void salir(){
        if(!discapacitados.vacia()){
            discapacitados.dequeue();
        }
        else if (!adultos.vacia()){
            adultos.dequeue();
        }
        else if (!embarazadas.vacia()){
            embarazadas.dequeue();
        }
        else if (!corporativos.vacia()){
            corporativos.dequeue();
        }
        else if (!regulares.vacia()){
            regulares.dequeue();
        }
    }
    public String print(){
        return discapacitados.print()+"\n"+adultos.print()+"\n"+embarazadas.print()+"\n"+corporativos.print()+"\n"+regulares.print();
    }
}
