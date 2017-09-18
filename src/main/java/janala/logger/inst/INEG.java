package janala.logger.inst;

public class INEG extends Instruction {
  public INEG(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitINEG(this);
  }
  
  public INEG(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "INEG iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
