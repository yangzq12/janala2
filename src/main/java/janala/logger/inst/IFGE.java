package janala.logger.inst;

public class IFGE extends Instruction {
  int label;

  public IFGE(long tid, int iid, int mid, int label) {
    super(tid, iid, mid);
    this.label = label;
  }

  public void visit(IVisitor visitor) {
    visitor.visitIFGE(this);
  }
  
  public IFGE(int iid, int mid, int label) {
	    super(iid, mid);
	    this.label = label;
	  }

  @Override
  public String toString() {
    return "IFGE iid=" + iid + " mid=" + mid + " tid=" + tid+ " label=" + label;
  }
}
