package janala.logger.inst;

public class FASTORE extends Instruction {
  public FASTORE(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitFASTORE(this);
  }
  
  public FASTORE(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "FASTORE iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
