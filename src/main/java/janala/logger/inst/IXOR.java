package janala.logger.inst;

public class IXOR extends Instruction {
  public IXOR(long tid,int iid, int mid) {
    super(tid,iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitIXOR(this);
  }
  
  public IXOR(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "IXOR iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
