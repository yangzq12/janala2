package janala.logger.inst;

public class LASTORE extends Instruction {
  public LASTORE(long tid,int iid, int mid) {
    super(tid,iid, mid);
  }
  
  public LASTORE(int iid, int mid) {
	    super(iid, mid);
	  }

  public void visit(IVisitor visitor) {
    visitor.visitLASTORE(this);
  }

  @Override
  public String toString() {
    return "LASTORE iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
