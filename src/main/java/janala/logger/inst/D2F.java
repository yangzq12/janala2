package janala.logger.inst;

public class D2F extends Instruction {
  public D2F(long tid, int iid, int mid) {
    super(tid,iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitD2F(this);
  }

  public D2F(int iid, int mid) {
	    super(iid, mid);
	  }
  @Override
  public String toString() {
    return "D2F iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
