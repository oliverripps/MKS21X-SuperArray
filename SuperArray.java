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
    if (data.length == size){
      data.resize();
      data[size]=element;
    }
    else {
      data[size]=element;
  }
  return true;}

  public String toString(){
    String r = "[";
    if (size()==0){
      return "[]";
    }
    for (int i=0; i<data.length;i++){
      r+=data[i];
      if (i!=data.length-1){
        r+=",";}
    r+="]";
    return r;
  }}

  public String get(int index){
    if (index < 0 || index >= size()){
      return null;
    }
    return data[index];
  }

  public String set(int index, String element){
    String i= data[index];
    data[index]=element;
    return i;
  }
  /*private void resize(){
    String nums[]= new String[data.length+1];
    for (int i =0; i<data.length;i++){
      nums[i]=data[i];
    }
    data=nums;
  }


  public String toString(){
    String str="[";
    for(int i =0; i<size;i++){
      str+=data[i];
      if (i != size-1){
      str+=",";}
    }
    str+="]";
    return str;
  }
  public boolean contains(String element){
    for(int i=0;i<size;i++){
      if (data[i]==element){
        return true;
      }
    }
    return false;
  }
  public void add(int index, String element){
    for (int i=index; i<size;i++){
      data[i+1]=data[i];
    }
    data[index]=element;
  }

  public int indexOf(String element){
    int p = -1;
    for(int i=0; i<size;i++){
      if (data[i]==element){
        p=i;
        return p;
      }
    }
    return p;
  }
  public int lastIndexOf(String element){
    int p = -1;
    for(int i=size-1; i>=0;i--){
      if (data[i]==element){
        p=i;
        return p;
      }
    }
    return p;
  }
  public String remove(int index){
    String r = data[index];
    for (int i = index; i<size;i++){
      data[i]=data[i+1];
    }
    return r;
  }
  public boolean remove(String element){

  }


}*/
