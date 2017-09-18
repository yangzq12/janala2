package janala.logger.inst;

public class FCMPG extends Instruction {
  public FCMPG(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitFCMPG(this);
  }
  
  public FCMPG(int iid, int mid) {
	    super(iid, mid);
	  }


  @Override
  public String toString() {
    return "FCMPG iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
