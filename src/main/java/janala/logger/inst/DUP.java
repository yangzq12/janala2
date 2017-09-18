package janala.logger.inst;

public class DUP extends Instruction {
  public DUP(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitDUP(this);
  }
  
  public DUP(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "DUP iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
