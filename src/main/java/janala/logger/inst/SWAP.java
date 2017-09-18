package janala.logger.inst;

public class SWAP extends Instruction {
  public SWAP(long tid,int iid, int mid) {
    super(tid,iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitSWAP(this);
  }
  
  public SWAP(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "SWAP iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
