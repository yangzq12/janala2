package janala.logger.inst;

public class IFLT extends Instruction {
  int label;

  public IFLT(long tid, int iid, int mid, int label) {
    super(tid, iid, mid);
    this.label = label;
  }

  public void visit(IVisitor visitor) {
    visitor.visitIFLT(this);
  }
  
  public IFLT(int iid, int mid, int label) {
	    super(iid, mid);
	    this.label = label;
	  }

  @Override
  public String toString() {
    return "IFLT iid=" + iid + " mid=" + mid + " tid=" + tid+ " label=" + label;
  }
}
