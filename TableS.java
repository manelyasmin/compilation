package gen;

import java.util.ArrayList;

public class TableS
{
    static public class Element {

        public Element(String name,  int type, int value,int declared) {
            this.name = name;
            this.declared = declared;
            this.type = type;
            this.value = value;
        }

        String name;
        int declared; // 2:undeclared 1:declared
        int type; // 1:int 2:float
        int value; //value;

        @Override
        public String toString()
        {

          //  String dec = (declared == 1)? "declared":"undeclared";
            return "var: " + name + "value" +value;
        }
    }


    public ArrayList<Element> L = new ArrayList<Element>();


    public Element getElement(String name)
    {
        for (int i = 0; i < L.size(); i++) {
            if(L.get(i).name.compareTo(name)==0)
                return L.get(i);
        }
        return null;
    }

    public boolean containsElement(String name)
    {
        return getElement(name) != null;
    }

    public void addElement(Element e)
    {
        L.add(e);
    }

    public void deleteElement(String name)
    {
        for (int i = 0; i < L.size(); i++) {
            if(L.get(i).name.compareTo(name)==0)
            {
                deleteElement(L.get(i));
                return;
            }
        }
    }
 
 
    public void deleteElement(Element e)
    {
        L.remove(e);
    }

    public int getSize()
    {
        return L.size();
    }

    public Element getElement(int i)
    {
        return L.get(i);
    }

}
