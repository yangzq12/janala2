package janala.logger.inst;

public class L2D extends Instruction {
  public L2D(long tid,int iid, int mid) {
    super(tid,iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitL2D(this);
  }

  public L2D(int iid, int mid) {
	    super(iid, mid);
	  }
  
  @Override
  public String toString() {
    return "L2D iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
