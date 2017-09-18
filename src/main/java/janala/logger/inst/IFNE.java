package janala.logger.inst;

public class IFNE extends Instruction {
  int label;

  public IFNE(long tid, int iid, int mid, int label) {
    super(tid, iid, mid);
    this.label = label;
  }

  public void visit(IVisitor visitor) {
    visitor.visitIFNE(this);
  }
  
  public IFNE(int iid, int mid, int label) {
	    super(iid, mid);
	    this.label = label;
	  }

  @Override
  public String toString() {
    return "IFNE iid=" + iid + " mid=" + mid+ " tid=" + tid + " label=" + label;
  }
}
