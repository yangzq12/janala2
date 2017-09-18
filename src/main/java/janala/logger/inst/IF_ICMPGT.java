package janala.logger.inst;

public class IF_ICMPGT extends Instruction {
  int label;

  public IF_ICMPGT(long tid, int iid, int mid, int label) {
    super(tid, iid, mid);
    this.label = label;
  }
  
  public IF_ICMPGT(int iid, int mid, int label) {
	    super(iid, mid);
	    this.label = label;
	  }

  public void visit(IVisitor visitor) {
    visitor.visitIF_ICMPGT(this);
  }

  @Override
  public String toString() {
    return "IF_ICMPGT iid=" + iid + " mid=" + mid + " tid=" + tid+ " label=" + label;
  }
}
