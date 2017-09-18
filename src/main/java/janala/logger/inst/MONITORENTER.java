package janala.logger.inst;

public class MONITORENTER extends Instruction {
  public MONITORENTER(long tid, int iid, int mid) {
    super(tid,iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitMONITORENTER(this);
  }

  
  public MONITORENTER(int iid, int mid) {
	    super(iid, mid);
	  }
  
  @Override
  public String toString() {
    return "MONITORENTER iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
