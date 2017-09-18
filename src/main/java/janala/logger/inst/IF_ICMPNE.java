package janala.logger.inst;

public class IF_ICMPNE extends Instruction {
  int label;

  public IF_ICMPNE(long tid, int iid, int mid, int label) {
    super(tid, iid, mid);
    this.label = label;
  }

  public void visit(IVisitor visitor) {
    visitor.visitIF_ICMPNE(this);
  }
  
  public IF_ICMPNE(int iid, int mid, int label) {
	    super(iid, mid);
	    this.label = label;
	  }


  @Override
  public String toString() {
    return "IF_ICMPNE iid=" + iid + " mid=" + mid + " tid=" + tid + " label=" + label;
  }
}
