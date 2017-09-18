package janala.logger.inst;

public class LMUL extends Instruction {
  public LMUL(long tid,int iid, int mid) {
    super(tid,iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitLMUL(this);
  }
  
  public LMUL(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "LMUL iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
