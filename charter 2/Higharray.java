public class Higharray {
    private long[] a;
    private int nElems ;

    public Higharray(int max){
        a = new long[max];
        nElems = 0;
    }

    public boolean find(long searchKey){
        int j;
        for(j=0; j<nElems ; j++){
            if(a[j] ==searchKey){
                break;
            }
        }
        if(j == nElems){
            return false;
        }
        else{
            return true;
        }
    }
    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }

    public boolean delete(long value){
        int j;
        for(j=0;j<nElems;j++){
            if(a[j] == value){
                break;
            }
        }
        if(j == nElems){
            return false;
        }
        else{
            for(int k=j ; k<nElems ; k++){
                a[k] = a[k+1];
            }
            nElems--;
            return true;
        }
    }

    public void display(){
        for(int j=0;j<nElems; j++){
            System.out.print(a[j] + " ");
        }
        System.out.println();
    }


    public long getMax(){
        long value = 0;
        for(int i = 0 ; i < nElems ; i++){
            if( value < a[i]){
                value = a[i];
            }
        }
        return value;
    }

    public void removeMax(){
        delete(getMax());
    }

    public void noDups(){
        long value = 0;

        for(int i=0; i< nElems ; i++){
            value = a[i];
            for(int j=i+1 ; j<nElems;j++){
                if(a[i] == value){
                    for(int k=j ; j<nElems ;k++){
                        a[k] = a[k+1];
                    }
                }
            }
            
        }
    }


}
