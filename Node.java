import javax.swing.JOptionPane;

public class Node implements Comparable<Node>
{
  public String name;
  private String id;
  private String gpa;
  
  public Node()
  {
    name = " ";
    id = " ";
    gpa = " ";
  }
  public Node(String n, String i, String g)
  {
    name = n;
    id = i;
    gpa = g;
  }
  public String toString()
  {
    return ("Name is " + name + "\nID is " + id + "\nGPA is " + gpa + "\n");
  }
  public Node deepCopy()
  {
    Node clone = new Node(name, id, gpa);
    return clone;
  }
  @Override
  public int compareTo(Node node)
  {
    return (name.compareTo(node.name));
  }
  public void input()
  {
    name = JOptionPane.showInputDialog("Enter a Name");
    id = JOptionPane.showInputDialog("Enter an ID");
    gpa = JOptionPane.showInputDialog("Enter GPA");
  }
}
