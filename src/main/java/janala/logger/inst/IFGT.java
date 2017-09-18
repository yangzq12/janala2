package janala.logger.inst;

public class IFGT extends Instruction {
  int label;

  public IFGT(long tid, int iid, int mid, int label) {
    super(tid, iid, mid);
    this.label = label;
  }

  public void visit(IVisitor visitor) {
    visitor.visitIFGT(this);
  }
  
  public IFGT(int iid, int mid, int label) {
	    super(iid, mid);
	    this.label = label;
	  }

  @Override
  public String toString() {
    return "IFGT iid=" + iid + " mid=" + mid + " tid=" + tid+ " label=" + label;
  }
}
