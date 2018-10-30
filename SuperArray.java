public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(String[] s, int si){
    data = s;
    si = size;
  }
  public SuperArray(){
    data = new String[10];
    size = 0;
  }
  public SuperArray(int si){
	data = new String[si];
	size = 0;}
  public SuperArray(String[] s){
	data = s;
	size = 0;
    }
  public void clear(){
    String[] n = new String[size];
    data = n;
    size=0;
  }
  public int size(){
    return size;
  }
  public boolean isEmpty(){
    return (size==0);
  }
  public boolean add(String element){
 	if (size == data.length){
 	    resize();
 	}
 	data[size]=element;
  size++;
 	return true;
     }

  public String toString(){
    String r = "[";
    if (this.size()==0){
      return "[]";}
    for (int i=0; i<size;i++){
      r+=data[i];
      if (i!=size-1){
        r+=",";}}
    r+="]";
    return r;
  }

  public String toStringDebug(){
    String r = "[";
    for (int i=0; i<data.length;i++){
      r+=data[i];
      if (i!=data.length-1){
        r+=",";}}
    r+="]";
    return r;
  }

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

  private void resize(){
    int tempsize = size;
    String[] nums = new String[data.length+10];
    for (int i = 0; i < data.length; i++){
	  nums[i]=data[i];}
    data = nums;
    size = tempsize;
  }

  public boolean contains( String element) {
  for ( int x = 0; x < size; x++) {
    if (data[x].equals(element))
    return true;
  }
  return false;
}
  public void add(int index, String element){
    if (index < 0 || index > this.size{
      throw new IndexOutOfBoundsException();
    }
    else {
    if (size == data.length){
        resize();
    }
    for(int i = size; i > index; i--){
      data[i] = data[i-1];}
      data[index] = element;
      size++;
   }}

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
    if (index < 0 || index > size){
      return "Error";
    }
    String r = data[index];
    for (int i = index; i<size;i++){
      data[i]=data[i+1];
    }
    size--;
    return r;
  }
  public boolean remove(String element) {
    if( contains(element)) {
      remove( indexOf(element));
      return true;
    }
    return false;
  }


}
