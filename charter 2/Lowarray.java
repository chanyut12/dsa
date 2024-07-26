class Lowarray {
    private long[] a;
    public Lowarray(int size)
        {a =  new long[size];}

    public void setElem(int index , long value)
        {a[index] = value ;}

    public long getElem(int index)
        {return a[index] ;}
}

class LowarrayApp{
    public static void main(String[] args) {
        Lowarray arr ;
        arr = new Lowarray(100);
        int nElems = 0;
        int j;

        arr.setElem(0, 77);
        arr.setElem(1, 99);
        arr.setElem(2, 44);
        arr.setElem(3, 55);
        arr.setElem(4, 22);
        arr.setElem(5, 88);
        arr.setElem(6, 11);
        arr.setElem(7, 00);
        arr.setElem(8, 66);
        arr.setElem(9, 33);
        nElems= 10;

        for(j=0;j<nElems;j++)
            System.out.println(arr.getElem(j) + " ");
        System.out.println("");

        int searchKey = 26 ;
        for(j = 0; j< nElems ; j++)
            if(arr.getElem(j) == searchKey)
                break;
        if(j == nElems)
            System.out.println("Cant find " + searchKey);
        else
        System.out.println("Found " + searchKey);

        for(j=0;j<nElems;j++)
            if(arr.getElem(j) == 55)
                break;
        for(int k=j ; j<nElems ; k++)
            arr.setElem(k,arr.getElem(k+1));
        nElems--;

        for(j=0;j<nElems;j++)
            System.out.println(arr.getElem(j) + " ");
        System.out.println("");

    }
}