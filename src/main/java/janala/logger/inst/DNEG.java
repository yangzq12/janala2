package janala.logger.inst;

public class DNEG extends Instruction {
  public DNEG(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitDNEG(this);
  }
  
  public DNEG(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "DNEG iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
