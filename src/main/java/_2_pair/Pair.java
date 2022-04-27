package _2_pair;

public class Pair<K, V> {

    private K k;
    private V v;

    public Pair(K k, V v){
        this.k = k;
        this.v = v;
    }

    public K getK(){
        return this.k;
    }

    public void setK(K k){
        this.k = k;
    }

    public V getV(){
        return this.v;
    }

    public void setV(V v){
        this.v = v;
    }
}
