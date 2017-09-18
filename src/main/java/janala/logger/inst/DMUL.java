package janala.logger.inst;

public class DMUL extends Instruction {
  public DMUL(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitDMUL(this);
  }

  
  public DMUL(int iid, int mid) {
	    super(iid, mid);
	  }
  
 
  @Override
  public String toString() {
    return "DMUL iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
