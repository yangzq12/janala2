package janala.logger.inst;

public class LDIV extends Instruction {
  public LDIV(long tid,int iid, int mid) {
    super(tid,iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitLDIV(this);
  }
  
  public LDIV(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "LDIV iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
