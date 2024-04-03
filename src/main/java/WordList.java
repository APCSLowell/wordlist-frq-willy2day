import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    /* to be implemented in part (a) */
    int k=0;
    for(int i=0; i<myList.size();i++){
      if(myList.get(i).length()==len)
        k++;
    }
    return k;
  }

  public void removeWordsOfLength(int len)
  {
    /* to be implemented in part (b) */
  for(int i=0; i<myList.size();i++){
    if(myList.get(i).length()==len){
      myList.remove(i);
      i--;
    }
  }
  }
}
