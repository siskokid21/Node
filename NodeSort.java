
class NodeSort extends Node
{
  private int next;
  private int size;
  private Node[] data;
  public NodeSort()
  {
  	next = 0;
    size = 100;
    data = new Node[size];
  }
  public NodeSort(int s)
  {
  	next = 0;
    data = new Node[s];
    size = s;
  }
  public boolean insert(Node newNode)
  {
  	if (next >= size)
    	return false;
    data[next] = newNode.deepCopy();
    if (data[next] == null)
    	return false;
    next = next + 1; 
    return true;
  }
  public Node fetch(String targetKey)
  {
  	Node node;
    Node temp;
    int i = 0;
    while(i < next && !(data[i].name.compareTo(targetKey) == 0))
    {
    	i++;
    }
    if (i == next)
    {
    	return null;
    }
    node = data[i].deepCopy();
    if (i != 0)
    {
    	temp = data[i - 1];
        data[i - 1] = data[i];
        data[i] = temp;
    }
    return node;
  }
  public boolean delete(String targetKey)
  {
  	int i = 0;
    while(i < next && !(data[i].name.compareTo(targetKey) == 0))
    {
    	i++;
    }
    if (i == next)
    	return false;
    data[i] = data[next-1];
    data[next - 1] = null;
    next = next - 1;
    return true;
  }
  public boolean update(String targetKey, Node newNode)
  {
  	if(delete(targetKey) == false)
    	return false;
    else if (insert(newNode) == false)
    	return false;
    else
    	return true;
  }
  public void sort()
  {
  	Node temp = new Node();
    for (int i = 0; i < size - 1; i++) 
    {
    	for (int j = i + 1; j < size; j++) 
        {
        	if (data[i].compareTo(data[j]) > 0) 
        	{
        		temp = data[j];
                data[j] = data[i];
                data[i] = temp;
            }
        }
  	}
  }
}
