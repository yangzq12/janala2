package janala.logger.inst;

public class IF_ICMPGE extends Instruction {
  int label;

  public IF_ICMPGE(long tid, int iid, int mid, int label) {
    super(tid, iid, mid);
    this.label = label;
  }

  public void visit(IVisitor visitor) {
    visitor.visitIF_ICMPGE(this);
  }
  
  public IF_ICMPGE(int iid, int mid, int label) {
	    super(iid, mid);
	    this.label = label;
	  }

  @Override
  public String toString() {
    return "IF_ICMPGE iid=" + iid + " mid=" + mid + " tid=" + tid+ " label=" + label;
  }
}
