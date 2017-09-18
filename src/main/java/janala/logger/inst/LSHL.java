package janala.logger.inst;

public class LSHL extends Instruction {
  public LSHL(long tid,int iid, int mid) {
    super(tid,iid, mid);
  }
  
  public LSHL(int iid, int mid) {
	    super(iid, mid);
	  }

  public void visit(IVisitor visitor) {
    visitor.visitLSHL(this);
  }

  @Override
  public String toString() {
    return "LSHL iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
