package interfaces;

public interface IEdge {
    double getGain();
    void setGain(double gain);
    void setStartNode(INode startNode);
    void setEndNode(INode endNode);
    INode getEndNode();
}