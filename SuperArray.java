public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(String[] s, int si){
    data = s;
    si = size;
  }
  public void clear(){
    String[] n = new String[size];
    data = n;
  }
  public int size(){
    return size;
  }
  public boolean isEmpty(){
    return (data==this.clear());
  }
  public boolean add(String element){
    if (data[data.length-1] != null){
      data.resize();
      data[data.length]=element;
    }
    else {
      int c = 0;
      int i = 0;
      while (i<data.length && c==0){
        if (data[i]==null){
          c=i;
        }
        i+=1;
      }
      data[c]=element;}
  }

  public String get(int index){
    return data[index];
  }

  public String set(int index, String element){
    i= data[index];
    data[index]=element;
    return i;
  }

}
