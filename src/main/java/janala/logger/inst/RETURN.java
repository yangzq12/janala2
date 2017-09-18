package janala.logger.inst;

public class RETURN extends Instruction {
  public RETURN(long tid,int iid, int mid) {
    super(tid,iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitRETURN(this);
  }
  
  public RETURN(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "RETURN iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
