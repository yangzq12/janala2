package janala.logger.inst;

public class CALOAD extends Instruction {
  public CALOAD(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitCALOAD(this);
  }
  
  public CALOAD(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "CALOAD iid=" + iid + " mid=" + mid + " tid=" + tid;
  }
}
