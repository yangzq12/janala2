package janala.logger.inst;

public class IFNULL extends Instruction {
  int label;

  public IFNULL(long tid, int iid, int mid, int label) {
    super(tid, iid, mid);
    this.label = label;
  }

  public void visit(IVisitor visitor) {
    visitor.visitIFNULL(this);
  }
  
  public IFNULL(int iid, int mid, int label) {
	    super(iid, mid);
	    this.label = label;
	  }

  @Override
  public String toString() {
    return "IFNULL iid=" + iid + " mid=" + mid + " tid=" + tid+ " label=" + label;
  }
}
