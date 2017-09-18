package janala.logger.inst;

public class DDIV extends Instruction {
  public DDIV(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitDDIV(this);
  }
  
  public DDIV(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "DDIV iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
