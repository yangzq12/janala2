package janala.logger.inst;

public class SASTORE extends Instruction {
  public SASTORE(long tid,int iid, int mid) {
    super(tid,iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitSASTORE(this);
  }
  
  public SASTORE(int iid, int mid) {
	    super(iid, mid);
	  }


  @Override
  public String toString() {
    return "SASTORE iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
