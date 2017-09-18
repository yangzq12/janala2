package janala.logger.inst;

public class IAND extends Instruction {
  public IAND(long tid, int iid, int mid) {
    super(tid,iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitIAND(this);
  }
  
  public IAND(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "IAND iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
