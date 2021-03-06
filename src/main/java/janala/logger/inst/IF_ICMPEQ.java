package janala.logger.inst;

public class IF_ICMPEQ extends Instruction {
  int label;

  public IF_ICMPEQ(long tid, int iid, int mid, int label) {
    super(tid, iid, mid);
    this.label = label;
  }
  
  public IF_ICMPEQ(int iid, int mid, int label) {
	    super(iid, mid);
	    this.label = label;
	  }

  public void visit(IVisitor visitor) {
    visitor.visitIF_ICMPEQ(this);
  }

  @Override
  public String toString() {
    return "IF_ICMPEQ iid=" + iid + " mid=" + mid + " tid=" + tid+ " label=" + label;
  }
}
