package janala.logger.inst;

public class IF_ICMPLE extends Instruction {
  int label;

  public IF_ICMPLE(long tid, int iid, int mid, int label) {
    super(tid, iid, mid);
    this.label = label;
  }

  public IF_ICMPLE(int iid, int mid, int label) {
	    super(iid, mid);
	    this.label = label;
	  }
  public void visit(IVisitor visitor) {
    visitor.visitIF_ICMPLE(this);
  }

  @Override
  public String toString() {
    return "IF_ICMPLE iid=" + iid + " mid=" + mid + " tid=" + tid+ " label=" + label;
  }
}