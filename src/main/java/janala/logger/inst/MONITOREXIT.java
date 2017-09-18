package janala.logger.inst;

public class MONITOREXIT extends Instruction {
  public MONITOREXIT(long tid,int iid, int mid) {
    super(tid,iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitMONITOREXIT(this);
  }
  
  public MONITOREXIT(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "MONITOREXIT iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
