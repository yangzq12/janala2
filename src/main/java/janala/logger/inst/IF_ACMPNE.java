package janala.logger.inst;

public class IF_ACMPNE extends Instruction {
  int label;

  public IF_ACMPNE(long tid, int iid, int mid, int label) {
    super(tid, iid, mid);
    this.label = label;
  }
  
  public IF_ACMPNE(int iid, int mid, int label) {
	    super(iid, mid);
	    this.label = label;
	  }

  public void visit(IVisitor visitor) {
    visitor.visitIF_ACMPNE(this);
  }

  @Override
  public String toString() {
    return "IF_ACMPNE iid=" + iid + " mid=" + mid + " tid=" + tid+ " label=" + label;
  }
}
