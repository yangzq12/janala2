package janala.logger.inst;

public class IFLE extends Instruction {
  int label;

  public IFLE(long tid, int iid, int mid, int label) {
    super(tid, iid, mid);
    this.label = label;
  }
  
  public IFLE(int iid, int mid, int label) {
	    super(iid, mid);
	    this.label = label;
	  }

  public void visit(IVisitor visitor) {
    visitor.visitIFLE(this);
  }

  @Override
  public String toString() {
    return "IFLE iid=" + iid + " mid=" + mid + " tid=" + tid+ " label=" + label;
  }
}
