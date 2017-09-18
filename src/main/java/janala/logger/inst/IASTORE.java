package janala.logger.inst;

public class IASTORE extends Instruction {
  public IASTORE(long tid, int iid, int mid) {
    super(tid,iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitIASTORE(this);
  }
  
  public IASTORE(int iid, int mid) {
	    super(iid, mid);
	  }


  @Override
  public String toString() {
    return "IASTORE iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
