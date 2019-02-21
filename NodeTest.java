class NodeTest extends Node
{
  public static void main(String[] args) 
  {
  	Node empty = new Node(); //No Paramater Constructor
    System.out.println("Empty Parameter:\n" + empty.toString());
  	Node full = new Node("Nick", "26", "3.5");
    System.out.println("Full Parameter:\n" + full.toString());
    Node copy = full.deepCopy();
    System.out.println("Copy:\n"+ copy.toString());
    Node test = new Node("Andrew", "27", "4.0");
    System.out.println("Compare:\n" + full.compareTo(test));
  }
}
