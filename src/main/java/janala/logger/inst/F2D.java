package janala.logger.inst;

public class F2D extends Instruction {
  public F2D(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitF2D(this);
  }
  
  public F2D(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "F2D iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
