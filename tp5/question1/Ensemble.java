package question1;

import java.util.*;

public class Ensemble<T> extends AbstractSet<T> {

    protected java.util.Vector<T> table = new java.util.Vector<T>();

    public int size() {
        return table.size();
    }

    public Iterator<T> iterator() {
        return table.iterator();
    }

    public boolean add(T t) {
       
        
        if (t == null)
            return false;
        
        if(!table.contains(t)){
            
            return table.add(t);
        }
        
        return false;
    }

    public Ensemble<T> union(Ensemble<? extends T> e) {
        
        Ensemble<T> unionEnsemble = new Ensemble<T>();
        unionEnsemble.addAll(this);
        

        if (e == null) 
            return unionEnsemble;
        
        unionEnsemble.addAll(e);
        
        return unionEnsemble;
    }

    public Ensemble<T> inter(Ensemble<? extends T> e) {
        
        Ensemble<T> interEnsemble = new Ensemble<T>();
        
        if (e == null) 
            return interEnsemble;
        
        interEnsemble.addAll(this);
        interEnsemble.retainAll(e);
        return interEnsemble;
    }

    public Ensemble<T> diff(Ensemble<? extends T> e) {
        
        Ensemble<T> diffEnsemble = new Ensemble<T>();
        diffEnsemble.addAll(this);
        diffEnsemble.removeAll(e);
        
        return diffEnsemble;
    }

    Ensemble<T> diffSym(Ensemble<? extends T> e) {
        
        Ensemble<T> diffSymEnsemble = new Ensemble<T>();
        
        if(e == null)
            return diffSymEnsemble;
        
        diffSymEnsemble = this.union(e);
        diffSymEnsemble.removeAll(this.inter(e));
            
            
        return diffSymEnsemble;
    }
    
}
