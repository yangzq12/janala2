package janala.logger.inst;

public class IFEQ extends Instruction {
  int label;

  public IFEQ(long tid, int iid, int mid, int label) {
    super(tid, iid, mid);
    this.label = label;
  }

  public void visit(IVisitor visitor) {
    visitor.visitIFEQ(this);
  }
  
  public IFEQ(int iid, int mid, int label) {
	    super(iid, mid);
	    this.label = label;
	  }


  @Override
  public String toString() {
    return "IFEQ iid=" + iid + " mid=" + mid + " tid=" + tid+ " label=" + label;
  }
}
