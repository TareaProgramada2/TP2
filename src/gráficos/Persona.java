package gráficos;
/**
 * La clase Persona es un objeto que tiene cinco colas, la de discapacitados,embarazadas, adultos mayores
 * clientes corporativos y clientes regulares. 
 * Los métodos que posee para eliminar elementos realizan la prioridad por sí solos.
 * @author kenneth
 */
public class Persona{
    Cola discapacitados,embarazadas,adultos,corporativos,regulares;
    String nombre,correo,tipo,horaentrada,horasalida;
    /**
     * La clase Prueba es una lista doblemente enlazada, en ella están los
     * atributos de el último nodo, el primer nodo y el tamaño que tiene la lista.
     */
    public final class Prueba {
        
    public Nodo primerNodo;
    public Nodo ultimoNodo;
    private int size = 0;

    /**
    * La clase Nodo es usada únicamente a nivel interno dentro de la lista
    * Tiene tres atributos: el dato y los enlaces al siguiente nodo y al nodo anterior
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
         * @return la lista en un string
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
        /**
         * Vacía toda la lista
         */
    public void vaciar(){
        while (size > 0){
            ultimoNodo = ultimoNodo.anterior;
            ultimoNodo.siguiente = null;
            size --;
        }
    }
    /**
     * Elimina el primer elemento de la lista
     */
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
    /**
     * Determina si la lista es vacía
     * @return si la lista es vacía
     */
    public boolean esVacia(){
        return primerNodo == null;
    }
    }
    /**
     * La clase cola es una cola co todos sus métodos habituales y
     * solo tiene a una lista de atrubuto
     */
    public class Cola {
        Prueba cola;
        Cola(){
            cola = new Prueba();
        }
        /**
         * Agrega un elemento a la cola
         * @param e El elemento a agregar
         */
        public void queue(Object e){
            cola.agregar(e);
        }
        /**
         * Devuelve el último elemento de la cola
         * @return ultimo elemento agregado a la cola
         */
        public Prueba.Nodo front(){
            return cola.primerNodo;
        }
        /**
         * Elimina a el primer nodo de la cola
         * @return el primer elelemto de la cola
         */
        public Object dequeue(){
            Prueba.Nodo r = cola.primerNodo;
            cola.eliminarPrimero();
            return r.obtenerDato();
        }
        /**
         * Vacía la cola
         */
        public void empty(){
            cola.vaciar();
        }
        public Prueba.Nodo rear(){
            return cola.ultimoNodo;
        }
        /**
         * Devuelve el tamaño de la cola 
         * @return el número de elementos contenidos en la cola
         */
        public int lenght(){
            return cola.size();
        }
        public String print(){
            return cola.recorrer();
        }
        /**
         * Pregunta si la cola está vacía
         * @return un boolean que dice si es vacía o no
         */
        public boolean vacia(){
            return cola.esVacia();
        }
    }
    /**
     * Constructor de la clase Persona, inicializa todas las colas
     */
    Persona(){
        discapacitados=new Cola();
        adultos=new Cola();
        embarazadas=new Cola();
        corporativos=new Cola();
        regulares=new Cola();
    }
    /**
     * Agrega un elemento a la cola de discapacitados
     * @param e el elemento a agregar a la cola
     */
    public void entrarDiscapacitados(Object e){
        discapacitados.queue(e);
    }
    /**
     * Agrega un elemento a la cola de embarazadas
     * @param e el elemento a agregar a la cola
     */
    public void entrarEmbarazadas(Object e){
        embarazadas.queue(e);
    }
    /**
     * Agrega un elemento a la cola de adultos mayores
     * @param e el elemento a agregar a la cola
     */
    public void entrarAdultos(Object e){
        adultos.queue(e);
    }
    /**
     * Agrega un elemento a la cola de clientes corporativos
     * @param e el elemento a agregar a la cola
     */
    public void entrarCorpotarivos(Object e){
        corporativos.queue(e);
    }
    /**
     * Agrega un elemento a la cola de clientes regulares
     * @param e el elemento a agregar a la cola
     */
    public void entrarRegulares(Object e){
        regulares.queue(e);
    }
    /**
     * Elimina un elemento de las colas utilizando la prioridad que se nos asignó 
     * o si las colas estaban vacías, devuelve un string que dice que las colas se encuentran vacías
     * @return el elemento que eliminó o si las colas estaban vacías, devuelve un string
     */
    public Object salir(){
        if(!discapacitados.vacia()){
            return discapacitados.dequeue();
        }
        else if (!adultos.vacia()){
            return adultos.dequeue();
        }
        else if (!embarazadas.vacia()){
            return embarazadas.dequeue();
        }
        else if (!corporativos.vacia()){
            return corporativos.dequeue();
        }
        else if (!regulares.vacia()){
            return regulares.dequeue();
        }
        else{
            return "vacio";
        }
    }
    public String print(){
        return discapacitados.print()+"\n"+adultos.print()+"\n"+embarazadas.print()+"\n"+corporativos.print()+"\n"+regulares.print();
    }
}
