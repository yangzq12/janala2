package janala.logger.inst;

public class L2I extends Instruction {
  public L2I(long tid,int iid, int mid) {
    super(tid,iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitL2I(this);
  }
  
  public L2I(int iid, int mid) {
	    super(iid, mid);
	  }


  @Override
  public String toString() {
    return "L2I iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
