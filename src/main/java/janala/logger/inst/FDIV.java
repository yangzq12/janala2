package janala.logger.inst;

public class FDIV extends Instruction {
  public FDIV(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitFDIV(this);
  }

  public FDIV(int iid, int mid) {
	    super(iid, mid);
	  }
  @Override
  public String toString() {
    return "FDIV iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
