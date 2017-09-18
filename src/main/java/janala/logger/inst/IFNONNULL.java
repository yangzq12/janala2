package janala.logger.inst;

public class IFNONNULL extends Instruction {
  int label;

  public IFNONNULL(long tid, int iid, int mid, int label) {
    super(tid, iid, mid);
    this.label = label;
  }

  public void visit(IVisitor visitor) {
    visitor.visitIFNONNULL(this);
  }

  public IFNONNULL(int iid, int mid, int label) {
	    super(iid, mid);
	    this.label = label;
	  }
  
  @Override
  public String toString() {
    return "IFNONNULL iid=" + iid + " mid=" + mid + " tid=" + tid+ " label=" + label;
  }
}
